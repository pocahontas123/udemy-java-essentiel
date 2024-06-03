import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Magasin {
    //permet de générer un ID unique (threads safe) si on avait plusieurs magasins
    private static AtomicInteger codeMagasin = new AtomicInteger(0);
    private int id;

    //Un magasin possède pour chaque référence, une quantité
    protected Map<AbstractProduct, Integer> produitsMap;
    //Un client possède un panier. Et un Magasin possède des clients.
    protected Map<Client, Panier> clientPanier;
    //Un Magasin possède une adresse (objet)
    protected Adresse adresse;
    //Un Magasin possède un fournisseur (objet)
    protected Fournisseur fournisseur;


    public Magasin() {
        this.id = codeMagasin.incrementAndGet();//utilise fonction static de AtomicInteger

        this.adresse = new Adresse();
        this.fournisseur = new Fournisseur();

        this.produitsMap = new HashMap<>();
        this.clientPanier = new HashMap<Client, Panier>();

        this.injectProduits();//on injecte des données de base
    }

    public Magasin(Adresse adresse, Fournisseur fournisseur) {
        this.id = codeMagasin.incrementAndGet();//utilise fonction static de AtomicInteger
        this.adresse = adresse;
        this.fournisseur = fournisseur;

        this.produitsMap = new HashMap<>();
        this.clientPanier = new HashMap<Client, Panier>();

        this.injectProduits();//on injecte des données de base
    }


    public void afficherVueClient(Client client) {
        //On vérifie que notre client est déjà associé au Magasin
        if(!clientPanier.containsKey(client)) {
            //sinon, on en profite pour l'ajouter lui et son nouveau panier
            this.clientPanier.put(client, new Panier());
        }

        //Maintenant que nous sommes sûr que le client existe, nous récupérons son panier pour
        //de futures opérations
        Panier panier = this.clientPanier.get(client);

        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Menu :");
            System.out.println("1. Afficher les références du magasin");
            System.out.println("2. Ajouter une référence en 'X' quantité à son panier");
            System.out.println("3. Voir contenu de son panier");
            System.out.println("4. Payer son panier");
            System.out.println("5. Quitter");
            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    this.afficherStockMagasin();
                    break;
                case 2:
                    panier.ajouterProduitPanier(this);//this = magasin actuel
                    break;
                case 3:
                    panier.voirPanier();
                    break;
                case 4:
                    System.out.println("Vous allez payer votre panier ...");
                    System.out.println("Le total payé est de "+this.calculPanier(panier)+" euro(s)");
                    System.out.println("On vide la panier ...");
                    this.clientPanier.put(client, new Panier());//grâce à "new Panier()"
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }

            System.out.println();
        } while (choix != 4);


    }

    public Long calculPanier(Panier panier) {
        return panier.getTotalPanier();
    }

    public void afficherVueMagasin() {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Menu :");
            System.out.println("1. Afficher produits du magasin");
            System.out.println("2. Afficher produits de son fournisseur");
            System.out.println("3. Commander une référence en X quantité à son fournisseur");
            System.out.println("4. Quitter");
            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    this.afficherStockMagasin();
                    break;
                case 2:
                    this.fournisseur.afficherProduits();
                    break;
                case 3:
                    this.commanderRerefenceFournisseur();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }

            System.out.println();
        } while (choix != 4);
    }

    public void afficherStockMagasin() {
        System.out.println("REFERENCE | PRIX | QUANTITE");

        for (Map.Entry<AbstractProduct, Integer> p : this.produitsMap.entrySet()) {
            //<Clef, Valeur>
            AbstractProduct aP = p.getKey(); //CLEF
            Integer quantite = p.getValue(); //VALEUR associée

            System.out.println(aP.getRefProduit()+" | "+aP.getPrixProduit()+" | "+quantite);
        }

    }

    //permet de commander une (nouvelle) référence à son fournisseur
    private void commanderRerefenceFournisseur() {
        Scanner scanner = new Scanner(System.in);
        String refProduit;
        int quantite;

        this.fournisseur.afficherProduits();

        System.out.print("Entrez la ref du produit à commander : ");
        refProduit = scanner.nextLine();

        System.out.print("Entrez la quantité à commander : ");
        quantite = scanner.nextInt();
        if (quantite <= 0) {
            System.out.println("Quantité invalide. Veuillez réessayer.");
            return;
        }

        //récupère produit/réf fournisseur
        AbstractProduct produitFournisseur = this.fournisseur.livrerReference(refProduit);
        if(produitFournisseur == null) {
            System.out.println("Référence invalide. Veuillez réessayer.");
            return;
        }

        //a t-on déjà la référence dans notre magasin ?
        AbstractProduct produitMagasin = this.getProduitParRef(produitFournisseur.getRefProduit());
        //si null alors ce n'est pas le cas, donc j'ajoute mon "produitFournisseur" dans ma liste
        if(produitMagasin == null) {
            System.out.println("Référence n'existe pas dans le magasin.");
            this.produitsMap.put(produitFournisseur, quantite);

            //si le magasin la possède déjà (même à quantité 0)
        }else {
            //je récupère la valeur associée à la clef à laquelle j'ajoute la nouvelle quantité commandée
            int nouvelleQuantite = this.produitsMap.get(produitMagasin) + quantite;
            //le 'put' ajoute ou mets à jours
            this.produitsMap.put(produitMagasin, nouvelleQuantite);
        }

        // Ajouter la logique pour déclencher la commande ici
        System.out.println("Commande de " + quantite + " pour la ref " + refProduit + " en cours de traitement...");
    }

    public AbstractProduct getProduitParRef(String refProduit) {

        for (Map.Entry<AbstractProduct, Integer> p : this.produitsMap.entrySet()) {
            AbstractProduct aP = p.getKey();
            //Integer quantite = p.getValue();

            if(aP.getRefProduit().equals(refProduit)) {
                return aP;
            }
        }

        return null;
    }


    public void injectProduits() {
        AbstractProduct fruit1 = new Pomme(
                "pomme-01",
                "La pomme Pink Lady est une pomme à croquer, assez ferme à la dent, notamment connue pour son goût très sucré et sa coloration rouge typique.",
                1, "Pink lady");

        AbstractProduct fruit2 = new Orange(
                "orange-01",
                "Une des variétés la plus consommée au monde...",
                1, "Valencia Late");


        this.produitsMap.put(fruit1, 1);
        this.produitsMap.put(fruit2, 2);
    }
}
