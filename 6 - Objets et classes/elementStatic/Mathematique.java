public class Mathematique {
    public static final double PI = 3.14D;
    private static int compteur = 0;
    public Mathematique() {
        compteur++;
    }

    public static int addition(int x, int y) {
        return x + y;
    }
    public static double puissance2(int x) {
        return x * x; //Math.pow(x, 2);
    }

    public int getCompteur() {
        return compteur;
    }
    public void setCompteur(int compteur) {
        Mathematique.compteur = compteur;
    }
}
