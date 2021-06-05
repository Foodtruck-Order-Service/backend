package kr.co.fos.admin;

import java.util.List;

import kr.co.fos.foodtruck.Foodtruck;
import kr.co.fos.member.Member;

public interface AdminService {
	public boolean login(Member member);
	public List<Member> allMemberSelect(Member member);
	public boolean approvalUpdate(Member Member);
}
