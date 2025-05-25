package loesung;

import java.util.List;

/**
 * Diese Lösung verwendet Java Streams.
 * Bitte beachte, dass hier die int-Werte der Zeichen verglichen werden!
 */
public class Loesung3 {
    public static int getCount(String str) {
        final List<Integer> vocals = List.of((int) 'a', (int) 'e', (int) 'i', (int) 'o', (int) 'u');
        return (int) str.toLowerCase().chars().filter(vocals::contains).count();
    }
}
