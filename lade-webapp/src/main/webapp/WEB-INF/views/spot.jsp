<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/style.css" type="text/css" />
<title>spot</title>
</head>
<body>
	<header>
		<%@include file="commun/header.jsp"%>
	</header>
	<div class="listSpot">
		<p>Vous cherchez un site d'escalade ? Voici tous les spots
			référencés sur notre site :</p>
		<ul class="flex spots" >
			<c:forEach var="spot" items="${spots}" varStatus="status">

				<c:url var="detailspot" value="SpotDetail">
					<c:param name="id" value="${ spot.idSpot }" />
				</c:url>
				<li class="spot"><a href="${ detailspot }">${ spot.name }</a>				
					<a class="img-container" href="${ detailspot }"> 
					<img src="images/site<c:out value="${spot.idSpot}"/>.png">
					<c:if test="${ spot.tag  == true}"><div class="tampon"></div></c:if>
				</a>
				<div> ${ spot.address.region }</div>
				</li>
			</c:forEach>

		</ul>
	</div>
</body>
</html>