public class Surcharge {

    public void fonction(){}
    public void fonction(int a){}
    public void fonction(String a){}
    public void fonction(int a, String b){}
    //impossible !
    //public void fonction(int a, String b){}


    public static void main(String[] args) {
        Surcharge surcharge = new Surcharge();
        surcharge.fonction();
        surcharge.fonction(1);
        surcharge.fonction("Salut");
        surcharge.fonction(1, "Salut");
    }
}
