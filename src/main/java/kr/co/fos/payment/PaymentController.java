package kr.co.fos.payment;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.fos.member.Member;
import kr.co.fos.member.MemberServiceImpl;
import kr.co.fos.order.Order;

@Controller
@RequestMapping("/payment")
public class PaymentController {
	
}
