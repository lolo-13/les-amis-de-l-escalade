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
<title>Ajouter un site</title>
</head>
<body>
	<header>
		<%@include file="commun/header.jsp"%>
	</header>
	<div class="formulaire">
		<label>Vous souhaitez partager des infos sur un nouveau spot,
			merci de renseigner le formulaire suivant (les champs marqués d'un *
			sont obligatoires)</label>
		<form method="post" action="SpotAdd">
			<div class="row mb-3">
				<div class="col">
					<input type="text" class="form-control"
						placeholder="Nom du spot(*)" id="name" name="name" required>
				</div>
			</div>
			<div>Adresse:</div>
			<div class="row mb-3">
				<div class="col">
					<input type="text" class="form-control" placeholder="N°"
						id="streetnumber" name="streetnumber">
				</div>
				<div class="col">
					<input type="text" class="form-control" placeholder="Rue"
						id="streetname" name="streetname">
				</div>
				<div class="col">
					<input type="password" class="form-control" id="postcode "
						placeholder="code postal (*)" name="postcode" required>
				</div>
			</div>
			<div class="row mb-3">

				<div class="col">
					<input type="password" class="form-control" id="city"
						placeholder="Ville (*)" name="city" required>
				</div>
				<div class="col">
					<select id="region" class="form-control" >
					<option value="">Choisissez la région *</option>
                     <optgroup label="region">						
						<option >PACA</option>
						<option >Nouvelle-Aquitaine</option>
						<option >Etc...</option>
						</optgroup>
					</select>
				</div>
				<div class="col">
					<input type="text" class="form-control" placeholder="Pays (*)"
						id="country" name="country" required>
				</div>
			</div>

			<button class="btn btn-secondary" type="submit">Enregistrer</button>
		</form>
	</div>
</body>
</html>