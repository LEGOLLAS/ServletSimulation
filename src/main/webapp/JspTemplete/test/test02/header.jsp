<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header class="d-flex">
			<div class="logo d-flex align-items-center">
				<h1 class="text-success">Melong</h1>
			</div>
			<div class="search d-flex align-items-center">
				<div class="input-group mb-3 col-5">
				<form method="GET" action="/JspTemplete/test/test02/test02_search.jsp" class="d-flex">
					<input type="text" class="form-control" name="title">
					<div class="input-group-append">
					  <button class="btn btn-success" type="button">검색</button>
					</div>
				</form>	
				</div>
			</div>
		</header>