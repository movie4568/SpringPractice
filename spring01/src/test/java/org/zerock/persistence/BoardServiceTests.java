package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;
import org.zerock.service.BoardService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

@Log4j
public class BoardServiceTests {
	@Setter(onMethod_= {@Autowired})
	private BoardService service;
/*	
	@Test
	public void testRegister() {
		BoardDTO dto = new BoardDTO();
		dto.setTitle("새로 작성한 글2");
		dto.setContent("새로 작성한 내용2");
		dto.setWriter("user002");
		service.register(dto);
		log.info("생성된 게시물 번호:"+dto.getBno());
	}

	@Test
	public void testGet() {
		log.info(service.get(23L));
	}
	
	@Test
	public void testUpdate() {
		BoardDTO dto = service.get(23L);   //new BoardDTO();new 안해도 됨
		if(dto==null)
			return;
		dto.setTitle("제목 수정23번");
		log.info("MODIFY RESULT:"+service.modify(dto));

	
		
	}*/
	@Test
	public void testGetList() {
		//service.getList().forEach(board->log.info(board));
		service.getList(new Criteria(2,10)).forEach(board -> log.info(board));
	}
}
