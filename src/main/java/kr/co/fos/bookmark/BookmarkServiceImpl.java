package kr.co.fos.bookmark;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookmarkServiceImpl implements BookmarkService {
	@Autowired 
	private BookmarkMapper bookmarkMapper;
	
	public boolean bookmarkRegister(Bookmark bookmark) {
		boolean result = false;
		
		try {
			bookmarkMapper.insert(bookmark);
			System.out.println("북마크 등록 서비스 접속");
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public List<Bookmark> bookmarkInquiry(Bookmark bookmark) {
		return null;
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
