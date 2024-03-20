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
        ColoredBox<String, ? extends Color> box2 = new ColoredBox<>();

        box2 = box1; // possible
        //box1 = box2; // pas possible


        ColoredBox<String, Color> box1x = new ColoredBox<>();
        ColoredBox<String, ? super Color> box2x = new ColoredBox<>();
        box2x = box1x;
    }
}