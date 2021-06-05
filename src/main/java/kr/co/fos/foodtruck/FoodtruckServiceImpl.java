package kr.co.fos.foodtruck;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.fos.member.Member;
import kr.co.fos.member.MemberMapper;

@Service
public class FoodtruckServiceImpl implements FoodtruckService {

	@Autowired
	private FoodtruckMapper foodtruckMapper;
	@Autowired MemberMapper memberMapper;
	
	@Override
	public boolean foodtruckRegister(Member member) {
		boolean result = true;
		try {
			memberMapper.insert(member);
			if (result) {
				int memberNo = memberMapper.select(member).getNo();
				Foodtruck foodtruck = member.getFoodtruck();
				foodtruck.setMemberNo(memberNo);
				foodtruck.setApproval("N");
				foodtruck.setStatus("N");
				
				//푸드트럭 생성
				result =  foodtruckMapper.insert(foodtruck);
				//사진 생성
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<Foodtruck> foodtruckListInquiry(Foodtruck foodtruck) {
		try {
			foodtruck.setApproval("Y");
			List<Foodtruck> list = foodtruckMapper.list(foodtruck);
			
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Foodtruck foodtruckDetailInquiry(Foodtruck foodtruck) {
		Foodtruck foodtruckData = null;
		try {
			foodtruckData = foodtruckMapper.select(foodtruck);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return foodtruckData;
	}

	@Override
	public boolean foodtruckUpdate(Foodtruck foodtruck) {
		try {
			Foodtruck original = new Foodtruck();
			original.setNo(foodtruck.getNo());
			original = foodtruckMapper.select(original);
			
			if (foodtruck.getBrn() != original.getBrn()) {
				System.out.println("--");
				foodtruck.setApproval("N");
			} else {
				System.out.println("++");
				foodtruck.setBrn(null);
			}
			
			return foodtruckMapper.update(foodtruck);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean foodtruckDelete(Foodtruck foodtruck) {
		try {
			
			return foodtruckMapper.delete(foodtruck);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean foodtruckLocationRegister(Foodtruck foodtruck) {
		try {
			
			return foodtruckMapper.update(foodtruck);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public List<Foodtruck> foodtruckLocationInquiry(Foodtruck foodtruck) {
		try {
			List<Foodtruck> list = foodtruckMapper.listLocation(foodtruck);
			
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
