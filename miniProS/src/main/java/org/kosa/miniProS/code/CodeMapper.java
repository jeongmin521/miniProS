package org.kosa.miniProS.code;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosa.miniProS.entity.CodeVO;

@Mapper
public interface CodeMapper {

	List<CodeVO> getList();
}
