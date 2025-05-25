package loesung;

/**
 * Diese Lösung verwendet ebenfalls Java Streams, und ist in etwa so kompakt wie {@link Loesung3},
 * arbeitet aber mit dem String "aeiou" anstatt einer Character-Liste.
 */
public class Loesung3Alt2 {
    public static int getCount(String str) {
        return (int) str.toLowerCase().chars().filter(it -> "aeiou".indexOf(it) >= 0).count();
    }
}
