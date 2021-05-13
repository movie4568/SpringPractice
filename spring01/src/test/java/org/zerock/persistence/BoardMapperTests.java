package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

@Log4j
public class BoardMapperTests {
	@Setter(onMethod_ = {@Autowired})
	private BoardMapper boardMapper;
	
	@Test
	public void testGetList() {
		boardMapper.getList().forEach(board -> log.info(board));
	}
/*	@Test
	public void testInsert() {
		BoardDTO dto = new BoardDTO();
		dto.setTitle("새로 작성");
		dto.setContent("새로 작성하는 내용");
		dto.setWriter("newble");
		boardMapper.insert(dto);
		log.info(boardMapper);
	}
	@Test
	public void testRead() {
		BoardDTO dto= boardMapper.read(1L);//long타입에 맞춰준다.소문자 대문자 관계없음.
		log.info(dto);
	}
	@Test
	public void testDelete() {
		log.info("delete count:"+boardMapper.delete(1L));
	}
	@Test
	public void testUpdate() {
		BoardDTO dto = new BoardDTO();
		dto.setBno(23L);
		dto.setTitle("안녕하세요");
		dto.setContent("Hi");
		dto.setWriter("대한민국");
		int count =boardMapper.update(dto);
		log.info("update count:"+count);
	}
	*/
	
	
}
