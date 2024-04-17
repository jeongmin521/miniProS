package org.kosa.miniProS.board;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.kosa.miniProS.entity.BoardTokenVO;

@Mapper
public interface BoardTokenMapper {

	int insert(String board_token);
	int updateStatusComplate(String board_token);
	public List<BoardTokenVO> listToken();
	public int deletes(Map<String, Object> map);
	public void deleteByToken(String token);

}