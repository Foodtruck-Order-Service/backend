package kr.co.fos.bookmark;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.fos.foodtruck.Foodtruck;

public interface BookmarkService {
	public boolean bookmarkRegister(Bookmark bookmark);

	public List<Foodtruck> bookmarkInquiry(Bookmark bookmark);
	
	public Bookmark bookmarkDetailInquiry(Bookmark bookmark);

	public boolean bookmarkDelete(Bookmark bookmark);
}
