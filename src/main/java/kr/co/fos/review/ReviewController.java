package kr.co.fos.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/review")
public class ReviewController {
	@Autowired
	private ReviewServiceImpl reviewServiceImpl;
	
	@PostMapping
	public ResponseEntity<Object> doReviewRegister(Review review, MultipartFile attach) {
		return null;
	}
	
	@GetMapping
	public ResponseEntity<Object> doReviewListInquiry(@RequestParam int no) {
		System.out.println("푸드트럭 번호 : "  + no);
		try {
			List<Review> reviews = reviewServiceImpl.reviewListInquiry(no);
			System.out.println(reviews);
			
			return ResponseEntity.status(HttpStatus.OK).body(reviews);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@PutMapping("/{no}")
	public ResponseEntity<Object> doReviewUpdate(Review review, MultipartFile attach) {
		return null;
	}
	
	@DeleteMapping("/{no}")
	public ResponseEntity<Object> doReviewDelete(Review review) {
		return null;
	}
}
