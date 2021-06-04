package kr.co.fos.payment;

import kr.co.fos.order.Order;

public interface PaymentService {
	// 결제 토큰 획득
		public String getToken(String requestURL) throws Exception;

		// 결제 취소
		public void cancelPayment(Order order, String token);
}
