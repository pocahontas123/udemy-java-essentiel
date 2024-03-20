import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        List<Double> listDouble = new ArrayList<>(Arrays.asList(1D));
        List<? extends Number > listNumber = new ArrayList<>();

        listNumber = listInteger; // Integer étend Number
        listNumber = listDouble;  // Double étend Number

        Object o = listNumber.get(0); //lecture possible avec Object
        //mais on ne peut toujours pas savoir exactement ce qu'est <?>
        //Integer ou double ?
        //Integer i = listNumber.get(0);
        //Double d = listNumber.get(0);

        List<? super Integer > superIntegerList = new ArrayList<>();
        superIntegerList.add(new Integer(10)); //On a une garantie sur "integer" donc écriture possible
        superIntegerList.add(new Object()); //un Object pourrait être un String ou n'importe quoi donc écriture impossible
    }
}
