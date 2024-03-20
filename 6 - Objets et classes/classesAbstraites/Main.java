abstract class A {
    protected abstract void show();
    protected abstract void doIt();
}
abstract class B extends A {
    protected abstract void show();
    @Override
    protected void doIt() {
        System.out.println("doIt depuis B");
    }
}
class C extends B {
    @Override
    protected void show() {
        System.out.println("show depuis C");
    }
}
public class Main {
    public static void main(String[] args) {
        //A a = new A(); //'A' is abstract; cannot be instantiated
        //B b = new B();'//B' is abstract; cannot be instantiated
        //A a = new B(); //'B' is abstract; cannot be instantiated
        A a = new C();
        a.show();//show depuis C
        a.doIt();//doIt depuis B
    }
}
