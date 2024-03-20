package UneMemeClasse;

//lieu de vie de mon programme
public class MonProgramme {
    private static void maFonction(){
        System.out.println("coucou");
    }
    public static int monAutreFonction(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        //rep = 6 et rep2 = 7
        int rep = MonProgramme.monAutreFonction(1, 5);
        int rep2 = monAutreFonction(2, 5);
        maFonction();//coucou
    }

}

