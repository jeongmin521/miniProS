package org.kosa.miniProS.board.mapper;

import java.util.List;

import org.kosa.miniProS.board.BoardVO;

public interface BoardMapper {

	List<BoardVO> list(BoardVO boardVO);
	BoardVO read(BoardVO boardVO);
	int delete(BoardVO boardVO);

}
