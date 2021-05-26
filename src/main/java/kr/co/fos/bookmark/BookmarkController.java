package kr.co.fos.bookmark;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.fos.member.Member;

@RestController
@RequestMapping("/bookmark")
public class BookmarkController {
	@PostMapping
	public ResponseEntity<Object> doBookmarkRegister(Bookmark bookmark) {
		return null;
	}
	
	@GetMapping("/{no}")
	public ResponseEntity<Object> doBookmarkInquiry(Member member) {
		return null;
	}
	
	@DeleteMapping("/{no}")
	public ResponseEntity<Object> doBookmarkDelete(Bookmark bookmark) {
		return null;
	}
}
