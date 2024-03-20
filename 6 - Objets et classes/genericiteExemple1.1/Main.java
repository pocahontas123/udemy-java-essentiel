public class Main {

    public static void main(String[] args) {

        Box<Number> box = new Box<>();
        box.add(new Integer(10));
        box.add(new Float(10.1));
        // box.add("Coucou"); // compile-time error

        Number firstElement = box.getElement();
        System.out.println(firstElement);



    }
}
class Box<T> {
    private T element;

    public void add(T item) {
        element = item;
    }

    public T getElement() {
        return element;
    }
}