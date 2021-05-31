package kr.co.fos.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberServiceImpl memberServiceImpl;
	
	@PostMapping
	public ResponseEntity<Object> doMemberRegister(@RequestBody Member member) {
		boolean result = memberServiceImpl.memberRegister(member);
		
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@GetMapping
	public ResponseEntity<Object> doMemberListInquiry(Member member) {
		List<Member> memberList = memberServiceImpl.memberListInquiry(member);
		
		return ResponseEntity.status(HttpStatus.OK).body(memberList);
	}
	
	@GetMapping("/{no}")
	public ResponseEntity<Object> doMemberDetailInquiry(Member member) {
		Member memberData = memberServiceImpl.memberDetailInquiry(member);
		
		return ResponseEntity.status(HttpStatus.OK).body(memberData);
	}
	
	@PutMapping("/{no}")
	public ResponseEntity<Object> doMemberUpdate(@PathVariable int no, @RequestBody Member member) {
		member.setNo(no);
		boolean result = memberServiceImpl.memberUpdate(member);
		return ResponseEntity.status(HttpStatus.OK).body(result);
		
	}
	
	@DeleteMapping("/{no}")
	public ResponseEntity<Object> doMemberDelete(@PathVariable int no) {
		Member member = new Member();
		member.setNo(no);
		boolean result = memberServiceImpl.memberDelete(member);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@PutMapping("/{no}/business")
	public ResponseEntity<Object> doBusinessAuth(Member member) {
		return null;
	}
}
