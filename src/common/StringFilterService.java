package common;

import java.util.List;

public class StringFilterService {

    public static List<String> filterStringsContainingO(List<String> words) {
        return words.stream()
                .filter(word -> word.contains("o"))
                .toList();
    }

    public static List<String> filterStringsContainingOAndLongerThan5(List<String> words) {
        return filterStringsContainingO(words)
                .stream()
                .filter(word -> word.length() > 5)
                .toList();
    }
}
