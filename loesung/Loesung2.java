package loesung;

import java.util.List;

/**
 * Eine Abwandlung von {@link Loesung1}.
 */
public class Loesung2 {
    public static int getCount(String str) {
        final var lower = str.toLowerCase();
        final List<Character> vocals = List.of('a', 'e', 'i', 'o', 'u');
        int count = 0;
        for (int i = 0; i < lower.length(); i++) {
            if (vocals.contains(lower.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
