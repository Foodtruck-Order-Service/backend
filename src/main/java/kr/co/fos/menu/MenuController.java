package kr.co.fos.menu;

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
@RequestMapping("/foodtruck/{fno}/menu")
public class MenuController {
	@PostMapping
	public ResponseEntity<Object> doMenuRegister(@PathVariable int fno, Menu menu, MultipartFile attach) {
		return null;
	}
	
	@GetMapping
	public ResponseEntity<Object> doMenuListInquiry(@PathVariable int fno) {
		return null;
	}
	
	@GetMapping("/{no}")
	public ResponseEntity<Object> doMenuDetailInquiry(@PathVariable int fno, @PathVariable int no) {
		return null;
	}
	
	@PutMapping("/{no}")
	public ResponseEntity<Object> doMenuUpdate(@PathVariable int fno, Menu menu, MultipartFile attach) {
		return null;
	}
	
	@DeleteMapping("/{no}")
	public ResponseEntity<Object> doMenuDelete(@PathVariable int fno, @PathVariable int no) {
		return null;
	}
}
