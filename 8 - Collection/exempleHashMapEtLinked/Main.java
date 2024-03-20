import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Exemple avec HashMap
        System.out.println("Exemple avec HashMap :");
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 28);
        hashMap.put("David", 35);
        hashMap.put("Emma", 20);

        // Affichage des éléments de la HashMap
        System.out.println("HashMap (avant modification) : " + hashMap);

        // Suppression de la valeur associée à la clé "Bob"
        hashMap.remove("Bob");

        // Affichage des éléments de la HashMap après suppression
        System.out.println("HashMap (après suppression) : " + hashMap);

        // Exemple avec LinkedHashMap
        System.out.println("\nExemple avec LinkedHashMap :");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Alice", 25);
        linkedHashMap.put("Bob", 30);
        linkedHashMap.put("Charlie", 28);
        linkedHashMap.put("David", 35);
        linkedHashMap.put("Emma", 20);

        // Affichage des éléments de la LinkedHashMap
        System.out.println("LinkedHashMap (avant modification) : " + linkedHashMap);

        // Suppression de la valeur associée à la clé "Bob"
        linkedHashMap.remove("Bob");

        // Affichage des éléments de la LinkedHashMap après suppression
        System.out.println("LinkedHashMap (après suppression) : " + linkedHashMap);
    }
}