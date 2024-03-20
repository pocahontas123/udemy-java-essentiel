import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<?> listInconnue = new ArrayList<>();
        List<String> listString = new ArrayList<>(Arrays.asList("JAVA", "C++", "CSS"));

        // On ne peut pas garantir que l'objet est un sous type de l'inconnu <?>
        //listInconnue.add(new Object());
        //listInconnue.add(new Integer(10));

        listInconnue = listString;

        listString.add("JS");      //On connait le type <String> = "JS
        //[JAVA, C++, CSS, JS]
        afficher(listInconnue);

        listInconnue.removeLast();
        //[JAVA, C++, CSS]
        afficher(listInconnue);

        //listInconnue.add("Test") //Pas possible ; Lecture seule

        listInconnue.add(null); // POSSIBLE mais pourquoi faire ?

        Object o = listInconnue.get(0);   // TOUT EST OBJECT + règle d'inférence donc possible
        //String str = listInconnue.get(0); // Pas possible ; <?> est inconnu
    }

    public static void afficher(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
