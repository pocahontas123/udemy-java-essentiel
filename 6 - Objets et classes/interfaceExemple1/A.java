public class A implements C {
    public void methodeA() {
        System.out.println("Méthode A");
    }
    @Override
    public void methodeC() {
        System.out.println("Méthode C implémentée dans la classe A");
    }
}
