import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> langs = new ArrayList<>();
        langs.add("Java++");
        langs.add("C++");
        langs.add("CSS");

        Iterator<String> it = langs.iterator();

        while(it.hasNext()) {
            String lang = it.next();
            if(lang.equals("CSS"))
                it.remove();
        }
        //[Java++, C++]
        System.out.println(langs);
    }
}
