# SpaceInvaders
Projet SpaceInvaders


## Semaine n°2: du 6 au 12 Avril
### Sprints et fonctionnalités réalisées
#### Fonctionnalité n°2 : Dimensionner le vaisseau

* Story n°1 : Positionner un nouveau vaisseau avec une dimension donnée <br>
  L'objectif va être de positionner un nouveau vaisseau au sein d'un espace de jeu donnée et refactorer le code pour le rendre plus simple et lisible.
  
* Story n°2 : Faire en sorte qu'il soit impossible de positionner un nouveau vaisseau qui déborde de l'espace de jeu <br>
  Ici le but sera de faire en sorte qu'une exeption soit levée lors d'un positionnement de vaisseau invalide (hors espace de jeu).
  
* Story n°3 : Déplacer un vaisseau vers la droite en tenant compte de sa dimension <br>
  L'objectif est de pouvoir déplacer le vaisseau vers la droite en prenant en compte sa position. Si celui-ci est à l'extrémité de l'espace de jeu ou au milieu par exemple.
  
* Story n°4 : Déplacer un vaisseau vers la gauche en tenant compte de sa dimension <br>
  Story identique à la précédente mais du côté gauche. Puis refactoring important dans presque toutes les classes du jeu. 
  
### Diagramme de classes

![Diagramme de classe](https://github.com/RemiLassalle/SpaceInvaders/blob/master/spaceinvaders/images/Semaine2.gif)

### Nuage de mots du projet spaceinvaders (séance n°2):

![Nuage de mots](https://github.com/RemiLassalle/SpaceInvaders/blob/master/spaceinvaders/images/NdmS2.png)

## Semaine n°3: du 13 au 18 Avril
### Sprints et fonctionnalités réalisées
#### Fonctionnalité n°3: Choisir la vitesse du vaisseau 

* Story n°1 : Ajouter la vitesse au Vaisseau sans régression de comportement <br>
  Ici nous avons ajouter un attribut (vitesse) à une classe (vaisseau) déjà existante.
  
* Story n°2 : Régler la vitesse du vaisseau <br>
  Cette story permet de régler la vitesse du vaisseau (pour une donnée précise).
  
* Story n°3 : Faire en sorte que le déplacement se fasse correctement pour une vitesse quelconque <br>
  Ici nous avons fait des tests de déplacements vers la droite avec une certaine vitesse puis phase de refactoring. Même étape mais vers la gauche.
  
* Story n°4 : Et bien, jouons maintenant ! <br>
  Modification de la classe SpaceInvaders pour qu'elle prenne en compte la vitesse.
  
### Diagramme de classes

![Diagramme de classe](https://github.com/RemiLassalle/SpaceInvaders/blob/master/spaceinvaders/images/Semaine%203.gif)

### Nuage de mots du projet spaceinvaders (séance n°3):

![Nuage de mots](https://github.com/RemiLassalle/SpaceInvaders/blob/master/spaceinvaders/images/NdmS3.png)

### Glossaire

* Vitesse: définie comme un vecteur obtenu en dérivant les coordonnées cartésiennes de la position par rapport au temps.

Ainsi dans un espace à deux dimensions, comme celui l'espace de jeu de Space Invaders, la vitesse d'un objet peut-être définie par un vecteur v à 2 dimensions (dx et dy) où :

dx correspond au déplacement (c-a-d à un nombre de pixels pour le projet SpaceInvaders) effectué en 1 unité de temps sur l'axe des abscisses
dy correspondra au déplacement (c-a-d à un nombre de pixels pour le projet SpaceInvaders) effectué en 1 unité de temps sur l'axe des ordonnées.

## Semaine n°4: du 4 au 8 Mai
### Sprints et fonctionnalités réalisées
#### Fonctionnalité n°4: Tirer un missile depuis le vaisseau

* Story n°1 : Comprendre ce qu'est un missile et refactorer <br>
  Définition de certains termes puis refactoring, ajout d'une classe Sprite.
  
  
* Story n°2 : Comprendre ce que signifie tirer un missile depuis le vaisseau <br>
  Définition de ce qu'est un missile.
  
  
* Story n°3 : Tirer un missile <br>
  Mise en place de la fonctionnalité pour tirer un missile puis refactoring en faisant attention à l'espace de jeu!
  
  
* Story n°4 : Et bien, jouons maintenant ! <br>
  Ajustement des différentes touches nécessaire pour jouer puis ajustement des règles concernant les missiles.
  
  
* Story n°5 : Faire déplacer le missile à la verticale de manière autonome <br>
  Mise en place d'une classe Direction ajustant les missiles, puis refactoring afin que le missile puisse se déplacer dans le jeu.
### Diagramme de classes

![Diagramme de classe](https://github.com/RemiLassalle/SpaceInvaders/blob/master/spaceinvaders/images/Semaine4.gif)

### Nuage de mots du projet spaceinvaders (séance n°4):

![Nuage de mots](https://github.com/RemiLassalle/SpaceInvaders/blob/master/spaceinvaders/images/NdmS4.png)

## Semaine n°5: du 11 au 15 Mai
### Sprints et fonctionnalités réalisées
#### Fonctionnalité n°5: Ajouter un envahisseur dans le jeu 

* Story n°1 : Refactoring <br>
 Changement de package pour de nombreuses classes.
  

* Story n°2 : Envahisseur <br>
  Création d'une nouvelle classe "Envahisseur".
  
  
* Story n°3 : Déplacements <br>
  Faire déplacer l'envahisseur en prenant en compte l'environnement.
  
  
* Story n°4 : Et bien, jouons maintenant ! <br>
  L'envahisseur se déplace parfaitement de gauche à droite!
  
### Diagramme de classes

![Diagramme de classe](https://github.com/RemiLassalle/SpaceInvaders/blob/master/spaceinvaders/images/Semaine5.gif)

### Nuage de mots du projet spaceinvaders (séance n°4):

![Nuage de mots](https://github.com/RemiLassalle/SpaceInvaders/blob/master/spaceinvaders/images/NdmS5.png)


