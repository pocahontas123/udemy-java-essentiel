import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création d'une ArrayList de chaînes de caractères
        List<String> arrList = new ArrayList<>();

        // Ajout d'éléments à l'ArrayList
        arrList.add("Java");
        arrList.add("C++");

        // Affichage de la taille de l'ArrayList
        System.out.println("Taille de l'ArrayList : " + arrList.size());

        // Affichage de l'ArrayList
        System.out.println("Contenu de l'ArrayList : " + arrList);

        // Accès à un élément spécifique par indice
        String element = arrList.get(0);
        System.out.println("Premier élément : " + element);

        // Modification d'un élément
        arrList.set(1, "JavaScript");

        // Parcours de l'ArrayList avec une boucle for-each
        System.out.println("Parcours de l'ArrayList :");
        for (String str : arrList) {
            System.out.println(str);
        }

        // Suppression d'un élément
        arrList.remove("C++");

        // Vérification de l'existence d'un élément
        boolean existe = arrList.contains("Python");
        System.out.println("Python existe t-il dans la liste : " + existe);

        // Suppression de tous les éléments
        arrList.clear();
        System.out.println("Taille de l'ArrayList après suppression : " + arrList.size());

        /*
            Taille de l'ArrayList : 2
            Contenu de l'ArrayList : [Java, C++]
            Premier élément : Java
            Parcours de l'ArrayList :
            Java
            JavaScript
            Python existe dans la liste : false
            Taille de l'ArrayList après suppression : 0
         */
    }

}
