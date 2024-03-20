public class whileDoWhileFor {
    public static void main(String[] args) {
        //CONTROLE FLUX
        //WHILE et DO...WHILE
        int table = 5;
        int compteur = 1;

        while(compteur <= 10) {
            System.out.println(table+" x "+compteur+" = "+(table * compteur));
            compteur++; //passage du compteur à 11 ici
        }

        do{
            System.out.println("Condition non remplie mais 1 passage obligatoire");
        }while(compteur == 1);

        System.out.println("A ce stade, le compteur est à : "+compteur);
        do {
            System.out.println(--compteur);
        }while(compteur > 1);

        System.out.println("Exemple avec for : ");
        for(int i = 1 ; i <= 10 ; i++) {
            System.out.println(table+" x "+i+" = "+(table * i));
        }


        /*
            Resultat:
                5 x 1 = 5
                5 x 2 = 10
                5 x 3 = 15
                5 x 4 = 20
                5 x 5 = 25
                5 x 6 = 30
                5 x 7 = 35
                5 x 8 = 40
                5 x 9 = 45
                5 x 10 = 50

                Condition non remplie mais 1 passage obligatoire
                A ce stade, le compteur est à : 11

                10
                9
                8
                7
                6
                5
                4
                3
                2
                1

                Exemple avec for :
                    5 x 1 = 5
                    5 x 2 = 10
                    5 x 3 = 15
                    5 x 4 = 20
                    5 x 5 = 25
                    5 x 6 = 30
                    5 x 7 = 35
                    5 x 8 = 40
                    5 x 9 = 45
                    5 x 10 = 50
         */
    }
}
