package exercise2;

import java.util.List;

public class StringFilterService {

    public static List<String> filterStringsContainingO(List<String> words) {
        return words.stream()
                .filter(word -> word.contains("o"))
                .toList();
    }
}
