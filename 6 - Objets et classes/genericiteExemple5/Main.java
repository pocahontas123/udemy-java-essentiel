class A<T> {
    public void afficher(T t) {System.out.println("Afficher dans A: "+t);}
}
class B extends A<Integer> {
    public void afficher(Integer i) {System.out.println("Afficher dans B: "+i);}
}
public class Main {
    public static void main(String[] args) {
        A<Double> ad = new A<>();
        A<Integer> ai = new A<>();
        B b = new B();

        ad.afficher(new Double(1.5)); //Afficher dans A: 1.5
        ai.afficher(new Integer(1));  //Afficher dans A: 1

        //ad = b; //impossible car Double =/= Integer
        ai = b; //possible car Integer

        ai.afficher(new Integer(2)); //Afficher dans B: 2

    }
}
