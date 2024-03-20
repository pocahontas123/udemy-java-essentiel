public class Chaines_de_caractère {
    public static void main(String[] args) {
        //Les chaînes de caractères (String)
        String varStr1 = "";//chaîne vide
        String varStr2 = "abcd@ ";//caractères
        String varStr3 = "123.5";//un nombre sous la forme d'une chaîne
        String varStr4 = "abcd@ 123";//alphanumériques (caractères et chiffres)

        System.out.println(varStr1);
        System.out.println(varStr2);
        System.out.println(varStr3);
        System.out.println(varStr4);
        /*
            Résultat:

                abcd
                123
                abcd 123

            On peut appliquer des "fonctions" à notre variable de type String
            length() comptera le nombre de caractères
         */

        //Les fonctions
        //"abcd@ " => Les index: a->1, b->2, c->3, d->4, ..., espace->6
        int longueur = varStr2.length();
        System.out.println(longueur);//6 avec l'espace après le d

        String toLowerCaseStr = "ABCD".toLowerCase();
        System.out.println(toLowerCaseStr);// abcd

        String toUpperCaseStr = "aBcD".toUpperCase();
        System.out.println(toUpperCaseStr);// ABCD

        /*
            On vera cela plus tard mais une fonction peut avoir le même nom à partir du moment
            ou elle n'a pas le même nombre d'arguments
         */

        //on récupère ce qu'il y a après l'index 8
        String subStringStr = "Bonjour Tom".substring(8);
        System.out.println(subStringStr);//Tom

        //on récupère ce qu'il y a entre l'index 8 et 11
        subStringStr = "Bonjour Tom et Jean".substring(8, 11);
        System.out.println(subStringStr);//Tom

        //Concaténation
        String partie1 = "Bonjour";
        String partie2 = "Tom";
        String partie1Et2 = partie1+ " " +partie2;
        System.out.println("Nos deux parties combinées: "+partie1Et2); //Nos deux parties combinées: Bonjour Tom
        //La concaténation transforme d'autres types en String
        int myInt = 10;
        String myNewStr = myInt+"";
        System.out.println(myNewStr);//"10"

        //Bonus
        //Il est possible de déclarer une String d'une autre façon
        //Car String est un type spécial (un objet).
        //On verra cela plus tard :)
        String a = new String();
        String b = new String("");
        String c = new String("coucou");
        System.out.println("a:"+a+";b:"+b+";c:"+c);//a:;b:;c:coucou
    }
}
