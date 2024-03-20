package UneAutreClasse;

public class Mathematique {
    private static int addition(int a, int b) {
        return a + b;
    }
    public static int appelAddition(int a, int b){
        System.out.println("Résultat de l'addition de A et B dans appelAdition (classe Mathematique): "+addition(a, b));

        a += 10;
        System.out.println("A dans la fonction appelAdition (classe Mathématique) : "+a);

        return a;
    }
}
