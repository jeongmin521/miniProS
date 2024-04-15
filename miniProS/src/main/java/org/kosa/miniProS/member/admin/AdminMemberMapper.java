package org.kosa.miniProS.member.admin;

import org.apache.ibatis.annotations.Mapper;
import org.kosa.miniProS.entity.MemberVO;

@Mapper
public interface AdminMemberMapper {

	MemberVO login(MemberVO boardVO);

}
