package kr.co.fos.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ReviewMapper reviewMapper;
	
	@Override
	public boolean reviewRegister(Review review, MultipartFile attach) {
		
		return false;
	}

	@Override
	public List<Review> reviewListInquiry(int no) {
		Review review = new Review();
		
		try {
			review.setFoodtruckNo(no);
			List<Review> reviews = reviewMapper.list(review);
			
			return reviews;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean reviewUpdate(int no, MultipartFile attach) {
		return false;
	}

	@Override
	public boolean reviewDelete(int no) {
		return false;
	}
	
}
