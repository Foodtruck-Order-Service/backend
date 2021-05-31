package kr.co.fos.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/review")
public class ReviewController {
	@Autowired
	private ReviewServiceImpl reviewServiceImpl;
	
	@PostMapping
	public ResponseEntity<Object> doReviewRegister(@RequestBody Review review, MultipartFile attach) {
		System.out.println("컨트롤러 들어옴");
		reviewServiceImpl.reviewRegister(review, attach);
		return ResponseEntity.status(HttpStatus.OK).body("성공");
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
	
	//리뷰 상세조회
	@GetMapping("/{no}")
	public ResponseEntity<Object> doReviewDetailInquiry(@PathVariable int no) {
		System.out.println("리뷰 번호 : "  + no);
		try {
			Review review = reviewServiceImpl.reviewDetailInquiry(no);
			System.out.println(review);
			
			return ResponseEntity.status(HttpStatus.OK).body(review);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@PutMapping("/{no}")
	public ResponseEntity<Object> doReviewUpdate(@PathVariable("no") int no, @RequestBody Review review, MultipartFile attach) {
		System.out.println("수저ㅏㅇ 컨트롤러 들어옴" + review);
		review.setNo(no);
		reviewServiceImpl.reviewUpdate(review, attach);
		return ResponseEntity.status(HttpStatus.OK).body("성공");
	}
	
	@DeleteMapping("/{no}")
	public ResponseEntity<Object> doReviewDelete(Review review) {
		return null;
	}
}
