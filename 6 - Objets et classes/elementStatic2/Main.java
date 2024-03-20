public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = a1;

        A a3 = new A();

        System.out.println(A.getCompteur()); //2
    }
}
