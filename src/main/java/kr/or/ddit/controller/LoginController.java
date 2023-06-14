package kr.or.ddit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	private static final Logger log = LoggerFactory.getLogger(LoginController.class);
	
	
	// 에러가 발생 하거나 로그아웃이 발생했을떄 해당 URI로 요청이 전달되는데
	// 이떄 error정보의 logout 정보를 활용하도록 합니다.
	@GetMapping("/login")
	public String loginForm(Model model,String logout, String error) {
		log.info("loginForm 실행!!!!!!!!!!!!!!!");
		log.info("error : " + error);
		log.info("logout : " + logout);
		
		if (error != null) {
			model.addAttribute("error", "Login Error");
		}
		if (logout != null) {
			model.addAttribute("logout", "Logout!");
		}
		
		return "loginForm";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "logoutForm";
	}
}
