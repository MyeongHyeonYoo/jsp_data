<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>이미지리스트창</title>
	</head>
	
	<body>
		<ul class="lst_type">
			<li>
				<span>이미지</span>
				<span>이미지 이름</span>
				<span>선택하기</span>
			</li>
			<%
			for(int i = 0; i < 10; i++) {
			%>
			<li>
				<a href="#">
					<img alt="#" src="images/star_7_and_duke.png" width="90" height="90">
				</a>
				<a href="#">
					<strong>이미지 이름 : 듀크 <%=i %></strong>
				</a>
				<a>
					<input name="chk<%=i %>" type="checkbox">
				</a>
			</li>
			<%
			}
			%>
		</ul>
	</body>
</html>