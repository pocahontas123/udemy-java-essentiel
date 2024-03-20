public class Constante {
    public static void main(String[] args) {
        //Une constante
        final int A;//pas initialisée
        A = 10;//initialisée donc devient immuable (ne changera plus)
        System.out.println(A);//10
        //Variable 'A' might already have been assigned to ('A' porte déjà une valeur)
        //A = 20;//impossible
    }
}
