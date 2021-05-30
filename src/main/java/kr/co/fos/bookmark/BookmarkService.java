package kr.co.fos.bookmark;

import java.util.List;

import kr.co.fos.foodtruck.Foodtruck;

public interface BookmarkService {
	public boolean bookmarkRegister(Bookmark bookmark);

	public List<Foodtruck> bookmarkInquiry(Bookmark bookmark);

	public boolean bookmarkDelete(Bookmark bookmark);
}
