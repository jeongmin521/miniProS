package org.kosa.miniProS.board;

import org.apache.ibatis.annotations.Mapper;
import org.kosa.miniProS.entity.BoardImageFileVO;
import org.kosa.miniProS.entity.BoardVO;

@Mapper
public interface BoardImageFileMapper {

	int insert(BoardImageFileVO boardImageFileVO);
	BoardImageFileVO findById(String board_image_file_id);
	int updateBoardNo(BoardVO board);
	
}
