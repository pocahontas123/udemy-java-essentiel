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
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.show();//Depuis A
        b.show();//Depuis B

        a = b;
        a.show();//Depuis B
    }
}
