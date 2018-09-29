<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="dto.MemberDao" %>    
<% request.setCharacterEncoding("euc-kr"); %>
<jsp:useBean id="dto" class="dto.MemberDTO" />
<jsp:setProperty property="*" name="dto" />
<%= dto.getId() %>
<%
	MemberDao.getDao().addMember(dto);
%>