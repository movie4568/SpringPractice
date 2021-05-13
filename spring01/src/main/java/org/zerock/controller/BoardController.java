package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardDTO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageDTO;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {
	private BoardService service;
/*	@GetMapping("/list")
	public void list(Model model) {
		log.info("list.....");
		model.addAttribute("list",service.getList());
	}
	*/
	@GetMapping("/list")
	public void list(Criteria cri, Model model) {
		log.info("list: "+cri);
		model.addAttribute("list",service.getList(cri));//모델에 담긴 내용을 요청 페이지에
		model.addAttribute("pageMaker",new PageDTO(cri, 123));
		
	}
	
	@GetMapping("/register")
	public void register() {
		
	}
	@PostMapping("/register")
		//DB로 저장해야됨
	public String register(BoardDTO board, RedirectAttributes rttr) {   //RedirectAttributes=일회성
		log.info("register:"+board);
		service.register(board);
		rttr.addFlashAttribute("result", board.getBno());
		return "redirect:/board/list"; //재전송해라
		
	}
	/*
	@GetMapping("/get")
	public void get(@RequestParam("bno")Long bno,Model model) {
		log.info("/get");
		model.addAttribute("board",service.get(bno));
	}
	*/
	@GetMapping({"/get","/modify"})
	public void get(@RequestParam("bno")Long bno, Model model) {
		log.info("/get or/modify");
		model.addAttribute("board", service.get(bno));
	}
	@PostMapping("/modify")
	public String modify(BoardDTO board, RedirectAttributes rttr){
		log.info("modify..MMMM"+board);
		if(service.modify(board)) {
			rttr.addFlashAttribute("result","success");
		}
		return "redirect:/board/list";
	}

}
