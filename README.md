# ProjetXml

Equipes : Balbis Robin, Dien Maxime, Sappa Valentin, Zaborowski William

#Lancer le projet xml

##Configurer la base de donnée

1. Installer exist-db 

2. Changer le port de la base de donnée pour 8088. (system configuration > http port, changer pour 8088)
![ChangementPortSystemConfiguration](https://preview.ibb.co/dC1MEw/Screen_Shot_2018_01_07_at_13_11_31.png)

3. Ajouter les fonctions dans la base de donnée ainsi que le dossier raweb :
    * Accedez au dashboard d'exist-ds : http://localhost:8088/exist/apps/dashboard/index.html
    * Cliquez sur l'icone "collections"
    * Un menu s'affiche vous demandant de rentrer des identifiants, rentrez l'identifiant suivant : username : admin et laissez le mot de passe vide
    * Cliquez sur l'icone "upload ressources" 
    * Selectionnez tous les fichiers et dossiers qui se trouvent dans le dossier xquery du projet

![ChargementFonctionBaseDeDonnee](https://preview.ibb.co/jrcggb/Screen_Shot_2018_01_07_at_13_33_04.png)



##Lancer le serveur Java

Pour lancer le serveur jetty et l'application web il faut lancer le projet avec les goals maven suivant : generate-sources install jetty:run 

Les services REST proposés par l'application sont les suivant :

 * listCr qui renvoie les informations sur tous les centres de recherches du flux de données (http://localhost:8080/xml.rest/cr/listcr)
 * GetCr qui permet de renvoyer toutes les projets d'un centre de recherche (http://localhost:8080/xml.rest/cr/getCr-CR0008i)
 * TeamParCentre qui indique le nombre d'equipe dans chaque centres de recherches (http://localhost:8080/xml.rest/sr/teamParCentre)
 * projectsName qui permet de lister tous les projets du raweb (http://localhost:8080/xml.rest/xquery/projectName)
 * GetMembers qui liste tous les membres qui travaillent sur des projets dans le raweb (http://localhost:8080/xml.rest/xquery/getMembers)

 TODO : service de recherche de membre et de projets

 