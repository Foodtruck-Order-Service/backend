package kr.co.fos.review;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ReviewMapper reviewMapper;
	
	@Override
	public boolean reviewRegister(Review review) {
		System.out.println("리뷰 등록 서비스 들어옴" + review);
		try {
			reviewMapper.insert(review);
			
			return true;
		} catch (Exception e) {
		}
		
		return false;
	}
	
	//리뷰 상세 조회
	@Override
	public Review reviewDetailInquiry(Review review) {
		System.out.println("서비스 들어옴");
		
		try {
			System.out.println("서비스 에서 들어온 review 객체 : " + review);
			review = reviewMapper.select(review);
			
			return review;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
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
	public boolean reviewUpdate(Review review, MultipartFile attach) {
		System.out.println("서비스 들어옴");
		try {
			reviewMapper.update(review);
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean reviewDelete(int no) {
		System.out.println("서비스 들어옴");
		Review review = new Review();
		review.setNo(no);
		try {
			reviewMapper.delete(review);
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	// 이미지 출력
	@Override
	public byte[] photoView(Review review) throws Exception {
		String path = System.getProperty("user.home") + File.separator + "fosPhoto";
		String physical = reviewMapper.select(review).getPhysical();
		String imgPath = path + File.separator + physical;

		File file = new File(imgPath);

		if (file != null) {
			byte[] byteToFile = Files.readAllBytes(file.toPath());

			return byteToFile;
		}

		return null;
	}
}
