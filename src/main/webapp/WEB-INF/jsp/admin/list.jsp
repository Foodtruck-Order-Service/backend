<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="UTF-8" />
	    <title>FOS-FOODTRUCK SERVICE</title>
	
		<!-- Favicons -->
		<link rel="apple-touch-icon" sizes="144x144" href="/images/favicons/apple-touch-icon-144x144.png">
		<link rel="apple-touch-icon" sizes="114x114" href="/images/favicons/apple-touch-icon-114x114.png">
		<link rel="apple-touch-icon" sizes="72x72" href="/images/favicons/apple-touch-icon-72x72.png">
		<link rel="apple-touch-icon" sizes="57x57" href="/images/favicons/apple-touch-icon-57x57.png">
		<link rel="shortcut icon" href="/images/logo.jpg" type="image/png">
	
	    <!-- Styles -->
		<link rel="stylesheet" type="text/css" href="/styles/style.css"/>
	</head>
	<body>
	
	    <!-- Preloader -->
	    <div class="preloader">
		    <div class="preloader__wrap">
			    <div class="preloader__progress">
			    	<span></span>
			    </div>
			</div>
		</div>
		<%@ include file="/WEB-INF/jsp/admin/topnavyadmin.jsp" %>
		
		<!-- Content -->
		<main class="main" >
			<section class="container section section-first">
				<div class="row justify-content-center">
	
					<!-- Header post -->
					<header class="col-12 col-lg-12 col-xl-10 post-header">
						<h1 class="title title--h1 js-lines">사용자 목록 보기</h1>
					</header>
					<div class="sub-header filters-room sticky">
						<div class="container">
							<div class="row">
								<div class="col-12 col-md-6 col-lg-6 col-xl-4"></div>
								<div class="col-12 col-md-6 col-lg-6 col-xl-4">
									<input type="text" class="inputText inputText__icon" name="memberId" placeholder="사용자 아이디 입력">
								</div>
								<div>
									<input type="button" name="button_search" value="검색" onclick="drawTable()" class="btn btn__second w-20" />
								</div>
							</div>
						</div>
					</div>
				</div>
			<div class="col-12" id="table"></div> 
			</section>
		</main>
		<!-- Footer -->
		<%@ include file="/WEB-INF/jsp/admin/bottom.jsp" %>
		
		<!-- JavaScripts -->
		<script src="/js/jquery-3.4.1.min.js"></script>
		<script src="/js/plugins.js"></script>
	    <script src="/js/common.js"></script>
	    <script>
			$(document).ready(function() {
				drawTable();
	
				$("button_search").click(function() {
					drawTable();
				});
	
			});
	
			function drawTable() {
				$.ajax({
							url : "${pageContext.request.contextPath}/admin",
							type : "GET",
							data : {
								id : $("input[name=memberId]").val()
							},
							headers : {
								"Content-Type" : "application/json;charset=UTF-8"
							},
							success : function(rows) {
								var script = "<table class=\"table\" style=\"text-align:center;\">";
								script += "<thead>";
								script += "<tr class=\"paragraph--column\">";
								script += "<th>아이디</th><th>회원종류</th><th>사업자번호</th><th>푸드트럭명</th><th>승인여부</th><th>승인</th>";
								script += "</tr>";
								script += "</thead>";
	
								for (var i = 0; i < rows.length; i++) {
									script += "    <tr class=\"paragraph--row\">";
									script += "  <td>" + rows[i].id + "</td>";
									script += "   <td>" + rows[i].type + "</td>";
									script += "   <td>" + rows[i].rrn + "</td>";
									script += "   <td>" + rows[i].foodtruck.name + "</td>";
									if (rows[i].foodtruck.approval == null) {
										script += "   <td></td>";
									} else {
										script += "   <td>" + rows[i].foodtruck.approval
										+ "</td>";
									}
									if (rows[i].type == "B") {
									 	script += "<td><a class=\"btn btn__second w-20\" href=\"/admin/approval?no=" + rows[i].no +"\""+"><i class=\"btn-icon-left icon-bookmark\"></i>승인</a></td>"
									} else {
										script += "   <td></td>";
									}
									
								}	
								script += "</table>";
	
								$("#table").html(script);
							}
						})
			};
		</script>
	</body>
</html>