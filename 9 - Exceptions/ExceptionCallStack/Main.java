public class Main {

    public static void main(String[] args) {
        try {
            method1();

        } catch (ArithmeticException e) {
            System.out.println("Division par zéro impossible !");
        }
    }

    public static void method1() throws ArithmeticException {
        method2();
    }

    public static void method2() throws ArithmeticException {
        int a = 10;
        int b = 0;
        int c = a / b;
    }
}
