package kr.co.fos.foodtruck;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/foodtruck")
public class FoodtruckController {
	@PostMapping
	public ResponseEntity<Object> doFoodtruckRegister(Foodtruck foodtruck, @RequestParam MultipartFile attach) {
		return null;
	}
	
	@GetMapping
	public ResponseEntity<Object> doFoodTruckListInquiry(Foodtruck foodtruck) {
		return null;
	}
	
	@GetMapping("/{no}")
	public ResponseEntity<Object> doFoodTruckDeatilInquiry(Foodtruck foodtruck) {
		return null;
	}
	
	@PutMapping("/{no}")
	public ResponseEntity<Object> doFoodTruckDeatilInquiry(Foodtruck foodtruck, @RequestParam MultipartFile attach) {
		return null;
	}
	
	@DeleteMapping("/{no}")
	public ResponseEntity<Object> doFoodTruckDelete(Foodtruck foodtruck) {
		return null;
	}
	
	@PostMapping("/{no}/location")
	public ResponseEntity<Object> doFoodtruckLocationRegister(Foodtruck foodtruck) {
		return null;
	}
}
