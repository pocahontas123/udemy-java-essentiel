import java.util.Scanner;

public class switchCase14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Donner une note (int) de 0 à 5 compris :");
        n = sc.nextInt();

        // EXEMPLE 1

        // n = expression (types : byte, short, char, int, énuméré ou String)
        switch (n) {
            // une étiquette
            case 0:
            case 1:
                // case 0 + 1
                // Une suite d'instructions
                System.out.println("N'a pas révisé");
                // instruction 2
                // ...
                break;

            case 2:
            case 3:
                System.out.println("Des notions sont à revoir");
                break;

            case 4:
                System.out.println("Bon devoir");
                break;

            case 5:
                System.out.println("Parfait");
                break;

            // Permet de gérer tous les cas non prévus (valeurs hors 0–5)
            default:
                System.out.println("Note invalide ou absent");
                // optionnel voir inutile ici
                break;
        }
        System.out.println("A la sortie du switch ...");

        // EXEMPLE 2
        switch (n) {
            case 0, 1 ->
                    System.out.println("N'a pas révisé");
            case 2, 3 ->
                    System.out.println("Des notions sont à revoir");
            case 4 ->
                    System.out.println("Bon devoir");
            case 5 ->
                    System.out.println("Parfait");

            default ->
                    System.out.println("Note invalide ou absent");
        }
        System.out.println("A la sortie du switch ...");

        // EXEMPLE 3
        String resp;
        switch (n) {
            case 0, 1 -> {
                System.out.println("N'a pas révisé");
                System.out.println("=> Il faut revoir le cours.");
                resp = "Il faut revoir le cours.";
            }
            case 2, 3 -> {
                System.out.println("Des notions sont à revoir");
                System.out.println("=> Refaire quelques exercices.");
                resp = "Refaire quelques exercices.";
            }
            case 4 -> {
                System.out.println("Bon devoir");
                System.out.println("=> Bon niveau global.");
                resp = "Bon niveau global.";
            }
            case 5 -> {
                System.out.println("Parfait");
                System.out.println("=> Excellent travail !");
                resp = "Excellent travail !";
            }
            default -> {
                System.out.println("Note invalide ou absent");
                System.out.println("=> Veuillez entrer une note entre 0 et 5.");
                resp = "Veuillez entrer une note entre 0 et 5.";
            }
        }
        System.out.println("A la sortie du switch ...");
        System.out.println("resp : " + resp);


        // EXEMPLE 4
        resp = switch (n) {
            case 0, 1 ->
                "Il faut revoir le cours.";
            case 2, 3 ->
                "Refaire quelques exercices.";
            case 4 ->
                "Bon niveau global.";
            case 5 ->
                "Excellent travail !";

            default ->
                "Veuillez entrer une note entre 0 et 5.";

        } ; // <== Important
        System.out.println("A la sortie du switch ...");
        System.out.println("resp : " + resp);

        // EXEMPLE 5
        resp = switch (n) {
            case 0, 1 -> {
                System.out.println("N'a pas révisé");
                System.out.println("=> Il faut revoir le cours.");
                yield "Il faut revoir le cours.";
            }
            case 2, 3 -> {
                System.out.println("Des notions sont à revoir");
                System.out.println("=> Refaire quelques exercices.");
                yield "Refaire quelques exercices.";
            }
            case 4 -> {
                System.out.println("Bon devoir");
                System.out.println("=> Bon niveau global.");
                yield  "Bon niveau global.";
            }
            case 5 -> {
                System.out.println("Parfait");
                System.out.println("=> Excellent travail !");
                yield "Excellent travail !";
            }
            default -> {
                System.out.println("Note invalide ou absent");
                System.out.println("=> Veuillez entrer une note entre 0 et 5.");
                yield "Veuillez entrer une note entre 0 et 5.";
            }
        } ; // <== Important
        System.out.println("A la sortie du switch ...");
        System.out.println("resp : " + resp);
    }
}
