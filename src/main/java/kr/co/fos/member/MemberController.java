package kr.co.fos.member;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {
	@PostMapping
	public ResponseEntity<Object> doMemberRegister(Member member) {
		return null;
	}
	
	@GetMapping
	public ResponseEntity<Object> doMemberListInquiry(Member member) {
		return null;
	}
	
	@GetMapping("/{no}")
	public ResponseEntity<Object> doMemberDetailInquiry(Member member) {
		return null;
	}
	
	@PutMapping("/{no}")
	public ResponseEntity<Object> doMemberUpdate(Member member) {
		return null;
	}
	
	@DeleteMapping("/{no}")
	public ResponseEntity<Object> doMemberDelete(Member member) {
		return null;
	}
	
	@PutMapping("/{no}/business")
	public ResponseEntity<Object> doBusinessAuth(Member member) {
		return null;
	}
}
