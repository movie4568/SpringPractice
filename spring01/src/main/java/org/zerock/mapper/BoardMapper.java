package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardDTO;
import org.zerock.domain.Criteria;

public interface BoardMapper {
	//@Select("select * from tbl_board where bno>0") 쿼리를 직접 쓴 경우
	public List<BoardDTO> getList();
	public void insert(BoardDTO board);
	public void insertSelectKey(BoardDTO board);
	public BoardDTO read(Long bno);
	public int delete(Long bno);
	public int update(BoardDTO board);
	public List<BoardDTO>getListWithPaging(Criteria cri);//criteria타입을 파라미터로 사용하는 메서드

}
