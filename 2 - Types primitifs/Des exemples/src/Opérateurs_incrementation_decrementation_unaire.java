public class Opérateurs_incrementation_decrementation_unaire {
    public static void main(String[] args) {
        //OPERATEURS INCREMENTATION - DECREMENTATION - UNAIRE
        System.out.println("Exemples simples: ");
        System.out.println("int i = 0;\ni = i + 1;\n");
        int i = 0;
        i = i + 1;
        System.out.println("i = i + 1    "+i);//1
        i = i + 1;
        System.out.println("i = i + 1    "+i);//2

        i += 1; // même chose que " i = i + 1 "
        System.out.println(i);

        i = i - 1;
        System.out.println("i = i - 1    "+i);//1
        i = i - 1;
        System.out.println("i = i - 1    "+i);//0

        System.out.println("");
        System.out.println("Exemples : ");
        System.out.println("int x = 1;\nint y = 1;\n");
        int x = 2;
        int y = 2;
        System.out.println("x + y++      "+ (x + y++) );//2 + 2 = 4 puis j'incrémente y
        System.out.println("y            "+y);//y vaut maintenant 3

        System.out.println("x + ++y      "+ (x + ++y) );//2 + (incrémente y) 4 = 6

        y = 10;

        // Négation (même chose que : z = z - y
        int z =- y; // z vaut maintenant -10
        System.out.println("z : "+z);
        // Positive attitude (même chose que : a = a + y
        int a =+ y; // a vaut maintenant 10
        System.out.println("a : "+a);

    }
}
