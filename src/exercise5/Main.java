package exercise5;

public class Main {

    public static void main(String[] args) {
        PiValueProvider provider = () -> 3.1415;

        System.out.println("Pi value: " + provider.getPiValue());
    }
}
