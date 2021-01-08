# Les amis de l'escalade - P6
Création d’un site communautaire autour de l’escalade

**Prérequis**
--------------
Apache Maven 3.6.3

PostgreSQL 12

Tomcat V9.0

**Déploiement**
---------------
Cloner le projet sous GitHub

Importer le projet dans l'IDE ( projet développé avec Eclipse)

Créer une base de données nommée lade sous postgreSQL

Utiliser le script du dump pour créer les tables puis le script du jeu de données pour remplir les tables de la BDD

Dans le module lade-model sous \src\main\resources modifier le fichier hibernate.cfg.xml sur les champs suivant :

 - ligne 13 utilisateur de la bdd (indiquer le nom d'utilisateur de la base de données créée)

 - ligne 14 mot de passe de la bdd (indiquer le mot de passe de la base de données créée)

Demarrer le serveur tomcat sur l'IDE puis se rendre via le navigateur sur l'adresse http://localhost:8080/lade-webapp/Accueil

L'application est prète à fonctionner avec 3 utilisateurs :

admin mot de passe admin pour le rôle de membre de l'association

Mika mot de passe 123 pour le rôle d'utilisateur connecté

lolo-13 mot de passe 123 pour le rôle d'utilisateur connecté
