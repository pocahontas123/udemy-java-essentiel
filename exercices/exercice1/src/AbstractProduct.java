import java.util.concurrent.atomic.AtomicInteger;

public abstract class AbstractProduct {
    protected String refProduit;
    protected String descriptionProduit;
    protected int prixProduit;


    public AbstractProduct(String refProduit, String descriptionProduit, int prixProduit) {
        this.refProduit = refProduit;
        this.descriptionProduit = descriptionProduit;
        this.prixProduit = prixProduit;
    }

    public String getRefProduit() {
        return this.refProduit;
    }
    public void setRefProduit(String refProduit) {
        this.refProduit = refProduit;
    }

    public String getDescriptionProduit() {
        return descriptionProduit;
    }
    public void setDescriptionProduit(String descriptionProduit) {
        this.descriptionProduit = descriptionProduit;
    }

    public int getPrixProduit() {
        return prixProduit;
    }
    public void setPrixProduit(int prixProduit) {
        this.prixProduit = prixProduit;
    }


    @Override
    public String toString() {
        return "AbstractProduct{" +
                "refProduit='" + refProduit + '\'' +
                ", descriptionProduit='" + descriptionProduit + '\'' +
                ", prixProduit=" + prixProduit +
                '}';
    }
}
