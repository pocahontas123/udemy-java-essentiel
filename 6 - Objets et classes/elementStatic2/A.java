public class A {
    private static int compteur = 0;

    public A() {
        A.compteur++;
    }

    public static int getCompteur() {
        return compteur;
    }
}
