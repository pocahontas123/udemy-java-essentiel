public class FonctionNonStatic {
    public void fonctionPublic() {
        System.out.println("coucou");
    }
    private void fonctionPrivate() {
        System.out.println("Je suis une personne réservée");
    }

    public static void main(String[] args) {
        FonctionNonStatic unNomParlant = new FonctionNonStatic();
        unNomParlant.fonctionPublic();
        unNomParlant.fonctionPrivate();

        FonctionNonStatic2 unNomParlant2 = new FonctionNonStatic2();
        unNomParlant2.fonctionPublic(); // PUBLIC UNIQUEMENT CAR PAS LA MEME CLASSE !
    }
}


class FonctionNonStatic2 {
    public void fonctionPublic() {
        System.out.println("coucou");
    }

    private void fonctionPrivate() {
        System.out.println("Je suis une personne réservée");
    }
}