import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // L'ordre est théorique sur un échantillon si petit
        // Mais dans un programme qui tournera longtemps et / ou avec beaucoup plus de valeurs, ce sera pertinent
        // Création d'un LinkedHashSet
        Set<String> lang = new LinkedHashSet<>();

        lang.add("JAVA");
        lang.add("C++");
        lang.add("JAVASCRIPT");

        // Affichage des éléments dans l'ordre d'insertion
        System.out.println("**Ordre d'insertion:**");
        for (String el : lang) {
            System.out.println(el);
        }

        // Ajout de deux autres valeurs
        lang.add("Java Spring");
        lang.add("Salade");

        // Affichage des éléments dans l'ordre d'insertion
        System.out.println("**Ordre d'insertion:**");
        for (String el : lang) {
            System.out.println(el);
        }

        String removedEl = (String) ((LinkedHashSet)lang).removeLast();
        System.out.println("Element supprimé : "+removedEl);


        // Affichage des éléments dans l'ordre d'insertion
        System.out.println("**Ordre d'insertion:**");
        for (String el : lang) {
            System.out.println(el);
        }
        /*
            --Ordre d'insertion:--
                JAVA
                C++
                JAVASCRIPT

            --Ordre d'insertion:--
                JAVA
                C++
                JAVASCRIPT
                Java Spring
                Salade

                Element supprimé : Salade

                --Ordre d'insertion:--
                    JAVA
                    C++
                    JAVASCRIPT
                    Java Spring
         */
    }
}
