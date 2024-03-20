//paramètre de type 'T'
/*
    'T' est un placeholder qui sera remplacé par un type existant
 */
class Couple<T> {
    private T a;
    private T b;
    private Object c;

    public Couple(T a, T b) {
        this.a = a;
        this.b = b;

        this.c = new Object();
    }
    //simple échange entre 'a' et 'b' avec une variable transitoire 'local'
    public void echanger() {
        T local = a;
        a = b;
        b = local;
    }
    //appel implicitement a.toString() et b.toString()
    public void afficher() {
        System.out.println("a : "+this.getA()+" ; b : "+this.getB());
    }

    public T getA() {return a;}
    public void setA(T a) {this.a = a;}
    public T getB() {return b;}
    public void setB(T b) {this.b = b;}
    public Object getC() {
        return c;
    }
    public void setC(Object c) {
        this.c = c;
    }
}

public class Main {
    public static void main(String[] args) {
        Couple<Integer> cpInteger = new Couple<Integer>(1, 2);//déballage
        cpInteger.afficher(); //a : 1 ; b : 2
        cpInteger.echanger();
        cpInteger.afficher(); //a : 2 ; b : 1

        Couple<Object> cpObject = new Couple<Object>(1, "coucou");
        cpObject.afficher(); //a : 1 ; b : coucou
        cpObject.echanger();
        cpObject.afficher(); //a : coucou ; b : 1
        /*
        si la 1ère ligne était possible (Synonymie):
            cpObject = cpInteger;

        C'est raisonnable d'y croire car jusqu'ici, on a vu qu'un type supérieur se trouvait à gauche (Déclaré)
        et pouvait avoir comme référence un type inférieur à droite (Constaté / Réel).

        On pourrait alors naïvement écrire :
            cpObject.setA(new Object());
            Integer i = cpInteger.getA(); //integer qui accueil un objet ?

        Ce qui reviendrait au même que :
            Object a = new Object();
            Integer b = new Integer(1);
            b = a;                        //integer qui accueil un objet ?
         */

        cpInteger.setC( new Integer(10) );
        //Integer i = cpInteger.getC(); //PAS POSSIBLE CAR OBJECT (Required type:Integer Provided:Object)
        Integer c = cpInteger.getA(); //POSSIBLE CAR UTILISATION DE LA GENERICITE
        System.out.println(c);//2
        Integer i = (Integer) cpInteger.getC(); //on CAST
        System.out.println(i);//10

        String[] s = new String[1];
        Object[] t = s; // ok
        t[0] = "coucou";
        System.out.println( t[0] ); //coucou





        //t[1] = new Object(); //ArrayIndexOutOfBoundsException:
        //t[2] = new Integer(10); //ArrayIndexOutOfBoundsException:
    }
}
