public class Pomme extends Fruit {
    private String variete;

    public Pomme(String refProduit, String descriptionProduit, int prixProduit, String variete) {
        super(refProduit, descriptionProduit, prixProduit);
        this.variete = variete;
    }
}
