package kr.co.fos.bookmark;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.fos.foodtruck.Foodtruck;
import kr.co.fos.foodtruck.FoodtruckMapper;

@Service
public class BookmarkServiceImpl implements BookmarkService {
	@Autowired 
	private BookmarkMapper bookmarkMapper;
	@Autowired
	private FoodtruckMapper foodtruckMapper;
	
	public boolean bookmarkRegister(Bookmark bookmark) {
		boolean result = false;
		
		try {
			bookmarkMapper.insert(bookmark);
			System.out.println("북마크 등록 서비스 접속");
			result = true;
		} catch (Exception e) {
		}
		
		return result;
	}
	
	public List<Foodtruck> bookmarkInquiry(Bookmark bookmark) {
		try {
			List<Foodtruck> bookmarks = bookmarkMapper.list(bookmark);
			System.out.println("북마크 조회 서비스======" + bookmarks);
			return bookmarks;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Bookmark bookmarkDetailInquiry(Bookmark bookmark) {
		System.out.println("북마크 조회 서비스");
		try {
			bookmark = bookmarkMapper.select(bookmark);
			
			return bookmark;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookmark;
	}
	
	public boolean bookmarkDelete(Bookmark bookmark) {
		boolean result = false;

		try {
			bookmarkMapper.delete(bookmark);
			System.out.println("북마크 삭제 서비스 접속");
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}
