package exercise1;

import common.StringFilterService;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "orange", "banana", "cherry", "melon");

        List<String> result = StringFilterService.filterStringsContainingO(words);

        System.out.println("Words containing 'o': " + result);
    }
}
