package kr.co.fos.member;

import java.util.List;

public interface MemberService {
	public boolean memberRegister(Member member);
	public List<Member> memberListInquiry(Member member);
	public Member memberDetailInquiry(Member member);
	public boolean memberUpdate(Member member);
	public boolean memberDelete(Member member);
	public boolean businessMemberAuth(Member member);
}
