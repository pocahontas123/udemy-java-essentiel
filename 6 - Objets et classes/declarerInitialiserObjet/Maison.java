public class Maison {
    //Un attribut de la classe
    private int nbPiece;


    //constructeur par défaut
    public Maison() {
    }
    //constructeur personnalisé
    public Maison(int nbPiece) {
        this.nbPiece = nbPiece;
    }


    //1 Mutateur et 1 Accesseur
    public int getNbPiece() {
        return nbPiece;
    }
    public void setNbPiece(int nbPiece) {
        this.nbPiece = nbPiece;
    }
}
