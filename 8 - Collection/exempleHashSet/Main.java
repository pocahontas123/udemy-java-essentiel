import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>() ;

        // ajoute deux éléments différents
        set.add("JAVA");
        set.add("C++");

        System.out.println("La taille est de " + set.size()) ;

        // tente d'ajouter un élément identique (rejet)
        boolean bool = set.add("C++");
        System.out.println("Bool vaut : "+bool); //même valeur donc doublon, impossible

        System.out.println("La taille reste la même : " + set.size()) ;

        /*
            La taille est de 2
            Bool vaut : false
            La taille reste la même : 2
         */
    }
}
