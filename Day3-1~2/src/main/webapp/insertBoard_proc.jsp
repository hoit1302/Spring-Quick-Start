<%@page import="org.jueun.biz.board.impl.BoardDAO"%>
<%@page import="org.jueun.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>

<%
    // 1. ����� �Է� ���� ����
    request.setCharacterEncoding("EUC-KR");
    String title = request.getParameter("title");
    String writer = request.getParameter("writer");
    String content = request.getParameter("content");

    // 2. DB ���� ó��
    BoardVO vo = new BoardVO();
    vo.setTitle(title);
    vo.setWriter(writer);
    vo.setContent(content);
    BoardDAO boardDAO = new BoardDAO();
    boardDAO.insertBoard(vo);

    // 3. ȭ�� �׺���̼�
    response.sendRedirect("getBoardList.jsp");
%>