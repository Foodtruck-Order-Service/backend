package kr.co.fos.bookmark;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.fos.foodtruck.Foodtruck;

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
	public ResponseEntity<Object> doBookmarkInquiry(@PathParam("memberNo") int memberNo, @PathParam("foodtruckNo") int foodtruckNo) {
		System.out.println("북마크 조회하기 컨트롤러 접속");
		Bookmark bookmark = new Bookmark();
		bookmark.setMemberNo(memberNo);
		
		if(foodtruckNo != 0) {
			bookmark.setFoodtruckNo(foodtruckNo);
			bookmark = bookmarkServiceImpl.bookmarkDetailInquiry(bookmark);
			System.out.println(bookmark);
			return ResponseEntity.status(HttpStatus.OK).body(bookmark); 
		} else {
			List<Foodtruck> bookmarks = bookmarkServiceImpl.bookmarkInquiry(bookmark);
			
			return ResponseEntity.status(HttpStatus.OK).body(bookmarks);
		}
	}
	
	@DeleteMapping
	public ResponseEntity<Object> doBookmarkDelete(@RequestBody Bookmark bookmark) {
		
		bookmarkServiceImpl.bookmarkDelete(bookmark);
		return null;
	}
}
