package kr.co.fos.member;

import java.util.List;

public interface MemberService {
	public boolean memberRegister(Member member);
	public List<Member> memberListInquiry();
	public Member memberDetailInquiry(int no);
	public boolean memberUpdate(int no, Member member);
	public boolean memberDelete(int no);
	public List<Member> memberSearch(String string);
	public boolean businessMemberAuth(int no, Member member);
}
