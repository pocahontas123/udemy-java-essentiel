public class Main {
    public static void main(String[] args) {
        Maison m1 = new Maison(5);
        Maison m2 = m1;
        Maison m3 = new Maison(5);

        System.out.println(m1.equals(m2));//true

        System.out.println(m1.equals(m3));//(false) car ne référence pas le même objet
        System.out.println(m2.equals(m3));//(false) car ne référence pas le même objet
    }
}
