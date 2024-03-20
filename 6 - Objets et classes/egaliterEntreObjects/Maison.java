import java.util.Objects;

public class Maison {
    public int nbPiece;
    public int test;

    public Maison() {
    }
    public Maison(int nbPiece) {
        this.nbPiece = nbPiece;
    }

    public int getNbPiece() {
        return nbPiece;
    }
    public void setNbPiece(int nbPiece) {
        this.nbPiece = nbPiece;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("1");
        if (this == o) return true;
        System.out.println("2");
        if (!(o instanceof Maison maison)) return false;
        System.out.println("3");
        return this.getNbPiece() == maison.getNbPiece();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNbPiece(), test);
    }
}
