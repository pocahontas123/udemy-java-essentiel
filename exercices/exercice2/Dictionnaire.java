
public class Dictionnaire extends AbstractDocument {
    //propriété(s) de la classe
    protected Langue langue;//enum
    protected int nbTomes;


    //constructeur(s)
    public Dictionnaire() {
        super();

        this.langue = Langue.INCONNUE;
        this.nbTomes = 0;
    }
    public Dictionnaire(String titre, int nbPage, Auteur auteur) {
        super(titre, nbPage, auteur);

        this.langue = Langue.INCONNUE;
        this.nbTomes = 0;
    }
    public Dictionnaire(String titre, int nbPage, Auteur auteur, Langue langue, int nbTomes) {
        super(titre, nbPage, auteur);

        this.langue = langue;
        this.nbTomes = nbTomes;
    }


    //accesseur(s) et mutateur(s)
    public Langue getLangue() {
        return langue;
    }
    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    public int getNbTomes() {
        return nbTomes;
    }
    public void setNbTomes(int nbTomes) {
        this.nbTomes = nbTomes;
    }


    //rédéfinition de la méthode 'toString()'
    @Override
    public String toString() {
        return "Dictionnaire{" +
                "langue=" + langue +
                ", nbTomes=" + nbTomes +
                ", numero=" + numero +
                ", titre='" + titre + '\'' +
                ", nbPages=" + nbPages +
                ", auteur=" + auteur +
                '}';
    }
}
