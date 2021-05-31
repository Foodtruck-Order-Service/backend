package kr.co.fos.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	private MenuServiceImpl menuService;
	
	@PostMapping
	public ResponseEntity<Object> doMenuRegister(Menu menu) {
		return null;
	}
	
	@GetMapping
	public ResponseEntity<Object> doMenuListInquiry(Menu menu) {
		List<Menu> list = menuService.menuInquiry(menu);
		
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	@GetMapping("/{no}")
	public ResponseEntity<Object> doMenuDetailInquiry(Menu menu) {
		return null;
	}
	
	@PutMapping("/{no}")
	public ResponseEntity<Object> doMenuUpdate(Menu menu) {
		return null;
	}
	
	@DeleteMapping("/{no}")
	public ResponseEntity<Object> doMenuDelete(Menu menu) {
		return null;
	}
}
