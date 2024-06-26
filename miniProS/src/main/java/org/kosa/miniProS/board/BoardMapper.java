package org.kosa.miniProS.board;

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
	int update(BoardVO boardVO);
	void allDelete();
	int insert(BoardVO boardVO);

}

