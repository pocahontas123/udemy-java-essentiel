class A {
    public static < T > int trouverEl(T[] tableau, T element) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        String[] tableau = {"Hello", "World", "!"};
        String element = "G";
        int indice = A.trouverEl(tableau, element);
        //L'indice de World est 1
        System.out.println("L'indice de " + element + " est " + indice+" (si -1, on a rien trouvé)");
    }
}
