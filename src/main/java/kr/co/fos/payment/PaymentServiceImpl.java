package kr.co.fos.payment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import kr.co.fos.order.Order;
import kr.co.fos.order.OrderMapper;


@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	OrderMapper orderMapper;
	// 결제 토큰 획득
	public String getToken(String requestURL) throws Exception {
		String token = null;
		JsonObject object = new JsonObject();
		object.addProperty("imp_key", "8179494056168897");
		object.addProperty("imp_secret",
				"tA6YLywAJgxdb1gIEmkvchgvumlP784AJazuJ55slCGxEWfijzNvR41lqnayve8fpIK8OPB9shG6eVox");

		String requestString = "";
		URL url = new URL(requestURL);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoOutput(true);
		connection.setDoInput(true);
		connection.setInstanceFollowRedirects(false);
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");

		OutputStream out = connection.getOutputStream();
		out.write(object.toString().getBytes());
		connection.connect();

		StringBuilder stringBuilder = new StringBuilder();

		if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
			String line = null;
			
			while ((line = bufferedReader.readLine()) != null) {
				stringBuilder.append(line + "\n");
			}

			bufferedReader.close();
			requestString = stringBuilder.toString();
		}
		out.flush();
		connection.disconnect();

		JsonParser jsonParser = new JsonParser();
		JsonElement jsonElement = jsonParser.parse(requestString);

		if (jsonElement.getAsJsonObject().get("code").getAsLong() == 0) {
			JsonObject response = (JsonObject) jsonElement.getAsJsonObject().get("response");
			token = response.get("access_token").getAsString();
		}

		return token;
	}
	
	// 결제 취소
	public void cancelPayment(Order order, String token) {
		HttpURLConnection connection = null;
		BufferedReader bufferedReader = null;
		JsonObject object = new JsonObject();

		try {
			order = orderMapper.select(order);
			System.out.println(order.toString());
			System.out.println(token);
			object.addProperty("merchant_uid", order.getMerchantUid());

			URL url = new URL("https://api.iamport.kr/payments/cancel");
			connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setRequestProperty("Authorization", token);
			
			OutputStream out = connection.getOutputStream();
			out.write(object.toString().getBytes());
			connection.connect();

			StringBuilder stringBuilder = new StringBuilder();

			if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
				bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
				String line = null;
				while ((line = bufferedReader.readLine()) != null) {
					stringBuilder.append(line + "\n");
				}
			}

			out.flush();
			Order updateOrder = new Order();
			updateOrder.setNo(order.getNo());
			updateOrder.setStatus("N");
			orderMapper.update(updateOrder);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}

				if (connection != null) {
					connection.disconnect();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
