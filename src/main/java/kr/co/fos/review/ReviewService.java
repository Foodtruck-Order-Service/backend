package kr.co.fos.review;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface ReviewService {
	public boolean reviewRegister(Review review, MultipartFile attach);
	public List<Review> reviewListInquiry(Review review);
	public boolean reviewUpdate(Review review, MultipartFile attach);
	public boolean reviewDelete(Review review);
}
