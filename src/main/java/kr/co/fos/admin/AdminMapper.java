package kr.co.fos.admin;

import java.util.List;

import kr.co.fos.foodtruck.Foodtruck;
import kr.co.fos.member.Member;

public interface AdminMapper {
	public List<Member> selectAllMember(Member member);
	public boolean foodtruckUpdate(Foodtruck foodtruck);
}
