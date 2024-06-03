public class Adresse {
    protected int codePostal;
    protected String adresse;


    public Adresse() {
        this.codePostal = 0;
        this.adresse = "iconnue";
    }

    public Adresse(int codePostal, String adresse) {
        this.codePostal = codePostal;
        this.adresse = adresse;
    }
}
