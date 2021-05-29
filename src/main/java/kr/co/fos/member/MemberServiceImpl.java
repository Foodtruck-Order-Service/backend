package kr.co.fos.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired private MemberMapper MemberMapper;
	 

	@Override
	public boolean memberRegister(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Member> memberListInquiry(Member member) {

		List<Member> memberList = null;
		try {
			memberList = MemberMapper.list(member);
			
		} catch (Exception e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		return memberList;
	}

	@Override
	public Member memberDetailInquiry(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean memberUpdate(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean memberDelete(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean businessMemberAuth(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

}
