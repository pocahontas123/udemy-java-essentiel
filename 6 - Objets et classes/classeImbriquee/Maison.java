public class Maison {
    private String adresse;
    private int nombreDePieces;
    private Habitant habitant;

    public Maison(String adresse, int nombreDePieces, String nom, int age) {
        this.adresse = adresse;
        this.nombreDePieces = nombreDePieces;

        this.habitant = new Habitant(nom, age);
        //ou this.new Habitant(nom, age);
    }

    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNombreDePieces() {
        return nombreDePieces;
    }
    public void setNombreDePieces(int nombreDePieces) {
        this.nombreDePieces = nombreDePieces;
    }

    public Habitant getHabitant() {
        return this.habitant;
    }
    public void setHabitant(Habitant habitant) {
        this.habitant = habitant;
    }


    public String getInfo() {
        return "Maison{" +
                "adresse='" + adresse + '\'' +
                ", nombreDePieces=" + nombreDePieces +
                ", habitant=" + habitant.getInfo() +
                '}';
    }

    private class Habitant {
        private String nom;
        private int age;

        public Habitant(String nom, int age) {
            this.nom = nom;
            this.age = age;
        }

        public String getNom() {
            return nom;
        }
        public void setNom(String nom) {
            this.nom = nom;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public String getInfo() {
            return "Habitant{" +
                    "nom='" + nom + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    // ...
}