import SubPackage.*;
import SubPackage.SubSubPackage.SubSubClasse;


public class Main {
    public static void main(String[] args) {
        Voiture voiture = new Voiture();

        voiture.foo();

        Voyage voyage = new Voyage();

        SubSubClasse subSubClasse = new SubSubClasse();
    }
}