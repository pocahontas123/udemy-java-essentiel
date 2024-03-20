public class switchCase {
    public static void main(String[] args) {
        //CONTROLE FLUX
        //SWITCH CASE
        int i = 10;

        switch(i) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 10:
                System.out.println("case 10");
                //l'omission d'un break force la lecture de l'élément suivant
            case 20:
                System.out.println("case 20");
                //l'omission d'un break force la lecture de l'élément suivant
            default:
                //CAS PAR DEFAUT QUAND AUCUN CRITERE EST VALIDE
                System.out.println("Default");
                break;
        }
        /*
            RESULTAT:
                System.out.println("case 10");
                System.out.println("case 20");
                System.out.println("Default");
         */
    }
}
