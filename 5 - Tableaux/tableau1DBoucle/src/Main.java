public class Main {
    public static void main(String[] args) {
        int []monTableau = new int[2];
        monTableau[0] = 5;
        monTableau[1] = 10;;

        for(int indice = 0; indice < monTableau.length; indice ++) {
            //afficher le contenu de mon tableau
            System.out.println(monTableau[indice] ); // 5..10
        }
        //modifier une valeur
        monTableau[0] = 1;
        System.out.println(monTableau[0]);//1

        /*
            Résultat :
            5
            10
            1
         */

    }
}