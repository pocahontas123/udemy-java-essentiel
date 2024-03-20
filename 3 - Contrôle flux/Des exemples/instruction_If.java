public class instruction_If {
    public static void main(String[] args) {
        //CONTROLE FLUX
        //INSTRUCTION IF
        //Remarque: comme 'v' n'existe que dans le bloc ou il est déclaré, alors il
        //est possible de le retrouver plusieurs fois.
        int z;
        if ( 1 < 5 ) {
            int v = 2;
            z = 1;
            System.out.println(v); // 2
            System.out.println(z); // 1
        }
        //System.out.println(v); // ERREUR
        System.out.println(z); // 1

        //INSTRUCTION ELSE
        int y = 2;
        if ( y > 5 ) {
            int v = 2;
            z = 1;
            System.out.println(v); //  2
            System.out.println(z); // 1
        }else {
            z = 100;
        }
        //System.out.println(v); // ERREUR
        System.out.println(z); // 100


        //ENCHAINER LES CONDITIONS
        int a = 4;
        int val;
        if(a < 1) {
            //bloc d'instructions 1
            val = 1;
        }else if(a < 2) {
            //bloc d'instructions 2
            val = 2;
        }else if(a < 3) {
            //bloc d'instructions 3
            val = 3;
        }else if(a < 4) {
            //bloc d'instructions 4
            val = 4;
        }else {
            //bloc d'instructions 5
            val = 5;
        }
        System.out.println("VAL : "+val); //5
    }
}
