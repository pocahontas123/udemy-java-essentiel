class A {
    protected void show() {
        System.out.println("Je sais lacer mes chaussures");
    }

    protected void methodeTest() {
        System.out.println("Test depuis A");
    }
}

class B extends A {
    @Override
    protected void show() {
        super.show();
        System.out.println(" et compter 2 par 2");
    }

    @Override
    protected void methodeTest() {
        System.out.println("Test depuis B");
    }

}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        //Je sais lacer mes chaussures
        a.show();
        //Je sais lacer mes chaussures et compter 2 par 2
        b.show();



        a.methodeTest();//Test depuis A
        b.methodeTest();//Test depuis B



        a = b;
        //Je sais lacer mes chaussures et compter 2 par 2
        a.show();

        a.methodeTest(); //Test depuis B
    }
}
