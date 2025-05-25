package loesung;


/**
 * Dies ist nicht die eleganteste aber wahrscheinlich die Lösung, die gerade Anfängern am einfachsten fällt.
 *
 * Hast du diese Lösung?
 * Dann schau dir unbedingt die anderen Varianten an.
 */
public class Loesung1 {
    public static int getCount(String str) {
        final var lower = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
