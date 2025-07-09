//importer la classe utilitaire 'Scanner'
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fournir la propriété Static "in" de la classe utilitaire System
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier : ");
        // récupère le résultat sous la forme d'un int
        int age = sc.nextInt();

        System.out.print("Entrez votre nom : ");
        // Attention : après nextInt() ou nextDouble(), il faut souvent vider la
        //             fin de ligne avec un sc.nextLine() pour éviter les erreurs.
        sc.nextLine(); // vider la ligne restante
        // récupère le résultat sous la forme d'une String
        String nom = sc.nextLine();

        System.out.println("Bonjour " + nom + ", vous avez " + age + " ans.");

        String donnees = "Alice 25 1.75";
        sc = new Scanner(donnees);
        // récupère le premier mot, à savoir "Alice"
        nom = sc.next();
        System.out.println("Le nom est "+nom);

        // Important ! On utilise System.in maintenant
        sc = new Scanner(System.in);

        System.out.print("Entrez un autre entier : ");
        while (!sc.hasNextInt()) {
            System.out.println("Ce n'est pas un entier. Réessayez : ");
            sc.next(); // Consommer l'entrée incorrecte
        }
        int valeur = sc.nextInt();
        System.out.println(valeur);
        // toujours fermer un lecteur de flux ouvert !
        sc.close();
    }
}
