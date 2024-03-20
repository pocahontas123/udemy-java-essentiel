public class Main {
    public static void main(String[] args) {
        int[] monTableau = new int[5];
        monTableau[0] = 100;
        monTableau[1] = 5;
        monTableau[3] = 10;
        monTableau[4] = 1;
        monTableau[5] = 1; // ERREUR "Index 5 out of bounds for length 5"

        System.out.println(monTableau[0]);
        System.out.println(monTableau[1]);
        System.out.println(monTableau[3]);
        System.out.println(monTableau[4]);
        //System.out.println(monTableau[5]);

        System.out.println(monTableau[2]);
        /*
            Exception : Index 10 out of bounds for length 5
            L'indice 10 est hors des limites pour un tableau de taille 5 (0<->5)
         */
        //System.out.println(monTableau[10]);

        /*
            Résultat:
            100
            5
            10
            1
            0
         */
    }
}