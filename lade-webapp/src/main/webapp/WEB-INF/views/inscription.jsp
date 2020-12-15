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
<title>Inscription</title>
</head>
<body>
	<header>
		<%@include file="commun/header.jsp"%>
	</header>
	<div class="formulaire">
		<label>Afin de vous inscire merci de renseigner le formulaire
			d'inscription (les champs marqués d'un * sont obligatoires)</label>
		<form method="post" action="Inscription">
			<div class="row mb-3">
				<div class="col">
					<input type="text" class="form-control" placeholder="Nom (*)" id="name" name="name" required>
				</div>
				<div class="col">
					<input type="text" class="form-control" placeholder="Prénom (*)" id="lastname" name="lastname" required>
				</div>
			</div>
			<div class="row mb-3">
				<div class="col">
					<input type="text" class="form-control" placeholder="login (*)"	id="login" name="login"required>
				</div>
				<div class="col">
					<input type="text" class="form-control" placeholder="Email (*)" id="email" name="email" required>
				</div>
			</div>
			<div class="row mb-3">
				<div class="col">
					<input type="password" class="form-control" id="password" placeholder="Password (*)" name="password" required>
				</div>
				<div class="col">
					<input type="password" class="form-control" id="confirmpassword" placeholder="Confirm password (*)" name="confirmpassword"required>
				</div>
			</div>	
				
	<button class="btn btn-secondary" type="submit">Envoyer</button>		
	</div>	
	</form>
	</div>
</body>
</html>