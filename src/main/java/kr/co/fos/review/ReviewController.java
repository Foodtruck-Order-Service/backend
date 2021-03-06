package kr.co.fos.review;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/review")
public class ReviewController {
	@Autowired
	private ReviewServiceImpl reviewServiceImpl;
	
	@PostMapping
	public ResponseEntity<Object> doReviewRegister(@RequestPart Review review, @RequestPart MultipartFile image) {
		String physicalName = UUID.randomUUID().toString() + "_" + image.getOriginalFilename();
		review.setLogical(image.getOriginalFilename());
		review.setPhysical(physicalName);
		
		reviewServiceImpl.reviewRegister(review); 
		try {
			 image.transferTo(new File(System.getProperty("user.home") + File.separator + "fosPhoto/" + physicalName));
         } catch (IllegalStateException | IOException e) {
             e.printStackTrace();
         }
		 
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
		Review review = new Review();
		review.setMemberNo(memberNo);
		review.setFoodtruckNo(foodtruckNo);
		try {
			review = reviewServiceImpl.reviewDetailInquiry(review);
			
			return ResponseEntity.status(HttpStatus.OK).body(review);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@PutMapping("/{no}")
	public ResponseEntity<Object> doReviewUpdate(@PathVariable("no") int no, @RequestBody Review review, MultipartFile attach) {
		review.setNo(no);
		reviewServiceImpl.reviewUpdate(review, attach);
		
		return ResponseEntity.status(HttpStatus.OK).body("성공");
	}
	
	@DeleteMapping("/{no}")
	public ResponseEntity<Object> doReviewDelete(@PathVariable int no) {
		reviewServiceImpl.reviewDelete(no);
		
		return ResponseEntity.status(HttpStatus.OK).body("성공");
	}
	
	// 이미지 출력
	@GetMapping(value = "/photo/{no}", produces = MediaType.IMAGE_JPEG_VALUE)
	public @ResponseBody byte[] photoView(@PathVariable int no) {
		Review review = new Review();
		review.setNo(no);
		try {
			byte[] byteToFile = reviewServiceImpl.photoView(review);
			
			return byteToFile;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
