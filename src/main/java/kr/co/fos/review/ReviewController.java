package kr.co.fos.review;

import java.util.List;

import javax.websocket.server.PathParam;

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
	
	/*
	 * @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE) public
	 * ResponseEntity<Object> doReviewRegister(
	 * 
	 * @RequestParam("image") MultipartFile image,
	 * 
	 * @RequestParam("memberNo") String memberNo,
	 * 
	 * @RequestParam("foodtruckNo") String foodtruckNo,
	 * 
	 * @RequestParam("grade") String grade,
	 * 
	 * @RequestParam("content") String content) {
	 * System.out.println("리뷰 등록 컨트롤러 들어옴::::::::::::::::::::::::::::::::::");
	 * Review review = new Review(); review.setMemberNo(Integer.parseInt(memberNo));
	 * review.setFoodtruckNo(Integer.parseInt(foodtruckNo)); review.setGrade(grade);
	 * review.setContent(content);
	 * 
	 * reviewServiceImpl.reviewRegister(review, image); return
	 * ResponseEntity.status(HttpStatus.OK).body("성공"); }
	 */
	@PostMapping
	public ResponseEntity<Object> doReviewRegister(@RequestBody Review review) {
		System.out.println("리뷰 등록 컨트롤러 들어옴::::::::::::::::::::::::::::::::::");
		
		System.out.println(review);
		/* reviewServiceImpl.reviewRegister(review, image); */
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
	public ResponseEntity<Object> doReviewDetailInquiry(@PathVariable("no") int memberNo, @PathParam("foodtruckNo")int foodtruckNo) {
		System.out.println("멤버 번호 : "  + memberNo);
		System.out.println("푸드트럭 번호 : "  + foodtruckNo);
		Review review = new Review();
		review.setMemberNo(memberNo);
		review.setFoodtruckNo(foodtruckNo);
		try {
			review = reviewServiceImpl.reviewDetailInquiry(review);
			System.out.println("리뷰상세조회 컨트롤러 : " + review);
			
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
	public ResponseEntity<Object> doReviewDelete(@PathVariable int no) {
		reviewServiceImpl.reviewDelete(no);
		return ResponseEntity.status(HttpStatus.OK).body("성공");
	}
}
