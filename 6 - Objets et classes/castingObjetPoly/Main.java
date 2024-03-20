class A {
    protected void show() {
        System.out.println("Depuis A");
    }
}
class B extends A {
    @Override
    protected void show() {
        System.out.println("Depuis B");
    }
    protected void methodeDeB() {
        System.out.println("Je suis une méthode de B uniquement !");
    }
}
public class Main {
    public static void main(String[] args) {
        /*
            //class A cannot be cast to class B
            A a = new A();
            B b = new B();
            b = (B) a;
         */
        A a = new A();
        B b = new B();

        if( a instanceof B ) b = (B) a; // FALSE

        a = new B();
        //a.methodeDeB(); //FAUX
        if( a instanceof B ) ((B) a).methodeDeB(); // TRUE
    }
}
