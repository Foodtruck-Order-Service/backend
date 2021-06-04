package kr.co.fos.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.fos.member.Member;
import kr.co.fos.member.MemberMapper;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	MemberMapper memberMapper;
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
}
