package com.springbook.biz.board;

import com.springbook.biz.board.impl.BoardDAO;

import java.util.List;

public class BoardServiceClient {
    public static void main(String[] args) {
        BoardDAO boardDAO = new BoardDAO();

        BoardVO vo = new BoardVO();
        vo.setTitle("myBatis 제목");
        vo.setWriter("홍길동");
        vo.setContent("myBatis 내용입니다......");
        boardDAO.insertBoard(vo);

        vo.setSearchCondition("TITLE");
        vo.setSearchKeyword("");
        List<BoardVO> boardVOList = boardDAO.getBoardList(vo);
        for (BoardVO board: boardVOList)
            System.out.println("---> " + board.toString());
    }
}
