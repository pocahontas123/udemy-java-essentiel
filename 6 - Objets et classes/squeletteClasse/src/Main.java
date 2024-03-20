
public class Main {
    public static void main(String[] args) {
        UneClasse monObjet1 = new UneClasse();
        UneClasse monObjet2 = new UneClasse(1);
        UneClasse monObjet3 = new UneClasse(1, "2");

        System.out.println(monObjet1.getAttribut1());//1
        monObjet1.setAttribut1(100);
        System.out.println(monObjet1.getAttribut1());//100
    }
}