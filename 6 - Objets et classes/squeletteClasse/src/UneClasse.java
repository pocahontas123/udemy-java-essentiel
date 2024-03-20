//ctrl + inser pour faciliter la création
public class UneClasse {
    //attributs / propriétés de notre classe
    private int attribut1;
    private String attribut2;
    //constructeurs de la classe
    //constructeur par défaut (écriture non obligatoire)
    public UneClasse(){
        this.attribut1 = 1;
        this.attribut2 = "trois";
    }
    //constructeur(s) avec paramètre(s)
    public UneClasse(int attribut1) {
        this.attribut1 = attribut1;
    }
    public UneClasse(int attribut1, String attribut2) {
        this.attribut1 = attribut1;
        this.attribut2 = attribut2;
    }

    // Mutateur ( Accesseur (get) + Modificateur (set) )
    public int getAttribut1() {
        return this.attribut1;
    }
    public void setAttribut1(int attribut1) {
        this.attribut1 = attribut1;
    }
}
