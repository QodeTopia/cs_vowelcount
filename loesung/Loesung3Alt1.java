package loesung;

import java.util.List;

/**
 * Diese Lösung verwendet ebenfalls Java Streams, aber nicht so kompakt wie {@link Loesung3}.
 */
public class Loesung3Alt1 {
    public static int getCount(String str) {
        final List<Character> vocals = List.of('a', 'e', 'i', 'o', 'u');
        return (int) str.toLowerCase()
                .chars()
                .mapToObj(it -> (char) it)
                .filter(vocals::contains)
                .count();
    }
}
