package kr.co.fos.foodtruck;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.fos.member.MemberMapper;

@Service
public class FoodtruckServiceImple implements FoodtruckService {

	@Autowired
	private FoodtruckMapper foodtruckMapper;
	
	@Override
	public boolean foodtruckRegister(Foodtruck foodtruck) {
		try {
			//푸드트럭 생성
			
			//사진 생성
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<Foodtruck> foodtruckListInquiry(Foodtruck foodtruck) {
		try {
			System.out.println("받음");
			List<Foodtruck> list = foodtruckMapper.list(foodtruck);
			
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Foodtruck foodtruckDetailInquiry(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean foodtruckUpdate(Foodtruck foodtruck) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean foodtruckDelete(Foodtruck foodtruck) {
		boolean result = false;
		try {
			foodtruckMapper.delete(foodtruck);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean foodtruckLocationRegister(Foodtruck foodtruck) {
		// TODO Auto-generated method stub
		return false;
	}

}
