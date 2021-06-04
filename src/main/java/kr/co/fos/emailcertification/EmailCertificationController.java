package kr.co.fos.emailcertification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailCertificationController {
	@Autowired
	private EmailCertificationServiceImpl emailCertificationServiceImpl;

	// 인증 이메일 전송
	@PostMapping
	public String sendEmail(@RequestBody String email) {
		if (email != null) {
			String code = emailCertificationServiceImpl.certifiedCodeSend(email);
			
			return code;
		}
		
		return null;
	}
}