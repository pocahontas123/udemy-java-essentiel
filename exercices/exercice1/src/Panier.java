import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Panier {
    //De la même manière qu'un magasin, un panier possède une référence et sa quantité associée
    protected Map<AbstractProduct, Integer> listProduit;

    //Constructeur(s)
    public Panier(Map<AbstractProduct, Integer> listProduit) {
        this.listProduit = listProduit;
    }
    public Panier() {
        this.listProduit = new HashMap<AbstractProduct, Integer>();
    }


    public void ajouterProduitPanier(Magasin magasin) {
        Scanner scanner = new Scanner(System.in);
        String refProduit;
        int quantite;

        magasin.afficherStockMagasin();

        System.out.print("Entrez la ref du produit à commander : ");
        refProduit = scanner.nextLine();

        System.out.print("Entrez la quantité à commander : ");
        quantite = scanner.nextInt();
        if (quantite <= 0) {
            System.out.println("Quantité invalide. Veuillez réessayer.");
            return;
        }

        //on récupère le produit correspondant à la référence dans le magasin
        AbstractProduct produitMagasin = magasin.getProduitParRef(refProduit);
        if(produitMagasin == null) {
            System.out.println("Référence invalide. Veuillez réessayer.");
            return;
        }

        //On récupère la quantité disponible en magasin pour la référence précédente
        int quantiteDispoMagasin = magasin.produitsMap.get(produitMagasin);
        if(quantiteDispoMagasin < quantite) {
            System.out.println("Quantité insuffisante en magasin. Veuillez réessayer.");
            return;
        }
        //quand on ajoute un produit dans le panier, on décide de le soustraire des stocks du magasin
        int nouvelleQuantiteMagasin = quantiteDispoMagasin - quantite;
        magasin.produitsMap.put(produitMagasin, nouvelleQuantiteMagasin);

        //si la référence n'existait pas encore dans le panier, on l'ajoute (ex: première fois)
        if(!this.listProduit.containsKey(produitMagasin)) {
            this.listProduit.put(produitMagasin, quantite);

            //sinon, on fait la même chose à la différence que l'on récupère la quantité en cours pour cette référence
        }else {
            int nouvelleQuantitePanier = this.listProduit.get(produitMagasin) + quantite;
            this.listProduit.put(produitMagasin, nouvelleQuantitePanier);
        }

        System.out.println("Le magasin avait "+quantiteDispoMagasin+" de "+produitMagasin.getRefProduit()+" et en a maintenant "+nouvelleQuantiteMagasin);
    }

    public void voirPanier() {
        System.out.println("REF | PRIX | QUANTITE");

        for (Map.Entry<AbstractProduct, Integer> p : listProduit.entrySet()) {
            AbstractProduct aP = p.getKey();
            Integer quantite = p.getValue();

            System.out.println(aP.getRefProduit()+" | "+aP.getPrixProduit()+" | "+quantite);
        }
    }

    public Long getTotalPanier() {
        Long total = 0L;

        for (Map.Entry<AbstractProduct, Integer> p : listProduit.entrySet()) {
            //<CLEF, Valeur>
            AbstractProduct aP = p.getKey();//CLEF
            Integer quantite = p.getValue();//VALEUR associée

            total += aP.getPrixProduit() * quantite;
        }

        return total;
    }
}
