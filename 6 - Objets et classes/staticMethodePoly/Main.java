class A {
    protected static void show() {
        System.out.println("Depuis A");
    }
}
class B extends A {
    protected static void show() {
        System.out.println("Depuis B");
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.show(); //Depuis A (ou A.show())
        b.show(); //Depuis B (ou B.show())

        a = b;
        a.show(); //Depuis A (ou A.show())
    }
}
