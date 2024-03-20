class A<T> {
    public void afficher() {System.out.println("Afficher dans A");}
}
class B<T> extends A<T> {
    public void afficher() {System.out.println("Afficher dans B");}
}
class C<T, U> extends A<T> {
    public void afficher() {System.out.println("Afficher dans C");}
}
public class Main {
    public static void main(String[] args) {
        A<Integer> a = new A<>();
        B<Integer> b = new B<>();
        C<Integer, String> c = new C<>();

        a.afficher();//Afficher dans A
        a = b;
        a.afficher();//Afficher dans B
        a = c;
        a.afficher();//Afficher dans C

        //A<Number> ab = new A<>();
        //ab = b;//Numbers =/= Integer



    }
}
