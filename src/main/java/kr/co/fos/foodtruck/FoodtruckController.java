package kr.co.fos.foodtruck;

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
import org.springframework.web.bind.annotation.RestController;

import kr.co.fos.member.Member;

@RestController
@RequestMapping("/foodtruck")
public class FoodtruckController {
	@Autowired
	private FoodtruckServiceImpl foodtruckService;
	
	@PostMapping
	public ResponseEntity<Object> doFoodtruckRegister(@RequestBody Member member) {
		boolean result = true;
		result = foodtruckService.foodtruckRegister(member);
		
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@GetMapping
	public ResponseEntity<Object> doFoodTruckListInquiry(Foodtruck foodtruck) {
		List<Foodtruck> list = foodtruckService.foodtruckListInquiry(foodtruck);
		
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	@GetMapping("/{no}")
	public ResponseEntity<Object> doFoodTruckDeatilInquiry(Foodtruck foodtruck) {
		Foodtruck foodtruckdata = foodtruckService.foodtruckDetailInquiry(foodtruck);
		return ResponseEntity.status(HttpStatus.OK).body(foodtruckdata);
	}
	
	//추가
	@GetMapping("/business/{memberNo}")
	public ResponseEntity<Object> doFoodTruckBusinessDeatilInquiry(Foodtruck foodtruck) {
		Foodtruck foodtruckdata = foodtruckService.foodtruckDetailInquiry(foodtruck);
		return ResponseEntity.status(HttpStatus.OK).body(foodtruckdata);
	}
	
	@PutMapping("/{no}")
	public ResponseEntity<Object> doFoodTruckUpdate(@PathVariable int no, @RequestBody Foodtruck foodtruck) {
		boolean result = foodtruckService.foodtruckUpdate(foodtruck);
		
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@DeleteMapping("/{no}")
	public ResponseEntity<Object> doFoodTruckDelete(Foodtruck foodtruck) {
		return null;
	}
	
	@PutMapping("/{no}/location")
	public ResponseEntity<Object> doFoodtruckLocationRegister(@RequestBody Foodtruck foodtruck) {
		boolean result = foodtruckService.foodtruckLocationRegister(foodtruck);
		
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@GetMapping("/location")
	public ResponseEntity<Object> doFoodtruckLocationInquiry(Foodtruck foodtruck) {
		List<Foodtruck> result = foodtruckService.foodtruckLocationInquiry(foodtruck);
		
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
}
