package kr.co.fos.payment;

import java.time.LocalDate;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.fos.order.Order;



@Controller
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private PaymentServiceImpl paymentServiceImpl;

	// 결제 취소
	@GetMapping("/cancel")
	public ResponseEntity<Object> cancelPayment(Order order) {
		boolean result = false;
		try {
			String token = null;
			token = paymentServiceImpl.getToken("https://api.iamport.kr/users/getToken");
			paymentServiceImpl.cancelPayment(order, token);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
}