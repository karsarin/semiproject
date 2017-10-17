<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, donation.search.model.vo.Notice"%>
<% 
	
	ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>noticeListView</title>
<script type="text/javascript">
	function insertPage()
	{
		location.href="views/notice/noticeWriteForm.jsp";
	}
</script>

 <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
        
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/font-awesome.css">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/templatemo_misc.css">
        <link rel="stylesheet" href="css/templatemo_style.css">

        <script src="js/vendor/modernizr-2.6.1-respond-1.1.0.min.js"></script>


<style>
 ul#navi {
        width: 200px;
        text-indent: 10px;
}
    ul#navi, ul#navi ul {
        margin:0;
        padding:0;
        list-style:none;
}
    li.group {
        margin-bottom: 3px;
}
    li.group div.title {
        height: 35px;
        line-height: 35px;
        background:lightgray;
        cursor:pointer;
}
    ul.sub li {
        margin-bottom: 2px;
        height:35px;
        line-height:35px;
        background:#f4f4f4;
        cursor:pointer;
}
    ul.sub li a {
        display: block;
        width: 100%;
        height:100%;
        text-decoration:none;
        color:#000;
}
    ul.sub li:hover {
        background:gray;
}

</style>
</head>

<body>


 <div class="main-header">
                    <div class="container">
                        <div id="menu-wrapper">
                            <div class="row">
                                <div class="logo-wrapper col-md-2 col-sm-2">
                                    <h1>
                                        <a href="#">Han</a>
                                    </h1>
                                </div> <!-- /.logo-wrapper -->
                                <div class="col-md-10 col-sm-10 main-menu text-right">
                                    <div class="toggle-menu visible-sm visible-xs"><i class="fa fa-bars"></i></div>
                                    <ul class="menu-first">
										<li>
										<form action="/semi/tsearch" method="post">
										<input type="search" name = "keyword" autocomplete>
										<input type="submit" value="제목검색" >
										</form>
										</li>
                                        <li class="active"><a href="#">Home</a></li>
                                        <li><a href="ar.html">카테고리</a></li>
                                        <li><a href="#portfolio">공지사항</a></li>
                                        <li><a href="#our-team">게시판</a></li>                                       
                                        <li><a href="#contact">마이페이지</a></li>                                 
                                    </ul>                                    
                                </div> <!-- /.main-menu -->
                            </div> <!-- /.row -->
                        </div> <!-- /#menu-wrapper -->                        
                    </div> <!-- /.container -->
                </div> <!-- /.main-header -->
            </div> <!-- /.site-header -->

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

<div style="width:300px; height:500px; float:left;">
	
<ul id="navi">
        <li class="group">
            <div class="title">카테고리</div>
            <ul class="sub">
                <li><a href="#">IT 재능</a></li>
                <li><a href="#">집안일</a></li>
                <li><a href="#">마케팅</a></li>
				<li><a href="#">홍보</a></li>
				<li><a href="#">문학</a></li>
				<li><a href="#">수작업</a></li>
				<li><a href="#">한수빈</a></li>

            </ul>
        </li>
       
    </ul>

	
	
</div>

<div>
asd
asd
asd
asd


</div>





<div align="center" style="clear:both;">
	<a href="/first/index.jsp">시작 페이지로 이동</a>
</div>

</body>
</html>