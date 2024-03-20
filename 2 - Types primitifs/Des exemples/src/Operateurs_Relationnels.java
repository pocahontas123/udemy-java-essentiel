
public class Operateurs_Relationnels {

    public static void main(String[] args) {
        //OPERATEURS RELATIONNELS
        //LES STRINGS
        System.out.println("LES STRINGS");
        String str1 = "abc1";
        String str2 = "abc2";

        System.out.println(str1 == str2);//false
        System.out.println(str1 != str2);//true
        System.out.println(str1.length() == str2.length());//true

        System.out.println(str1.equals(str2));//false
        System.out.println(str2.equals(str1));//false
        System.out.println( ! str2.equals(str1) );//true

        System.out.println("");

        System.out.println("LES AUTRES (+ cas des char et unicode)");
        System.out.println( 5+5 > 5-5 );//true
        System.out.println( 5+5 > 5-5 == (5+5) > (5-5));//true
        System.out.println( 5 < 4 );//false
        System.out.println( '5' == '5' );//true

        //System.out.println(5 != "a");//pas possible ; On doit comparer ce qui est comparable
        //System.out.println('a' == "a");//pas possible ; On doit comparer ce qui est comparable
        //System.out.println('a' != "a");//pas possible ; On doit comparer ce qui est comparable

        //Type 'char' qui fonctionne par rapport à unicode
        System.out.println('a' < 'b');//true
        System.out.println('b' < 'c');//true
        System.out.println('c' < 'd');//true

        System.out.println("");
    }

}
