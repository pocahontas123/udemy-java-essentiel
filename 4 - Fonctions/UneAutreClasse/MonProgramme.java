package UneAutreClasse;

//lieu de vie de mon programme
public class MonProgramme {

    public static void main(String[] args) {
        //'addition(int, int)' has private access in 'Mathematique'
        //Mathematique.addition(5, 5);
        int a = 5; int b = 5;
        a = Mathematique.appelAddition(a, b);


        System.out.println("A depuis MonProgramme : "+a);
        System.out.println("B depuis MonProgramme : "+b);


    }

}

/*
Résultat de l'addition de A et B dans appelAdition (classe Mathematique): 10
A dans la fonction appelAdition (classe Mathématique) : 15
A depuis MonProgramme : 5
B depuis MonProgramme : 5
 */