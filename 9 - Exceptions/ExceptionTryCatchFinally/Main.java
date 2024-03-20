import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DIVISION PAR ZERO
        int a = 10;
        int b = 0;

        try {
            int c = a / b; // Division par zéro

        } catch (ArithmeticException e) {
            System.out.println("Division par zéro impossible !");
        } finally {
            System.out.println("Fin du traitement");
        }
        ////////////////////
        //FICHIER INEXISTANT
        ////////////////////
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("fichier_inexistant.txt"));
            // Lire le contenu du fichier
        } catch (FileNotFoundException e) {
            System.out.println("Fichier introuvable !");

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        ////////////////////
        //PROBLEME DE CONVERSION
        ////////////////////
        String str = "123abc";

        try {
            int number = Integer.parseInt(str); // Conversion impossible

        } catch (NumberFormatException e) {
            System.out.println("Conversion impossible : " + str + " n'est pas un nombre");
        } finally {
            System.out.println("Fin de la conversion");
        }
        ////////////////////
        //REFERENCE NULL
        ////////////////////
        str = null;

        try {
            int length = str.length(); // Accès à un objet null
        } catch (NullPointerException e) {
            System.out.println("L'objet est null !");
        } finally {
            System.out.println("Fin du traitement");
        }

        /*
            RESULTAT :
                Division par zéro impossible !
                Fin du traitement

                Fichier introuvable !

                Conversion impossible : 123abc n'est pas un nombre
                Fin de la conversion

                L'objet est null !
                Fin du traitement
         */
    }
}
