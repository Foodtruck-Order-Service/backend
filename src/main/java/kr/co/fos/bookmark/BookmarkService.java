package kr.co.fos.bookmark;

import java.util.List;

public interface BookmarkService {
	public boolean bookmarkRegister(Bookmark bookmark);
	
	public List<Bookmark> bookmarkInquiry(Bookmark bookmark);
	
	public boolean bookmarkDelete(Bookmark bookmark);
}
