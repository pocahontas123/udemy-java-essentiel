public class B extends A {
    public void methodeB() {
        System.out.println("Méthode B");
    }

    @Override
    public void methodeC() {
        super.methodeC(); // Appel à la méthode C de la classe A
        System.out.println("Méthode C redéfinie dans la classe B");
    }
}
