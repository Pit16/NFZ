import org.junit.Test;

/**
 * Created by pit on 07.05.16.
 */

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CzlowiekTest {

    private final String DOMYSLNE_IMIE = "Zenek";
    private final String DOMYSLNE_NAZWISKO = "Maniek";
    private final long DOMYSLNY_PESEL = 98765432101L;

    @Test
    public void powinienStworzycDomyslnegoCzlowieka() throws Exception {
        Czlowiek chorowitek = new Czlowiek();

        assertThat(chorowitek.pobierzImie(), equalTo(DOMYSLNE_IMIE));
        assertThat(chorowitek.pobierzNazwisko(), equalTo(DOMYSLNE_NAZWISKO));
        assertThat(chorowitek.pobierzPESEL(), equalTo(DOMYSLNY_PESEL));
    }

    @Test
    public void powinienStworzycCzlowiekaZKonkretnymiDanymi() throws Exception {
        final String IMIE = "Wojtek";
        final String NAZWISKO = "Nowak";
        final long PESEL = 99999900000L;
        Czlowiek zlamas = new Czlowiek(IMIE,NAZWISKO,PESEL);

        assertThat(zlamas.pobierzImie(), equalTo(IMIE));
        assertThat(zlamas.pobierzNazwisko(), equalTo(NAZWISKO));
        assertThat(zlamas.pobierzPESEL(), equalTo(PESEL));
    }
}
