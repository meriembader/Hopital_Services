# Hopital_Services ( architecture microServices [spring Boot| DOCKER | API GateWay | NodeJS ])



* Le travail de certaines pharmacies hospitalières et celles des dispensaires publics se fait encore manuellement.
* Volume important des informations traitées manuellement, ce qui provoque parfois des erreurs dans l'établissement des documents.
* Recherche difficile sur les registres qui engendre une perte de temps. 
* Insécurité des informations.
* Possibilité d'erreur dans le remplissage des différents documents et registres. 
* Possibilité d'erreur dans les calculs des statistiques.
* Nombre important des archives qui engendre une difficulté de stockage. ( Détérioration des archives à force de leur utilisation trop fréquente.


Gestion des employés : Cette opération consiste à organiser les employés(Consulter, ajouter, modifier et supprimer) dans le cadre de l'hôpital et préparer leurs planning du semaine .
Gestion des médicaments : Cette opération consiste à suivre l'état du stock à savoir les mouvements réalisés sur le stock (entrée /sortie de médicament, quantité des médicaments dans le stock).
Gestion des patients : Cette opération consiste à consulter, ajouter, modifier et supprimer les records médicales des patients ainsi assurer et fournir un suivi continue pour les patients en cas critique et notifier les médecins si il y’a une cas d'urgence.
Gestion des rendez-vous : Cette opération consiste à consulter, ajouter, modifier et supprimer les rendez-vous entre les patients et les médecins de l’hopitale selon leurs disponibilités  ainsi  notifier les médecins de leurs futurs Rendez-vous .


******************* **SERVICES ROUTES** **************************

reclamations-service /api/reclamations/ 8100

commandes-service /api/commandes/ 8200

staffs-service /api/staffs/   8300

medicals-service /api/medicals/ 8400

medicaments-service /api/medicaments/ 8500

providers-service /api/providers/ 8600

rendez-vous-service /api/rendez-vous/ 8700

patients-service /api/patients/ 8800

admins-service /api/admins/ 8900

commandes-node /api/commandes_node/ 9000

************************* **Lignes de commande** *****************
 > docker run -d -p 8100:8100 --name reclamation-service microservices/reclalamtions:0.0.1-SNAPSHOT
 > docker ps 
 >image ls 
 >npm install 







