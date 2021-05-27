package kr.co.fos;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import kr.co.fos.member.Member;

@RestController
public class HomeController {
	@RequestMapping(value= "/test", method = {RequestMethod.POST})
	public ModelAndView androidPage(HttpServletRequest request, Member member) {
		System.out.println("서버에서 안드로이드 접속 요청함");
		try{
				String androidID = member.getId();
				String androidPW = member.getPassword();
				System.out.println("안드로이드에서 받아온 id =  " + androidID);
				System.out.println("안드로이드에서 받아온 pw =  " + androidPW);
				
				ModelAndView mav = new ModelAndView("android");
				mav.addObject("android", androidID);
				return mav;
		}catch (Exception e){
				e.printStackTrace();
				return new ModelAndView();
		}
	}
	
	@RequestMapping(value= "/android", method = {RequestMethod.POST})
	public ResponseEntity<Object> androidJson(HttpServletRequest request, Member member) {
		System.out.println("서버에서 안드로이드 접속 요청함");
		try{
				String androidID = member.getId();
				String androidPW = member.getPassword();
				System.out.println("안드로이드에서 받아온 id : " + androidID);
				System.out.println("안드로이드에서 받아온 pw : " + androidPW);
				
				Gson gson = new Gson();
				String result = gson.toJson(member);
				
				//System.out.println(gson);
				
				return ResponseEntity.status(HttpStatus.OK).body(result);
		}catch (Exception e){
				e.printStackTrace();
				return null;
		}
	}
	
	@RequestMapping(value= "/", method = {RequestMethod.GET})
	public String index() {
				return "index";
		}
}
