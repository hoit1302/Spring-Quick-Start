<%@page import="org.jueun.biz.board.impl.BoardDAO"%>
<%@page import="org.jueun.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>

<%
    // 1. 사용자 입력 정보 추출
    String seq = request.getParameter("seq");

    // 2. DB 연동 처리
    BoardVO vo = new BoardVO();
    vo.setSeq(Integer.parseInt(seq));
    BoardDAO boardDAO = new BoardDAO();
    boardDAO.deleteBoard(vo);

    // 3. 화면 네비게이션
    response.sendRedirect("getBoardList.jsp");
%>