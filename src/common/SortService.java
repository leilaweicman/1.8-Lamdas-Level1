package common;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortService {
    private static final Comparator<Object> BY_LENGTH =
            Comparator.comparingInt(o -> o.toString().length());

    public static List<Object> sortByLengthAsc(List<Object> items) {
        return items.stream()
                .sorted(BY_LENGTH)
                .toList();
    }

    public static List<Object> sortByLengthDesc(List<Object> items) {
        return items.stream()
                .sorted(BY_LENGTH.reversed())
                .toList();
    }
}
