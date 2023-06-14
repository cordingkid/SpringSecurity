package kr.or.ddit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/notice")
public class NoticeController {

	private static final Logger log = LoggerFactory.getLogger(NoticeController.class);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list() {
		log.info("list() 실행...!");
		return "notice/list";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerForm() {
		log.info("registerForm() 실행...!");
		return "notice/register";
	}
}
