package org.kosa.miniProS.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosa.miniProS.entity.BoardVO;
import org.kosa.miniProS.page.PageRequestVO;

@Mapper
public interface BoardMapper {

	List<BoardVO> getList(PageRequestVO pageRequestVO);
	int  getTotalCount(PageRequestVO pageRequestVO);
	BoardVO view(BoardVO boardVO);
	int incViewCount(BoardVO boardVO);
	int delete(BoardVO boardVO);
	void allDelete();
	void insert(BoardVO boardVO);

}

