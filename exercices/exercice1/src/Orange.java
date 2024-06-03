public class Orange  extends Fruit {
    private String variete;

    public Orange(String refProduit, String descriptionProduit, int prixProduit, String variete) {
        super(refProduit, descriptionProduit, prixProduit);
        this.variete = variete;
    }
}
