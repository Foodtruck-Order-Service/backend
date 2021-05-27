package kr.co.fos.sales;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.fos.order.Order;

@RestController
@RequestMapping("/sales")
public class salesController {
	@GetMapping
	public ResponseEntity<Object> doSalesInquiry(Order order) {
		return null;
	}
}
