interface iA {
}
interface iB {
}

class MyNumber extends Number implements iA, iB {
    private double value;

    public MyNumber(double value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int) value;
    }

    @Override
    public long longValue() {
        return (long) value;
    }

    @Override
    public float floatValue() {
        return (float) value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

class Couple<T extends Number & iA & iB> {
    private T a;
    private T b;
    private Object c;

    public Couple(T a, T b) {
        this.a = a;
        this.b = b;

        this.c = new Object();
    }
    //simple échange entre 'a' et 'b' avec une variable transitoire 'local'
    public void echanger() {
        T local = a;
        a = b;
        b = local;
    }
    //appel implicitement a.toString() et b.toString()
    public void afficher() {
        System.out.println("a : "+this.getA()+" ; b : "+this.getB());
    }

    public T getA() {return a;}
    public void setA(T a) {this.a = a;}
    public T getB() {return b;}
    public void setB(T b) {this.b = b;}
    public Object getC() {
        return c;
    }
    public void setC(Object c) {
        this.c = c;
    }
}
public class Main {
    public static void main(String[] args) {
        MyNumber n1 = new MyNumber(10);
        MyNumber n2 = new MyNumber(10.5f);
        Couple<MyNumber> test = new Couple<>(n1, n2);
    }
}
