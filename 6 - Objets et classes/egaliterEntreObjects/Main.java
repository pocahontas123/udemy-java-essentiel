public class Main {
    public static void main(String[] args) {
        Maison m1 = new Maison();
        Maison m2 = new Maison();
        Maison m3 = new Maison();

        m1 = m2;
        m1.equals(m2);

        System.out.println(m1.equals(m3));



        String s = new String("test");

        System.out.println(m1.equals(s));


        m1.setNbPiece(1);
        m3.setNbPiece(2);

        System.out.println(m1.equals(m3));



    }

}
