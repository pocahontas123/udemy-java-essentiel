import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

//classe abstraite (même si elle n'a pas au moins une méthode abstraite)
public abstract class AbstractDocument {
    //les propriétés de la classe

    //permet de générer un numéro (threadsafe)
    protected static AtomicInteger atomicNumero = new AtomicInteger(0);
    //document unique (cf. equals() )
    protected int numero;

    protected String titre;
    protected int nbPages;

    protected Auteur auteur;//composition


    //constructeur(s)
    public AbstractDocument() {
        this.numero = atomicNumero.getAndIncrement();

        this.titre = "inconnu";
        this.nbPages = 0;

        this.auteur = new Auteur();
    }
    public AbstractDocument(String titre, int nbPage, Auteur auteur) {
        this.numero = atomicNumero.getAndIncrement();

        this.titre = titre;
        this.nbPages = nbPage;

        this.auteur = auteur;
    }

    //accesseur(s) et mutateur(s)
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNbPage() {
        return nbPages;
    }
    public void setNbPage(int nbPages) {
        this.nbPages = nbPages;
    }

    public Auteur getAuteur() {
        return auteur;
    }
    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    //méthode(s)
    public String getInfoDocument() {
        return "N° "+this.getNumero()+" | Nom et prénom : "+this.getAuteur().getNomPrenom()+" | "+this.getClass();
    }


    //redéfinition des méthodes equals + hashcode
    //important pour : hashset + supprimer un objet de la liste grâce à son numéro
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractDocument that)) return false;
        return getNumero() == that.getNumero();
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getNumero());
    }
}
