//paramètre de type 'T'
/*
    'T' est un placeholder qui sera remplacé par un type existant
 */
class Couple<T> {
    private T a;
    private T b;
    public Couple(T a, T b) {
        this.a = a;
        this.b = b;
    }
    //simple échange entre 'a' et 'b' avec une variable transitoire 'local'
    public void echanger() {
        T local = a;
        a = b;
        b = local;
    }
    //appel implicitement a.toString() et b.toString()
    public void afficher() {
        System.out.println("a : " + this.getA() + " ; b : " + this.getB());
    }

    public T getA() {
        return a;
    }
    public void setA(T a) {
        this.a = a;
    }
    public T getB() {
        return b;
    }
    public void setB(T b) {
        this.b = b;
    }
}
public class Main {
    public static void main(String[] args) {
        Couple<Integer> cpInteger = new Couple<Integer>(1, 2);
        Couple<?> cpObject = new Couple<>(1.1, 1.2 );

        cpObject = cpInteger; //possible

        //cpObject.setA(10);//ne marche pas
        cpObject.afficher(); // fonctionne
    }
}
