package org.kosa.miniProS.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosa.miniProS.board.PageRequestVO;
import org.kosa.miniProS.board.BoardVO;


@Mapper
public interface BoardMapper {

	List<BoardVO> getList(PageRequestVO pageRequestVO);
	int  getTotalCount(PageRequestVO pageRequestVO);
	BoardVO view(BoardVO boardVO);
	int delete(BoardVO boardVO);
	void allDelete();
	void insert(BoardVO boardVO);

}