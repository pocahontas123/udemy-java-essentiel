Cet exercice est plutôt simple et met en pratique : l'abstraction, composition et liste...

# Exercice 2

## 1)

Vous avez des documents qui peuvent être :

- des livres
- des dictionnaires
- etc. (i.e. revue ou encore une bande dessinée)

Ils ont en commun :

- un numéro
- un titre
- un auteur
- et un nombre de pages

Les dictionnaires ont la particularité d'avoir :

- une langue
- et un nombre de tomes

Écrivez les différentes classes qui vous semblent nécessaires afin de réaliser cette première étape.

## 2)

Créer une classe "Bibliothèque" qui aura pour unique méthode "main".
Écrivez quelques lignes de code pour voir comment il se comporte jusque-là.
Par exemple :

- créer 2 auteurs
- les associer à 2 documents
- rédéfinisser les méthodes "toString()" (éventuellement à réadapter plus tard)

Il faudra compléter cette classe au fur et à mesure.

## 3)

Créer une classe "ListeDeDocuments" qui contiendra une liste de documents et deux méthodes qui respectivement permettront d'ajouter ou de supprimer un document.

Remarques :

- un document est unique (cf. numéro) et cela aura au moins 2 conséquences...
- on peut considérer ces méthodes comme généraliste

On aura besoin d'une autre méthode supplémentaire "tousLesAuteurs" qui nous donnera pour chacun des documents dans la liste, son numéro et son auteur.

## 4)

La dernière méthode "ListeDeDocuments" dans la classe "ListeDeDocuments" permettra de mettre en pratique les rédéfinitions des méthodes `toString()`.
