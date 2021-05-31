package kr.co.fos.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired private MemberMapper memberMapper;
	 

	@Override
	public boolean memberRegister(Member member) {
		boolean result = false;
		try {
			memberMapper.insert(member);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Member> memberListInquiry(Member member) {

		List<Member> memberList = null;
		try {
			memberList = memberMapper.list(member);
			
		} catch (Exception e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		return memberList;
	}

	@Override
	public Member memberDetailInquiry(Member member) {
		Member memberData = null;
		try {
			memberData = memberMapper.select(member);
			
		} catch (Exception e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		return memberData;
	}

	@Override
	public boolean memberUpdate(Member member) {
		boolean result = false;
		try {
			memberMapper.update(member);
			result = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean memberDelete(Member member) {
		boolean result = false;
		try {
			memberMapper.delete(member);
			result = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean businessMemberAuth(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

}
