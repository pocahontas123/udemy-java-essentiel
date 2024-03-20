class A {
    protected int x = 1;
}

class B extends A{
    protected int x = 2;
}

class Masquage {
    public static void main(String[]arg) {
        B b = new B();
        A a = b;
        //b = a//impossible
        System.out.println("b.x vaut " + b.x);//b.x vaut 2
        System.out.println("a.n vaut " + a.x);//a.n vaut 1
    }
}