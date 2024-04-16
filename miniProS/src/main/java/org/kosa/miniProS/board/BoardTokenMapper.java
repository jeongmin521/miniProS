package org.kosa.miniProS.board;

import org.apache.ibatis.annotations.Mapper;
import org.kosa.miniProS.entity.BoardTokenVO;

@Mapper
public interface BoardTokenMapper {

	int insert(String board_token);
	int updateStatus(BoardTokenVO boardTokenVO);

}
