INSERT INTO public.address(	id_address, city, country, post_code, region, street_name, street_number)
VALUES 
(nextval('address_id_address_seq'), 'Gemenos', 'France', 13420, 'PACA',	'DCFI SB 103', NULL),
(nextval('address_id_address_seq'), 'Aix-en-Provence', 'France', 13100, 'PACA', 'D17', NULL),
(nextval('address_id_address_seq'), 'Sospel', 'France', 06380, 'PACA', 'D93', NULL),
(nextval('address_id_address_seq'),	'Malaussène', 'France',	06710, 'PACA', 'D6202', NULL),
(nextval('address_id_address_seq'),	'Dingy-Saint-Clair',	'France',	'74230', 'AUVERGNE-RHONE-ALPES', 'Chemin Ablon A Dran', NULL),
(nextval('address_id_address_seq'),	'Arudy',	'France',	64260,'NOUVELLE-AQUITAINE', 'Anglas', NULL),
(nextval('address_id_address_seq'),	'La Balme', 'France', 73170, 'AUVERGNE-RHONE-ALPES', 'D1516', NULL),
(nextval('address_id_address_seq'),	'Sare', 'France', 64310, 'NOUVELLE-AQUITAIN', 'Sare', NULL);

 INSERT INTO public.role(code, label)
 VALUES 
 (1, 'user'),
 (2, 'adherent');

INSERT INTO public.user_account(id_user, email, lastname, login, name, password, code)
VALUES
 (nextval('user_account_id_user_seq'), 'laurie.c@gmail.com', 'Laurie', 'lolo-13', 'COMPAIN', 'ctoRAz/QWO3iVgnuVVVZ/A==', 1),
 (nextval('user_account_id_user_seq'), 'mika@gmail.com', 'Mickael', 'Mika', 'Fracas', 'ctoRAz/QWO3iVgnuVVVZ/A==', 1),
 (nextval('user_account_id_user_seq'), 'eric@gmail.com', 'Eric', 'admin', 'Grand', 'FX1B20k3eIFbb293HQgnJA==', 2);


INSERT INTO public.spot(id_spot,  niveau_difficulte, name,  nombre_voie, tag, id_address)
VALUES
(nextval('spot_id_spot_seq'),	'2a à 4c','Baou de Mars',25 ,	TRUE,	1),
(nextval('spot_id_spot_seq'),	'3b à 5a','Sainte Victoire', 15, TRUE, 2),
(nextval('spot_id_spot_seq'),	 '1a à 4d','Sospel', 17, TRUE,	3),
(nextval('spot_id_spot_seq'),	 '3d à 6a','Sainte Baume', 34, TRUE, 4),
(nextval('spot_id_spot_seq'),	 '2b à 5a','Ablon', 16, NULL, 5),
(nextval('spot_id_spot_seq'),	 '4c à 6b','Aurudy', 32, NULL, 6),
(nextval('spot_id_spot_seq'),	 '1c à 4a','Balme de Yenne', 27, TRUE, 7),
(nextval('spot_id_spot_seq'),	 '2c à 5a','Grottes de Sare', 19, NULL, 8);


INSERT INTO public.sector(id_sector, name, path_number, id_spot)
VALUES
 (nextval('sector_id_sector_seq'), 'Baou Cezanne', 13, 2),
 (nextval('sector_id_sector_seq'), 'Le signal', 1, 2),
 (nextval('sector_id_sector_seq'), 'Les deux aiguilles', 7, 2),
 (nextval('sector_id_sector_seq'), 'Le pilier', 6, 2),
 (nextval('sector_id_sector_seq'), 'Le Roque Vaoutarde', 7, 2),
 (nextval('sector_id_sector_seq'), 'Vierge et Suberoque', 1, 2),
 (nextval('sector_id_sector_seq'), 'Le Baou des Vespres', 9, 2),
 (nextval('sector_id_sector_seq'), 'Saint Ser Ermitage', 8, 2);

 	
INSERT INTO public.path(id_path, cotation, height, name, lenght_number, point_number, id_sector)
VALUES 
(nextval('path_id_path_seq'), '7a', 120, 'Le grand didre jaune', 3, 0, 1),
(nextval('path_id_path_seq'), '5b', 130, 'Le lezard rouge', 5, 20, 1),
(nextval('path_id_path_seq'), '6a', 120, 'Le chien qui aboie', 7, 35, 1),
(nextval('path_id_path_seq'), '4c', 150, 'Les Moussaillons', 5, 0, 1),
(nextval('path_id_path_seq'), '5c', 400, 'Le grand parcours', 13, 0, 2),
(nextval('path_id_path_seq'), '5a', 80, 'Le manchot excit', 5, 20, 3),
(nextval('path_id_path_seq'), '4c', 130, 'Les deux écailles', 4, 0, 3),
(nextval('path_id_path_seq'), '5c', 120, 'Austerlitz', 7, 25, 3);


INSERT INTO public.topo(id_topo, available, description, location, name, publication_date, id_user)
VALUES 
(nextval('topo_id_topo_seq'), TRUE, 'Topo pour les spots de la région Aixoise', 'PACA', 'Topos égion aixoise', '2020/12/01', 1),
(nextval('topo_id_topo_seq'), FALSE, 'Topo pour les spots de la région Aquitaine', 'NOUVELLE-AQUITAINE', 'Topos région aquitaine', '2020/12/08', 1),
(nextval('topo_id_topo_seq'), TRUE, 'Vous trouverez les topos pour les sites de Marocaz Et Gittaz', 'AUVERGNE-RHONE-ALPES', 'La Savoie', '2020/12/08', 2);


 INSERT INTO public.reservation_inquiry(id_inquiry, lend_date, statut, id_topo, id_user, message)
VALUES 
(nextval('reservation_inquiry_id_inquiry_seq'), '2020-12-08 16:43:28.704', 'en cours', 3, 1, 'Bonjour,  je suis intéressée par ce topo');