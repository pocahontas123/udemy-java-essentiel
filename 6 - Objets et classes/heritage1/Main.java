public class Main {
    public static void main(String[] args) {
        A a = new A();
        a = new B(); //spécifier OK
        //B b = new A();//impossible

        System.out.println(a);
    }
}
