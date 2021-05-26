package kr.co.fos.sales;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales")
public class salesController {
	@GetMapping("/{no}")
	public ResponseEntity<Object> doSalesInquiry(@PathVariable int no, Date start, Date end) {
		return null;
	}
}
