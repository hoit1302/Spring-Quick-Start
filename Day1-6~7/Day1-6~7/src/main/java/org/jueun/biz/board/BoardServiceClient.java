package org.jueun.biz.board;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class BoardServiceClient {
    public static void main(String[] args) {
        AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
        BoardService boardService = (BoardService) container.getBean("boardService");
        BoardVO vo = new BoardVO();

        // 글 등록
        vo.setTitle("Spring in Action");
        vo.setWriter("심청이");
        vo.setContent("스프링 인 액션");
        boardService.insertBoard(vo);

        // 글 삭제
/*
        vo.setSeq(3);
        boardService.deleteBoard(vo);
*/

        // 글 검색
        List<BoardVO> boardList = boardService.getBoardList(vo);
        for (BoardVO board: boardList){
            System.out.println("---> " + board.toString());
        }


        container.close();
    }
}
