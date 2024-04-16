package org.kosa.miniProS.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosa.miniProS.entity.BoardFileVO;
import org.kosa.miniProS.entity.BoardVO;

@Mapper
public interface BoardFileMapper {
	List<BoardFileVO> getList(BoardVO boardVO);
	BoardFileVO getBoardFile(int board_file_no);
	BoardFileVO getBoardFileVO(BoardVO boardVO);
	int delete(BoardFileVO boardFileVO);
	int insert(BoardFileVO boardFileVO);
}
