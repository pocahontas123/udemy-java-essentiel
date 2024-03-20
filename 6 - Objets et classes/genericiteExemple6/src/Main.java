class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

class ColoredBox<T, C extends Color> extends Box<T> {
    private C color;

    public void setColor(C color) {
        this.color = color;
    }
    public C getColor() {
        return color;
    }
}

class Color {}

class Red extends Color {}
class Blue extends Color {}

public class Main {
    public static void main(String[] args) {
        ColoredBox<String, Blue> box1 = new ColoredBox<>();
        ColoredBox<String, Color> box2 = new ColoredBox<>();

        // Assigne un objet Blue à box1 (OK)
        box1.setColor(new Blue());

        //Maintenant, cela n'est pas possible mais pourquoi ? si c'était le cas ....
        //Synonymie : les deux pointes vers la même adresse en mémoire
        //box2 = box1;


        //String est OK et Blue est un enfant de Color...

        // Il serait alors possible de passer la couleur de blue à rouge sur box2 ...
        Red red = new Red();
        box2.setColor(red);

        //Mais là, patatras ! Avec box1, je souhaite récupérer un objet de type Blue
        //alors qu'il pointe vers un objet Red (ClassCastException)

        Blue blue = box1.getColor();
    }
}