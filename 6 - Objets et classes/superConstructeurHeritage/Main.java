class A {
    protected int x;
    protected int y;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void show() {
        System.out.print("X:"+x+" Y:"+y);
    }
}
class B extends A {
    protected int z;
    public B(int x, int y, int z) {
        super(x, y);

        this.z = z;
    }
    @Override
    public void show() {
        super.show();
        System.out.print(" Z:"+z);
    }
    public void methodeDeB() {
        System.out.println("MethodeDeB");
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new B(1, 2, 3);
        a.show(); //X:1 Y:2 Z:3

        //avant goût de la slide suivante sur le "casting d'objet"
        ((B)a).methodeDeB();
    }
}
