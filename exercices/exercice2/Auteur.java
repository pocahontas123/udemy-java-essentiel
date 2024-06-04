public class Auteur {
    //propriété(s) de la classe
    protected String nom;
    protected String prenom;


    //constructeur(s)
    public Auteur() {
        this.nom = "DOE";
        this.prenom = "John";
    }
    public Auteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }


    //accesseur(s) et mutateur(s)
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    //méthodes
    public String getNomPrenom() {
        return this.nom+" "+prenom;
    }


    //rédéfinition de la méthode 'toString()'
    @Override
    public String toString() {
        return "Auteur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
