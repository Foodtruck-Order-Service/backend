package kr.co.fos.common;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.fos.member.Member;

@RestController
@RequestMapping("/common")
public class CommonController {
	@PostMapping("/login")
	public ResponseEntity<Object> doLogin(Member member) {
		return null;
	}
	
	@PostMapping("/idfind")
	public ResponseEntity<Object> doIdFind(Member member) {
		return null;
	}
	
	@PostMapping("/pwfind")
	public ResponseEntity<Object> doPasswordFind(Member member) {
		return null;
	}
}
