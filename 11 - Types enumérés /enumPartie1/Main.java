

    public class Main {
        public static void main(String[] args) {
            enum Jour {
                LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE
            };

            Jour unJour = Jour.LUNDI;

            System.out.println( unJour ); // LUNDI

            System.out.println( unJour == Jour.LUNDI ); //true (même référence/emplacement en mémoire)

            System.out.println( unJour.equals( Jour.LUNDI ) ); // true (même valeur "LUNDI" == "LUNDI")

            System.out.println( unJour.compareTo( Jour.LUNDI ) );           // 0
            System.out.println( unJour.compareTo( Jour.MARDI ) );           // -1 (1 après lundi)
            System.out.println( unJour.compareTo( Jour.MERCREDI ) );        // -2 (2 après lundi)


            System.out.println( Jour.JEUDI.compareTo( Jour.VENDREDI ) );    // -1 (1 après jeudi)
            System.out.println( Jour.JEUDI.compareTo( Jour.JEUDI ) );       // 0 (les mêmes)
            System.out.println( Jour.JEUDI.compareTo( Jour.MERCREDI ) );    // +1 (1 avant jeudi)
            System.out.println( Jour.JEUDI.compareTo( Jour.MARDI ) );       // +2 (2 avant jeudi)
            System.out.println( Jour.JEUDI.compareTo( Jour.LUNDI ) );       // +3 (3 avant jeudi)

            System.out.println(Jour.LUNDI.ordinal() +" "+ Jour.DIMANCHE.ordinal());

            System.out.println(Jour.LUNDI.toString()); // LUNDI

            Jour lundi = Jour.valueOf("LUNDI");
            System.out.println( lundi ); // LUNDI

            for( Jour jour : Jour.values()) {
                System.out.println( jour );
                /*
                    LUNDI
                    MARDI
                    ...
                    DIMANCHE
                 */
            }

        }

    }


