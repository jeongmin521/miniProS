package org.kosa.miniProS.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import org.kosa.miniProS.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*
 * MVC 
 * Model : B/L 로직을 구현하는 부분(service + dao)  
 * View  : 출력(jsp) 
 * Controller : model와 view에 대한 제어를 담당 
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class BoardService  {
	private static final long serialVersionUID = 1L;
      
	private final BoardMapper  boardMapper;

    public List<BoardVO> list(BoardVO board) throws ServletException, IOException {
		return boardMapper.list(board);
	}
}