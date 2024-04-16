package org.kosa.miniProS.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosa.miniProS.entity.BoardFileVO;
import org.kosa.miniProS.entity.BoardVO;

@Mapper
public interface BoardFileMapper {

	List<org.kosa.miniProS.entity.BoardFileVO> getList(BoardVO boardVO);
	BoardFileVO getBoardFileVO(BoardVO boardVO);
	BoardFileVO view(BoardFileVO boardFileVO);
	int delete(BoardFileVO boardFileVO);
	int insert(BoardFileVO boardFileVO);

}
