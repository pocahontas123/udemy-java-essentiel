public class EntiersRelatifs {
    public static void main(String[] args) {
        //Les types primitifs
        //Les entiers relatifs (Byte, Short, Integer et Long)
        byte varByteNotInit; //déclaration d'une variable non initialisée (sans valeur)
        byte varByteMin = Byte.MIN_VALUE; //-128
        byte varByteMax = Byte.MAX_VALUE; //+127
        //byte varByteError = -129; //erreur car '<' à -128
        //byte varByteErrorBis = 128; //erreur car '>' à 127
        //System.out.println(varByteNotInit); // doit être initialisée
        System.out.println(varByteMin);
        System.out.println(varByteMax);

        short varShortMin = Short.MIN_VALUE; //-32768
        short varShortMax = Short.MAX_VALUE; //+32767
        System.out.println(varShortMin);
        System.out.println(varShortMax);

        int varIntegerMin = Integer.MIN_VALUE; //-2147483648
        int varInteger = 10;
        int varIntegerMax = Integer.MAX_VALUE; //+2147483647
        System.out.println(varIntegerMin);
        System.out.println(varInteger);
        System.out.println(varIntegerMax);

        long varLongMin = Long.MIN_VALUE; //-9223372036854775808
        long varLongMix = Long.MAX_VALUE; //+9223372036854775807
        System.out.println(varLongMin);
        System.out.println(varLongMix);

        //Exemple affectation multiple (associativité de droite à gauche)
        int x; int z;
        x = z = 5;
        System.out.println(x);//5
        System.out.println(z);//5
        /*
            résultat:
                -128
                127
                -32768
                32767
                -2147483648
                10
                2147483647
                -9223372036854775808
                9223372036854775807
                5
                5
         */
    }
}