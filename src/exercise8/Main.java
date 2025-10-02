package exercise8;

public class Main {

    public static void main(String[] args) {

        StringReverser stringReverser = str -> new StringBuilder(str).reverse().toString();

        String original = "Example";
        String reversed = stringReverser.reverse(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
