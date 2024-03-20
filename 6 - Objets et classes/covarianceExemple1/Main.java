class A {
    public Number methodA(){
        return 1;
    }
}
class B extends A {
    @Override
    public Integer methodA(){
        return 2;
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new B();
        //n peut recevoir n'importe quoi qui est Number ou alors étend cette classe
        Number n = a.methodA(); //2
        System.out.println(n);
    }
}
