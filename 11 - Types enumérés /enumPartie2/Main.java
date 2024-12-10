public class Main {
    public static void main(String[] args) {
        enum Jour {
            LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;
            public void afficherJour() {
                System.out.println("Jour de l'instance : "+this); // toString() implicite
            }

        }

        enum JourFRetANG {
            LUNDI("MONDAY"), MARDI("TUESDAY"), MERCREDI("WEDNESDAY"),
            JEUDI("THURSDAY"), VENDREDI("FRIDAY"), SAMEDI("SATURDAY"),
            DIMANCHE("SUNDAY");

            private String nomAnglais;

            private JourFRetANG(String nomAnglais) {
                this.nomAnglais = nomAnglais;
            }
            public String afficherJour() {
                return this.toString();
            }
            public String afficherNomAnglais() {
                return this.nomAnglais;
            }
        }

        for(Jour jour : Jour.values()) {
            jour.afficherJour(); //Jour de l'instance : LUNDI, etc.
        }

        for(JourFRetANG jour : JourFRetANG.values()) {
            System.out.println(jour.afficherJour()+" "+jour.afficherNomAnglais());
        }
        /*
            LUNDI MONDAY
            MARDI TUESDAY
            MERCREDI WEDNESDAY
            JEUDI THURSDAY
            VENDREDI FRIDAY
            SAMEDI SATURDAY
            DIMANCHE SUNDAY
         */

    }
}
