public class Main {
    public static void main(String[] args) {
        System.out.println(Mathematique.PI);//3.14
        System.out.println(Mathematique.addition(1, 2));//3
        System.out.println(Mathematique.puissance2(5));//25.0


        Mathematique mathematique1 = new Mathematique();//+1
        Mathematique mathematique2 = new Mathematique();//+2
        Mathematique mathematique3 = new Mathematique();//+3
        Mathematique mathematique4 = new Mathematique();//+4
        Mathematique mathematique5 = new Mathematique();//+5

        System.out.println(mathematique1.getCompteur());//5
        System.out.println(mathematique5.getCompteur());//5
    }
}
