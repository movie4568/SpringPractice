package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

public interface ReplyMapper {
	public int insert(ReplyVO vo);
	public ReplyVO read(Long bno);
	public int delete(Long bno);
	public int update(ReplyVO vo);//전체를 업뎃해야 하기 때문에replyvo
	public List<ReplyVO>getListWithPaging(
			@Param("cri")Criteria cri,
			@Param("bno")Long bno
			);
}
