/*
    Exercice 2 :
        1)
            Vous avez des documents qui peuvent être :
                - des livres
                - des dictionnaires
                - etc (i.e. revue ou encore une bande dessinée)

            Ils ont en commun :
                - un numéro
                - un titre
                - un auteur
                - et un nombre de pages

            Les dictionnaires ont la particularité d'avoir :
                - une langue
                - et un nombre de tomes

            Écrivez les différentes classes qui vous semblent nécessaires afin de réaliser cette première étape.

         2)
            Créer une classe "Bibliothèque" qui aura pour unique méthode "main".
            Écrivez quelques lignes de code pour voir comment il se comporte jusque-là.
            Par exemple :
                - créer 2 auteurs
                - les associer à 2 documents
                - rédéfinisser les méthodes "toString()" (éventuellement à réadapter plus tard)

            Il faudra compléter cette classe au fur et à mesure.

        3)
            Créer une classe "ListeDeDocuments" qui contiendra une liste de documents et deux méthodes qui
            respectivement permettront d'ajouter ou de supprimer un document.

            Remarques :
                -un document est unique (cf. numéro) et cela aura au moins 2 conséquences ...
                -on peut considérer ces méthodes comme généraliste

            On aura besoin d'une autre méthode supplémentaire "tousLesAuteurs" qui nous donnera
            pour chacun des documents dans la liste, son numéro et son auteur

        4)
            La dernière méthode "ListeDeDocuments" dans la classe "ListeDeDocuments"
            permettra de mettre en pratique les rédéfinitions des méthodes toString()

 */

public class Bibliotheque {
    public static void main(String[] args) {
        Auteur auteur1 = new Auteur("PAGNOL", "Marcel");
        Auteur auteur2 = new Auteur();

        //String titre, int nbPage, Auteur auteur
        AbstractDocument livre = new Livre("Un titre", 120, auteur1);
        //String titre, int nbPage, Auteur auteur, Langue langue, int nbTomes
        AbstractDocument dictionnaire = new Dictionnaire("Un titre", 500, auteur2, Langue.ANGLAIS, 3);

        //Livre{numero=0, titre='Un titre', nbPages=120, auteur=Auteur{nom='PAGNOL', prenom='Marcel'}}
        System.out.println(livre.toString());
        //Dictionnaire{langue=ANGLAIS, nbTomes=3, numero=1, titre='Un titre', nbPages=500, auteur=Auteur{nom='DOE', prenom='John'}}
        System.out.println(dictionnaire.toString());

        ListeDeDocuments listeDeDocuments = new ListeDeDocuments();
        boolean bool = listeDeDocuments.ajouterDocument(livre);
        System.out.println(bool);//true
        bool = listeDeDocuments.ajouterDocument(dictionnaire);
        System.out.println(bool);//true
        bool = listeDeDocuments.ajouterDocument(dictionnaire);
        System.out.println(bool);//false (doublon !)

        //N° 0 Auteur{nom='PAGNOL', prenom='Marcel'}
        //N° 1 Auteur{nom='DOE', prenom='John'}
        listeDeDocuments.tousLesAuteurs();

        bool = listeDeDocuments.retirerDocument(0);
        System.out.println(bool);//true
        bool = listeDeDocuments.retirerDocument(dictionnaire);
        System.out.println(bool);//true
        //La liste est vide
        listeDeDocuments.tousLesAuteurs();

        listeDeDocuments.ajouterDocument(livre);
        listeDeDocuments.ajouterDocument(dictionnaire);

        //Livre{numero=0, titre='Un titre', nbPages=120, auteur=Auteur{nom='PAGNOL', prenom='Marcel'}}
        //Dictionnaire{langue=ANGLAIS, nbTomes=3, numero=1, titre='Un titre', nbPages=500, auteur=Auteur{nom='DOE', prenom='John'}}
        listeDeDocuments.tousLesDocuments();
    }
}
