package kr.co.fos.order;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.fos.foodtruck.Foodtruck;

@RestController
@RequestMapping("/order")
public class OrderController {
	@PostMapping
	public ResponseEntity<Object> doOrderRegister(Order order) {
		return null;
	}
	
	@GetMapping
	public ResponseEntity<Object> doOrderListInquiry(Order order) {
		return null;
	}
	
	@GetMapping("/{no}")
	public ResponseEntity<Object> doOrderDetailInquiry(Order order) {
		return null;
	}
	
	@PutMapping("/{no}")
	public ResponseEntity<Object> doOrderStatusUpdate(Order order) {
		return null;
	}
	
	@DeleteMapping("/{no}/{mno}")
	public ResponseEntity<Object> doOrderCancle(Order order, @PathVariable int mno) {
		return null;
	}
	
	@DeleteMapping("/{no}/cancle")
	public ResponseEntity<Object> doOrderCancleAuth(Order order) {
		return null;
	}
	
	@PostMapping("/{no}/payment")
	public ResponseEntity<Object> doPayment(Order order) {
		return null;
	}
	
	@GetMapping("/{no}/payment")
	public ResponseEntity<Object> doPaymentCancle(Order order) {
		return null;
	}
	
	@GetMapping("/time/{no}")
	public ResponseEntity<Object> doWaitTimeInquiry(Foodtruck foodtruck) {
		return null;
	}
}
