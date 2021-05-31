package kr.co.fos.review;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface ReviewService {
	public boolean reviewRegister(Review review, MultipartFile attach);
	public List<Review> reviewListInquiry(int no);
	public Review reviewDetailInquiry(int no);
	public boolean reviewUpdate(Review review, MultipartFile attach);
	public boolean reviewDelete(int no);
}
