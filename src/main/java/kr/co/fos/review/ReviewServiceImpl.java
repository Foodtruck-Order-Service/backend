package kr.co.fos.review;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.fos.photo.Photo;

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
	
	public void downloadFile(MultipartFile attach) {
		try {
			// 사진의 형식이 올바른지?
			String prefix = attach.getOriginalFilename();
			String subfix = prefix.split("[.]")[1];

			Photo photo = new Photo();
			photo.setLogicalName(attach.getOriginalFilename());
			photo.setPhysicalName(UUID.randomUUID().toString() + "_" + attach.getOriginalFilename());

			attach.transferTo(new File("D:\\image\\review" + File.separator + photo.getPhysicalName()));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
