public class Main {

    public static void main(String[] args) {
        /*
            Si les valeurs sont égales, la méthode renvoie 0.
            objet courant est inférieure à la valeur de l'autre objet, la méthode renvoie valeur < 0.
            objet courant est supérieure à la valeur de l'autre objet, la méthode renvoie valeur > 0.

            ici: >0, <0, >0, <0, >0, == donc null / 0
         */
        Integer[] numbers = {5, 2, 8, 1, 9, 3};
        int element = 3;
        int count = countGreaterThan(numbers, element);

        // Print the result
        System.out.println("The number of elements greater than " + element + " is: " + count);

    }

    // The provided countGreaterThan method
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray) {
            System.out.println(e.compareTo(elem));
            if (e.compareTo(elem) > 0) {
                ++count;
            }
        }
        return count;
    }

}