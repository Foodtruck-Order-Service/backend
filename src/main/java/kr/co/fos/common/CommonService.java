package kr.co.fos.common;

import java.util.List;

import kr.co.fos.member.Member;

public interface CommonService {
	public Member login(Member member);
	public Member memberIdFind(Member member);
	public Member memberPasswordFine(Member member);
}
