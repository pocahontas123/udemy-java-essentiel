public class Livre extends AbstractDocument {
    //constructeur(s)
    public Livre() {
        super();
    }
    public Livre(String titre, int nbPage, Auteur auteur) {
        super(titre, nbPage, auteur);
    }


    //rédéfinition de la méthode 'toString()'
    @Override
    public String toString() {
        return "Livre{" +
                "numero=" + numero +
                ", titre='" + titre + '\'' +
                ", nbPages=" + nbPages +
                ", auteur=" + auteur +
                '}';
    }
}
