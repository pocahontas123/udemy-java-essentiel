
public class Operateurs_Arithmetiques_Cast {

    public static void main(String[] args) {

        //4.1.	Opérateurs arithmétiques
        System.out.println("OPERATEURS ARITMETIQUES");
        int b;
        int a = b = 10;
        int additionAetB = a + b;
        System.out.println("10 + 10 = "+additionAetB);//10 + 10 = 20
        System.out.println("A - B = "+(a - b));//A - B = 0
        System.out.println("A x B = "+a * b);//A x B = 100
        System.out.println("A / B = "+a / b );//A / B = 1
        System.out.println("A modulo B = "+a % b );//A modulo B = 0
        System.out.println("5 modulo 4 = "+5 % 4 );//5 modulo 4 = 1

        System.out.println("");

        float c = 10.5f;
        float d = 10.5f;
        float additionCetD = c + d;
        System.out.println("10.5 + 10.5 = "+additionCetD);//10.5 + 10.5 = 21.0
        //concaténation + '-' => /!\ les parenthèses
        System.out.println("C - D = "+(c-d));//C - D = 0.0
        System.out.println("C x D = "+c * d);//C x D = 110.25
        System.out.println("C / D = "+c / d );//C / D = 1.0
        System.out.println("C modulo D = "+c % d );//C modulo D = 0
        System.out.println("5.5 modulo 4.5 = "+5.6f % 4.5f );//5.5 modulo 4.5 = 1.0999999

        System.out.println("");
        System.out.println("");

        //PRIORITES
        System.out.println("PRIORITES");
        int x = 5;
        int y = 10;
        int z = 2;

        System.out.println("X + Y x Z = X + (Y x Z)");
            System.out.println("X + Y x Z = "+( x + y * z ));//25
            System.out.println("X + (Y x Z) = "+( x + (y * z) ));//25

        System.out.println("");

        System.out.println(5 + 10 / 2);//10
        System.out.println(5 + (10 / 2));//10

        System.out.println("");

        System.out.println(5 * (10 / 2));//25 ; division > multiplication
        System.out.println((5 * 10) / 2);//25 ; multi > division

        System.out.println("");
        System.out.println("");

        //PROMOTIONS
        //Entier
        System.out.println("PROMOTION");
        System.out.println("Entier");
        byte e = 5;
        short f = 10;
        /*
            byte result = e + f; //ne fonctionne pas
            short result = e + f; //ne fonctionne pas
         */
        int result = e + f; // 'e' et 'f' sont promus en 'int' avant l'addition
        System.out.println(result);//15

        System.out.println("");
        System.out.println("Numérique");

        //Numérique
        int g = 5;
        double h = 2.5;
        //int result2 = g * h; // ne fonctionne pas
        double result2 = g * h; // 'g' est promu en 'double' avant la multiplication
        System.out.println(result2);//12.5

        System.out.println("");
        System.out.println("");

        System.out.println("CASTING");

        //Casting
        double i = 5.75;
        int j = (int) i; // Conversion explicite de 'double' à 'int' (perte de la partie décimale)
        System.out.println(i+" devient "+j+" avec la conversion. Il y a une troncature (perte)");

        System.out.println("");
        System.out.println("");

        //BONUS
        System.out.println("BONUS");
        double number = 123.45678;
        // Utilisation de la méthode round de la classe Math pour arrondir le résultat
        double roundedNumber = Math.round(number * 100.0) / 100.0;
        // Affichage du résultat
        System.out.println("Arrondi à deux chiffres après la virgule : " + roundedNumber);//123.45

        number = 123.45678;
        // Utilisation du casting pour tronquer le résultat
        double truncatedNumber = (int) (number * 100.0) / 100.0;
        // Affichage du résultat
        System.out.println("Tronqué à deux chiffres après la virgule : " + truncatedNumber);//123.45

        number = 123.45678;
        // Utilisation de String.format pour formater avec deux chiffres après la virgule
        String formattedNumber = String.format("%.2f", number);
        // Affichage du résultat
        //La méthode format() va d'abord arrondir la valeur à deux chiffres après la virgule.
        System.out.println("Formaté à deux chiffres après la virgule (tronquer) : " + formattedNumber);//123.46

        System.out.println("");

        System.out.println("String vers int");
        int myInteger = Integer.parseInt("10");
        System.out.println(myInteger+myInteger);//20

        System.out.println("");

        System.out.println("String vers float");
        float myFLoat = Float.parseFloat("10");
        System.out.println(myFLoat+myFLoat);//20.0

        System.out.println("");

        System.out.println("String vers double");
        double myDouble = Double.parseDouble("10");
        System.out.println(myDouble+myDouble);//20.0

        System.out.println("");

        System.out.println("Integer/Double/FLoat vers String");
        String myStrInteger = String.valueOf(myInteger);
        System.out.println(myStrInteger+myStrInteger);//1010
        String myStrDouble = String.valueOf(myDouble);
        System.out.println(myStrDouble+myStrDouble);//10.010.0
        String myStrFloat = String.valueOf(myFLoat);
        System.out.println(myStrFloat+myFLoat);//10.010.0

    }

}