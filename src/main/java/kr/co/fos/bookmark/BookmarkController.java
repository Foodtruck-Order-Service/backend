package kr.co.fos.bookmark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookmark")
public class BookmarkController {
	@Autowired
	private BookmarkServiceImpl bookmarkServiceImpl;
	
	@PostMapping
	public ResponseEntity<Object> doBookmarkRegister(@RequestBody Bookmark bookmark) {
		try {
			System.out.println(bookmark.getFoodtruckNo()); 
			System.out.println(bookmark.getMemberNo()); 
			bookmarkServiceImpl.bookmarkRegister(bookmark);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.OK).body("응답 성공");
	}
	
	@GetMapping
	public ResponseEntity<Object> doBookmarkInquiry(Bookmark bookmark) {
		System.out.println("북마크 컨트롤러 접속");
		return null;
	}
	
	@DeleteMapping
	public ResponseEntity<Object> doBookmarkDelete(@RequestBody Bookmark bookmark) {
		
		bookmarkServiceImpl.bookmarkDelete(bookmark);
		return null;
	}
}
