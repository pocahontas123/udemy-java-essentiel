import java.util.Map;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        System.out.println("----PROPRIETES D ENVIRONNEMENT ----");
        // On récupère toutes les propriétés d'environnement
        Properties properties = System.getProperties();

        // on affiche son nom (key) suivi de sa valeur (value)
        for(Object key : properties.keySet()) {
            String value = System.getProperty(String.valueOf(key));
            System.out.printf("%-30s == %s\n", key, value);
        }

        System.out.println();

        String os = System.getProperty("os.name");
        System.out.println("Système d’exploitation : " + os);

        System.out.println();
        System.out.println("----VARIABLES D ENVIRONNEMENT ----");
        // Récupération de toutes les variables d’environnement
        Map<String, String> variables = System.getenv();

        // Parcours et affichage
        for (Map.Entry<String, String> entry : variables.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println();

        System.out.println(System.getenv("OS"));


        //System.exit(0); // arrêt normal
        //Process finished with exit code 500
        //System.exit(500); //erreur 500

        System.out.println();
        System.out.println("Combien de temps vous faut-il pour réaliser 1 million de racines carrées ?");
        long debut = System.currentTimeMillis();
        // Simulons un traitement
        for (int i = 0; i < 1_000_000; i++) {
            Math.sqrt(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Durée d’exécution : " + (fin - debut) + " millisecondes");
    }
}
