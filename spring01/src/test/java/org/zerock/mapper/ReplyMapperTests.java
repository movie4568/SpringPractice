package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	@Setter(onMethod_= {@Autowired})
	private ReplyMapper mapper;
	private Long[] bnoArr = {198L,197L,196L,195L,194L};//몇개만 댓글 달기 위해 배열 선언
	
	@Test
	public void testMapper() {
		log.info(mapper);
	}/*
	@Test
	public void testCreate() {
		IntStream.rangeClosed(1, 10).forEach(i -> { //instream = 연속적인 값 정수형 타입
			//rangeClosed 9번까지 반환해라
			ReplyVO vo = new ReplyVO();
			vo.setBno(bnoArr [i%5]); //5개씩마다 나눠서 쓰겠다.
			vo.setReply("댓글 테스트"+i);
			vo.setReplyer("replyer"+i);
			
			mapper.insert(vo);
			
		}); 
		
	}
	@Test
	public void testRead() {
		Long targetRno = 5L;
		ReplyVO vo = mapper.read(targetRno);
		log.info(vo);
	}
	@Test
	public void testDelete() {
		Long targetRno = 1L;
		mapper.delete(targetRno);
		
	}
	@Test
	public void testUpdate() {
		Long targetRno = 10L;
		ReplyVO vo = mapper.read(targetRno);
		vo.setReply("Update reply");
		vo.setReplyer("조인성");
		int count= mapper.update(vo);
		
		log.info("Update Count:"+count);
	}*/
	@Test
	public void testList() {
		Criteria cri = new Criteria();
		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[0]);
		replies.forEach(reply->log.info(reply));
	}

}
