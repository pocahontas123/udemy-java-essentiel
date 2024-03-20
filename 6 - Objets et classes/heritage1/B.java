//classe "enfante"
public class B extends A {
    private int pasAccessibleB;
    public int accessible1B;
    protected int accessible2B;


    public B() {
        this.accessible1B = 4;
        this.accessible2B = 5;
        this.pasAccessibleB = 6;

        //Accessible car protected ou public
        //this.accessible1 = 10;
        //this.accessible2 = 20;
    }

    public int getPasAccessibleB() {
        return pasAccessibleB;
    }
    public void setPasAccessibleB(int pasAccessibleB) {
        this.pasAccessibleB = pasAccessibleB;
    }

    public int getAccessible1B() {
        return accessible1B;
    }
    public void setAccessible1B(int accessible1B) {
        this.accessible1B = accessible1B;
    }

    public int getAccessible2B() {
        return accessible2B;
    }
    public void setAccessible2B(int accessible2B) {
        this.accessible2B = accessible2B;
    }

    //"super", mot clef que l'on retrouvera plus tard

    @Override
    protected void uneMethodeDeA() {
        super.uneMethodeDeA();
        System.out.println("Moi je n'aime pas le C++");
    }


    @Override
    public String toString() {
        return "B{" +
                "pasAccessibleB=" + pasAccessibleB +
                ", accessible1B=" + accessible1B +
                ", accessible2B=" + accessible2B +
                ", accessible1=" + accessible1 +
                ", accessible2=" + accessible2 +
                '}';
    }


}
