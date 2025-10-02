package exercise6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> items = Arrays.asList("apple", "hi", "orange", "a", "banana", 123, 7, 42);

        List<Object> sortedItems = items.stream()
                .sorted(Comparator.comparingInt(o -> o.toString().length()))
                .toList();

        System.out.println(sortedItems);
    }
}
