<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>로그인</title>
</head>
<body>
    <h1>
        로그인 
    </h1>
    <form id="rForm" action="" method="post">
        <label>아이디: </label><input type="text" id="member_id" name="member_id" required="required" placeholder="아이디를 입력해주세요"><br/>
        <label>비번: </label> <input type="password" id="member_pwd" name="member_pwd" required="required" placeholder="비밀번호를 입력해주세요"><br/>
	    <div>
	        <input type="submit" value="로그인">
	        <a href="javascript:history(-1)">취소</a>
	    </div>
    
    </form>

<script type="text/javascript" src="<c:url value='/resources/js/common.js'/>"></script>
<script type="text/javascript">
	
const rForm = document.getElementById("rForm");
rForm.addEventListener("submit", e => {
	//서버에 form data를 전송하지 않는다 
	e.preventDefault();
	
	myFetch("login", "rForm", json => {
		if(json.status == 0) {
			//성공
			alert(json.loginVO.member_name + " 로그인 완료");
			//location = "<c:url value='/board/list'/>"; //절대 경로, 컨텍스트명 자동 변경 
			//location = "/mini/board/list"; //절대 경로 
			location = "../board/list"; //상대경로 
		} else {
			alert(json.statusMessage);
		}
	});
});

</script>    
    
</body>
</html>