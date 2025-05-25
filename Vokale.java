public class Vokale {

    // Liefer die Anzahl von Vokalen in einer definierten Zeichenkette (String).
    // Vokale sind a, e, i, o, u.
    // Der Eingabetext (String) wird aus Groß/Kleinbuchstaben und/oder Leerzeichen bestehen.
    public static int getCount(String str) {
        var count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c =='i' || c == 'e' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    // Optional: Du kannst die main-Methode nutzen, um deinen Code zu überprüfen oder verwende VokaleTest
    public static void main(String[] args) {
        var c1 = getCount("Emil lass das!!!");
        System.out.println("Ergebnis: " + c1 + ": " + (c1 == 4));
    }
}
