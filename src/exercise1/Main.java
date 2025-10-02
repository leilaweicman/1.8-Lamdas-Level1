package exercise1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "orange", "banana", "cherry", "melon");

        List<String> result = words.stream().filter(word -> word.contains("o")).toList();

        System.out.println("Words containing 'o': " + result);
    }
}
