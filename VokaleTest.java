import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VokaleTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 6, Vokale.getCount("Emil liebt Java!"));
        assertEquals("Nope!", 5, Vokale.getCount("abracadabra"));
        assertEquals("Nope!", 0, Vokale.getCount(""));
        assertEquals("Nope!", 5, Vokale.getCount("Lecker Bierchen"));
        assertEquals("Nope!", 12, Vokale.getCount("O sole mio, Emil singt im Studio!"));
        assertEquals("Nope!", 9, Vokale.getCount("Warum geht das schon wieder nicht?"));
        assertEquals("Nope!", 18, Vokale.getCount("Dies ist ein Beispieltext für einen einfachen Test.")); // ü ist bonus :)
        assertEquals("Nope!", 16, Vokale.getCount("A E I O U – Emil übt Opernarien im Unterricht."));
    }
}