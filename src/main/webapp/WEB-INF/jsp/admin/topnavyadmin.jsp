<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Header -->
<header class="header">
	<nav class="navbar">

		<ul class="nav">
		
			<li class="nav__item"><a class="btn btn__medium" href="/login"><i class="btn-icon-left icon-bookmark"></i>로그인</a></li>
		</ul>
		<div>
			<c:if test="${member ne null}">
				<a class="btn btn__medium" href="/admin/logout"><i class="btn-icon-left icon-bookmark"></i>로그아웃</a>
			</c:if>
			<c:if test="${member eq null}"><a class="btn btn__medium" href="/login">
				<i class="btn-icon-left icon-bookmark"></i>로그인</a>
			</c:if>
		</div>
	</nav>
</header>
<!-- /Header -->
