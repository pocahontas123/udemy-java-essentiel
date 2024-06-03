import java.util.Scanner;

/*
    Vous avez un programme depuis lequel un CLIENT pourra remplir son PANIER depuis un MAGASIN.
    Un MAGASIN possède des références de PRODUITS en quantités variables.
    Ce dernier peut commander chez son FOURNISSEUR une quantité pour une référence donnée.

    Pour faciliter l'implémentation, on ne possède pas réellement des produits mais des références auxquelles on a associé une quantité.
    De plus, le fournisseur possède un stock illimité contrairement au magasin.
    Le client peut vider son panier en payant sa course (dans l'application, il n'y a pas besoin d'argent).

    Pour aller plus loin :

        Vous pouvez proposer un système de menu interactif avec la classe Scanner.
        Un fournisseur pourrait lui aussi avoir des stocks. Vous pouvez trouver un moyen pour remplir périodiquement ses stocks dans le temps.
        Vous pouvez largement compléter le système de paiement.
        Vous pouvez chercher à individualiser les produits (exploiter la famille AtomicXXXX comme AtomicInteger).
        ...

    N'hésitez pas à partager votre solution sur le forum de la formation.

    L'idée générale est d'utiliser : la composition, les listes et de l'abstraction.
 */


public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        //Création d'un client
        Client client = new Client("Robin", "Sophie");

        //Création d'un magasin
        Magasin magasin = new Magasin(new Adresse(35000, "32 rue des Grenouilles"), new Fournisseur("MaraicherSARL"));
        //initialisation de la relation client-magasin
        client.rentreDansUnMagasin(magasin);

        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Menu :");
            System.out.println("1. Vue client");
            System.out.println("2. Vue Magasin ");
            System.out.println("3. Quitter");
            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    client.afficherVueClient();//menu client
                    break;
                case 2:
                    magasin.afficherVueMagasin();//menu magasin
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }

            System.out.println();
        } while (choix != 3);

    }
}