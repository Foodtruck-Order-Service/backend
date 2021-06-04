package kr.co.fos.admin;

import org.springframework.beans.factory.annotation.Autowired;
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
	public ModelAndView login(Member member) {
		ModelAndView mav = null;
		boolean result = adminServiceImpl.login(member);
		if (result) {
			mav = new ModelAndView("/common/main");
		} else {
			mav = new ModelAndView("/admin/login");
		}
		return mav;
	}

}
