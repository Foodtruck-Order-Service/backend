package kr.co.fos.review;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/foodtruck/{fno}/review")
public class ReviewController {
	@PostMapping
	public ResponseEntity<Object> doReviewRegister(Review review, MultipartFile attach) {
		return null;
	}
	
	@GetMapping
	public ResponseEntity<Object> doReviewListInquiry(@PathVariable int fno) {
		return null;
	}
	
	@PutMapping("/{no}")
	public ResponseEntity<Object> doReviewUpdate(@PathVariable int fno, Review review, MultipartFile attach) {
		return null;
	}
	
	@DeleteMapping("/{no}")
	public ResponseEntity<Object> doReviewDelete(@PathVariable int fno, Review review) {
		return null;
	}
}
