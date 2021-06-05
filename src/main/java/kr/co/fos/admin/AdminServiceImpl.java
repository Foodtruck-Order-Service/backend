package kr.co.fos.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.fos.foodtruck.Foodtruck;
import kr.co.fos.foodtruck.FoodtruckMapper;
import kr.co.fos.member.Member;
import kr.co.fos.member.MemberMapper;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	AdminMapper adminMapper;
	@Autowired
	FoodtruckMapper foodtruckMapper;
	public boolean login(Member member) {
		boolean result = false;
		try {
			member = memberMapper.select(member);
			String type = member.getType();
			if(type.equals("A")) {
				result = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public List<Member> allMemberSelect(Member member) {
		List<Member> allMemberList = null;
		try {
			allMemberList = adminMapper.selectAllMember(member);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allMemberList;
	}
	
	public boolean approvalUpdate(Member member) {
		boolean result = false;
		
		try {
			Foodtruck foodtruck = new Foodtruck();
			foodtruck.setMemberNo(member.getNo());
			foodtruck = foodtruckMapper.select(foodtruck);
			if(foodtruck.getApproval().equals("N")) {
				foodtruck.setApproval("Y");
				adminMapper.foodtruckUpdate(foodtruck);
				result = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
