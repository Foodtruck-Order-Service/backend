package kr.co.fos.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.co.fos.member.Member;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminServiceImpl adminServiceImpl;

	@GetMapping("/login")
	public ModelAndView loginMain() {
		ModelAndView mav = new ModelAndView("/admin/login");
		return mav;
	}

	// 로그인
	@PostMapping("/login")
	public ModelAndView login(Member member, HttpServletRequest request) {
		HttpSession session = request.getSession();
		ModelAndView mav = null;
		boolean result = adminServiceImpl.login(member);
		if (result) {
			mav = new ModelAndView("/admin/list");
			session.setAttribute("member", "Y");
		} else {
			mav = new ModelAndView("/admin/login");
		}
		return mav;
	}
	
	//로그아웃
	@GetMapping("/logout")
	public ModelAndView logout() {
		ModelAndView mav = new ModelAndView("/admin/login");
		return mav;
	}
	
	@GetMapping()
	public ResponseEntity<List<Member>> memberInfo(Member member) {
		
		List<Member> memberList = adminServiceImpl.allMemberSelect(member);
		return ResponseEntity.status(HttpStatus.OK).body(memberList);
	}
	
	@GetMapping("/approval")
	public ModelAndView approval(Member member) {
		ModelAndView mav = new ModelAndView("/admin/list");
		adminServiceImpl.approvalUpdate(member);
		return mav;
	}

}
