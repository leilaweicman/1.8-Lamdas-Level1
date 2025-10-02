package exercise6;

import common.SortService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> items = Arrays.asList("apple", "hi", "orange", "a", "banana", 123, 7, 42);

        System.out.println(SortService.sortByLengthAsc(items));
    }
}
