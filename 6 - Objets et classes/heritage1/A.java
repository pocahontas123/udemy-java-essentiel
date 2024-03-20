//classe "parente"
public class A {
    private int pasAccessible;
    public int accessible1;
    protected int accessible2;

    public A() {
        this.accessible1 = 1;
        this.accessible2 = 2;
        this.pasAccessible = 3;
    }

    public int getPasAccessible() {
        return pasAccessible;
    }
    public void setPasAccessible(int pasAccessible) {
        this.pasAccessible = pasAccessible;
    }

    public int getAccessible1() {
        return accessible1;
    }
    public void setAccessible1(int accessible1) {
        this.accessible1 = accessible1;
    }

    public int getAccessible2() {
        return accessible2;
    }
    public void setAccessible2(int accessible2) {
        this.accessible2 = accessible2;
    }

    protected void uneMethodeDeA() {
        System.out.println("J'aime le C++");
    }
}
