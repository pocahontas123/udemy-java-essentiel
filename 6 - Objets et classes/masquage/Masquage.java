class A {
    protected int n = 1;
    protected float x;

    void affiche() {
        System.out.println("Afficher de la classe A");
    }
}

class B extends A{
    int n = 2;
    double x;

    @Override
    void affiche() {
        System.out.println("dans B n vaut " + n +
                " et le n de la classe A vaut " +  super.n);
    }
}

class Masquage {
    public static void main(String[]arg) {
        B b = new B();
        A a = b;
        System.out.println("x de B : "+b.n+" et x de A vaut "+a.n);
        a.affiche();
        b.affiche();

        System.out.println("b.n vaut " + b.n);
        System.out.println("a.n vaut " + a.n);

        a = new A();

        a.affiche();

    }
}

/* sortie
dans B n vaut 2 et le n de la classe A vaut 1
dans B n vaut 2 et le n de la classe A vaut 1
b.n vaut 2
a.n vaut 1
Afficher de la classe A
*/