
public class Operateurs_Logiques {

    public static void main(String[] args) {
        //LES OPERATEURS LOGIQUES
        System.out.println("Opérateur & ET sans court circuit");

        System.out.println(5 == 5 & 5 == 4);//false
        System.out.println(5 == 5 & 5 != 4);//true
        System.out.println(5 == 1 & 5 == 1);//false

        System.out.println("");
        System.out.println("Opérateur && ET avec court circuit");

        System.out.println(5 == 5 && 5 != 5);//false
        System.out.println(5 != 5 && 5 == 5);//false

        System.out.println("");
        System.out.println("Opérateur | OU (sans) et || (avec court circuit)");

        System.out.println(5 != 5 | 5 == 5);//true
        System.out.println(5 == 5 | 5 != 5);//true
        System.out.println(5 == 5 || 5 != 5);//true
        System.out.println(5 != 5 || 5 == 5);//true

        System.out.println("");
        System.out.println("Opérateur ^ XOR");

        System.out.println(5 != 5 ^ 5 == 5);//true
        System.out.println(5 == 5 ^ 5 == 5);//false

        System.out.println("");
        System.out.println("Différence entre && et &");

        int i = 4 ;
        System.out.println(i == 5 && i++ > 0);//false;
        System.out.println(i == 5 && i++ > 0);//false;
        System.out.println(i == 5 && i++ > 0);//false;
        System.out.println(i == 5 && i++ > 0);//false;
        System.out.println("i: "+i);//4
        System.out.println(i == 5 & i++ > 0);//false;
        System.out.println("i: "+i);//5
        System.out.println(i == 5 & i++ > 0);//true;
        System.out.println("i: "+i);//6
    }

}
