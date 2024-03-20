public class Main {
    public static void main(String[] args) {
        int[][] monTableau = new int[2][3];
        monTableau[0][0] = 10;
        monTableau[0][1] = 11;
        monTableau[0][2] = 8;
        monTableau[1][0] = 5;
        monTableau[1][1] = 10;
        monTableau[1][2] = 99;

        for (int indice = 0; indice < monTableau.length; indice++) {

            for (int indice2 = 0; indice2 < monTableau[indice].length; indice2++) {

                System.out.println("["+indice+"]["+indice2+"] : "+monTableau[indice][indice2]);

            }

        }

        /*
            Résultat:
            [0][0] : 10
            [0][1] : 11
            [0][2] : 8
            [1][0] : 5
            [1][1] : 10
            [1][2] : 99
         */
    }
}
