package kr.co.fos.bookmark;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookmark")
public class BookmarkController {
	@PostMapping
	public ResponseEntity<Object> doBookmarkRegister(Bookmark bookmark) {
		return null;
	}
	
	@GetMapping("/{no}")
	public ResponseEntity<Object> doBookmarkInquiry(@PathVariable int no) {
		return null;
	}
	
	@DeleteMapping("/{no}")
	public ResponseEntity<Object> doBookmarkDelete(@PathVariable int no) {
		return null;
	}
}
