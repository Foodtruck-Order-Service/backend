package kr.co.fos.foodtruck;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kr.co.fos.member.Member;

@RestController
@RequestMapping("/foodtruck")
public class FoodtruckController {
	@Autowired
	private FoodtruckServiceImple foodtruckService;
	
	@PostMapping
	public ResponseEntity<Object> doFoodtruckRegister(@RequestBody Member member) {
		
		// 1. memberServiece.memberRegister(member);
		foodtruckService.foodtruckRegister(member.getFoodtruck());
		
		foodtruckService.foodtruckRegister(new Foodtruck());
		
		return ResponseEntity.status(HttpStatus.OK).body(member);
	}
	
	@GetMapping
	public ResponseEntity<Object> doFoodTruckListInquiry(Foodtruck foodtruck) {
//		Foodtruck foodtruck = new Foodtruck();
//		foodtruck.setName(name);
		List<Foodtruck> list = foodtruckService.foodtruckListInquiry(foodtruck);
		
		return ResponseEntity.status(HttpStatus.OK).body(list);
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
