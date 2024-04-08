package org.kosa.miniProS.member;

import org.apache.ibatis.annotations.Mapper;
import org.kosa.miniProS.entity.MemberVO;

@Mapper
public interface MemberMapper {

	MemberVO login(MemberVO boardVO);

}
