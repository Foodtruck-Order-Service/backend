package kr.co.fos.photo;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/photo")
public class PhotoController {
	@GetMapping("/foodtruck/{no}")
	public void doFoodtruckPhotoInquiry(@PathVariable int no, HttpServletResponse response) {
		
	}
	
	@GetMapping("/menu/{no}")
	public void doMenuPhotoInquiry(@PathVariable int no, HttpServletResponse response) {
		
	}
	
	@GetMapping("/review/{no}")
	public void doReviewPhotoInquiry(@PathVariable int no, HttpServletResponse response) {
		
	}
}
