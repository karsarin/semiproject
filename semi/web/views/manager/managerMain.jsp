<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
	<meta charset=UTF-8">
	<meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Talent Donation - Manager/main</title>
	<link href="/semi/css/manager/main.css" rel="stylesheet" type="text/css" media="all" />
	<link href="/semi/css/manager/mainFonts.css" rel="stylesheet" type="text/css" media="all" />
    <script src="/semi/js/vendor/modernizr-2.6.1-respond-1.1.0.min.js"></script>
</head>
<body>
	<%@ include file="managerHeader.jsp"%>

	<div class="content-section" id="services">
		<div class="container">
			<div class="row">
				<div class="heading-section col-md-12 text-center">
					<h2>재능기부 승인 요청</h2>
				</div>
			</div><br>
			<div id="portfolio" class="container">
				<button id="pre">◀</button>
				<div id="column1">
					<div class="title">
						<h2>제목 최대 11자 display</h2>
					</div>
					<p>상세 설명 최대 65자 display</p>
					<a href="#" id="readBt1" class="icon icon-plus-sign button">Read More</a>
				</div>
				<div id="column2">
					<div class="title">
						<h2>감각적인 고퀄리티 로고...</h2>
					</div>
					<p>간단한 상세 설명</p>
					<a href="#" id="readBt2" class="icon icon-plus-sign button">Read More</a>
				</div>
				<div id="column3">
					<div class="title">
						<h2>전단지, 카달로그, ...</h2>
					</div>
					<p>간단한 상세 설명</p>
					<a href="#" id="readBt3" class="icon icon-plus-sign button">Read More</a>
				</div>
				<div id="column4">
					<div class="title">
						<h2>자기소개서/이력서 첨삭</h2>
					</div>
					<p>간단한 상세 설명</p>
					<a href="#" id="readBt4" class="icon icon-plus-sign button">Read More</a>
				</div>
				<button id="next">▶</button>
			</div>
		</div>
	</div>
	
	<br><br><br><br><br><br><br><br><br>
	<div class="content-section" id="services">
		<div class="container" align="center">
			<div class="row">
				<div class="heading-section col-md-12 text-center">
					<h2>Q&A 답변 대기</h2>
				</div>
			</div>
			<table class="qnatb">
				<thead>
					<tr>
						<th scope="cols">글번호</th>
						<th scope="cols">제목</th>
						<th scope="cols">내용</th>
						<th scope="cols">작성자</th>
						<th scope="cols">작성일</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row">1</th>
						<td>제목이 들어갑니다.</td>
						<td>내용이 들어갑니다.</td>
						<td>wltjs1796</td>
						<td>2017.10.18</td>
					</tr>
					<tr>
						<th scope="row">2</th>
						<td>제목이 들어갑니다.</td>
						<td>내용이 들어갑니다.</td>
						<td>jhongs</td>
						<td>2017.10.18</td>
					</tr>
					<tr>
						<th scope="row">3</th>
						<td>제목이 들어갑니다.</td>
						<td>내용이 들어갑니다.</td>
						<td>yeojin</td>
						<td>2017.10.18</td>
					</tr>
					<tr>
						<th scope="row">4</th>
						<td>제목이 들어갑니다.</td>
						<td>내용이 들어갑니다.</td>
						<td>subin</td>
						<td>2017.10.18</td>
					</tr>
					<tr>
						<th scope="row">5</th>
						<td>제목이 들어갑니다.</td>
						<td>내용이 들어갑니다.</td>
						<td>jihun</td>
						<td>2017.10.18</td>
					</tr>
					<tr>
						<th scope="row">6</th>
						<td>제목이 들어갑니다.</td>
						<td>내용이 들어갑니다.</td>
						<td>shshsh</td>
						<td>2017.10.18</td>
					</tr>
					<tr>
						<th scope="row">7</th>
						<td>제목이 들어갑니다.</td>
						<td>내용이 들어갑니다.</td>
						<td>wltjs1796</td>
						<td>2017.10.18</td>
					</tr>
					<tr>
						<th scope="row">8</th>
						<td>제목이 들어갑니다.</td>
						<td>내용이 들어갑니다.</td>
						<td>jhongs</td>
						<td>2017.10.18</td>
					</tr>
					<tr>
						<th scope="row">9</th>
						<td>제목이 들어갑니다.</td>
						<td>내용이 들어갑니다.</td>
						<td>yeojin</td>
						<td>2017.10.18</td>
					</tr>
					<tr>
						<th scope="row">10</th>
						<td>제목이 들어갑니다.</td>
						<td>내용이 들어갑니다.</td>
						<td>subin</td>
						<td>2017.10.18</td>
					</tr>
				</tbody>
			</table><br><br>
			<button id="qmore">More</button>
		</div>
	</div>
	
	<%@ include file="managerFooter.jsp" %>
</body>
</html>