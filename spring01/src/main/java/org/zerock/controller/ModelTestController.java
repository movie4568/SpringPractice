package org.zerock.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test/")
public class ModelTestController {
	//@GetMapping()이거 써도 됨
	@RequestMapping(value="/main1.do",method = RequestMethod.GET)
	public String main1(Model model) {
		model.addAttribute("msg","Message");
		
		
		
		return "/test/result";
		
	}
	@RequestMapping(value="/test/login2.do",method = {RequestMethod.GET,RequestMethod.POST})
//	public String login2(HttpServletRequest request,Model model) throws UnsupportedEncodingException {
//		request.setCharacterEncoding("utf-8");
		
	public String login2(@RequestParam("userID")String userID
						,@RequestParam("userName")String userName
						,Model model) throws UnsupportedEncodingException {
//		request.setCharacterEncoding("utf-8");
		
//		String userID = request.getParameter("userID");
//		String userName = request.getParameter("userName");
		
		System.out.println("userID:" + userID);
		System.out.println("userName:" + userName);
		
		model.addAttribute("userID", userID);
		model.addAttribute("userName", userName);
		
		return "/test/loginResult";
	}
}
