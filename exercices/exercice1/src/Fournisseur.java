import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Fournisseur {
    //permet de générer un ID unique (threads safe) si on avait plusieurs magasins
    private static AtomicInteger codeFournisseur = new AtomicInteger(0);
    private int id;

    private String nomFournisseur;
    //un Fournisseur possède simplement un catalogue de références en illimiter
    private List<AbstractProduct> listReferences;

    public Fournisseur() {
        this.id = codeFournisseur.incrementAndGet();//utilise fonction static de AtomicInteger

        this.listReferences = new ArrayList<>();
        this.nomFournisseur = "inconnue";

        this.injectProduits();
    }
    public Fournisseur(String nomFournisseur) {
        this.id = codeFournisseur.incrementAndGet();//utilise fonction static de AtomicInteger

        this.nomFournisseur = nomFournisseur;
        this.listReferences = new ArrayList<>();

        this.injectProduits();//on injecte des données de base
    }

    public void injectProduits() {
        //On créé 3 objets pour notre liste de références :

        AbstractProduct fruit1 = new Pomme(
                "pomme-01",
                "La pomme Pink Lady est une pomme à croquer, assez ferme à la dent, notamment connue pour son goût très sucré et sa coloration rouge typique.",
                1, "Pink lady");
        AbstractProduct fruit2 = new Pomme(
                "pomme-02",
                "La Gala est une pomme très sucrée, faiblement acide avec une petite pointe d'amertume ; ferme et juteuse, très croquante.",
                2, "Gala");
        AbstractProduct fruit3 = new Orange(
                "orange-01",
                "Une des variétés la plus consommée au monde...",
                3, "Valencia Late");

        this.listReferences.add(fruit1);
        this.listReferences.add(fruit2);
        this.listReferences.add(fruit3);
    }

    //affiche les références du fournisseur
    public void afficherProduits() {
        System.out.println("LES REFERENCES DU FOURNISSEUR :");
        for(AbstractProduct p : listReferences) {
            System.out.println(p.getRefProduit());
        }
    }

    //fournir une référence
    public AbstractProduct livrerReference(String refProduit) {
        for(AbstractProduct p : this.listReferences) {
            if(p.getRefProduit().equals(refProduit)) {
                return p;
            }
        }
        return null;
    }
}
