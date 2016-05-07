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
    private final String IMIE = "Wojtek";
    private final String NAZWISKO = "Nowak";
    private final long PESEL = 99999900000L;

    @Test
    public void powinienStworzycPacjentaZDomyslnymiDanymi() throws Exception {
        //Czlowiek jest klasa abstrakcyjna,
        // wiec trzeba stworzyc pacjenta lub lekarza
        Czlowiek chorowitek = new Pacjent();

        assertThat(chorowitek.pobierzImie(), equalTo(DOMYSLNE_IMIE));
        assertThat(chorowitek.pobierzNazwisko(), equalTo(DOMYSLNE_NAZWISKO));
        assertThat(chorowitek.pobierzPESEL(), equalTo(DOMYSLNY_PESEL));
    }

    @Test
    public void powinienStworzycPacjentaZKonkretnymiDanymi() throws Exception {
        Czlowiek zlamas = new Pacjent(IMIE,NAZWISKO,PESEL);

        assertThat(zlamas.pobierzImie(), equalTo(IMIE));
        assertThat(zlamas.pobierzNazwisko(), equalTo(NAZWISKO));
        assertThat(zlamas.pobierzPESEL(), equalTo(PESEL));
    }

    @Test
    public void powinienStworzycLekarzaZDomyslnymiDanymi() throws Exception {
        //Czlowiek jest klasa abstrakcyjna,
        // wiec trzeba stworzyc pacjenta lub lekarza
        Czlowiek chorowitek = new Lekarz();

        assertThat(chorowitek.pobierzImie(), equalTo(DOMYSLNE_IMIE));
        assertThat(chorowitek.pobierzNazwisko(), equalTo(DOMYSLNE_NAZWISKO));
        assertThat(chorowitek.pobierzPESEL(), equalTo(DOMYSLNY_PESEL));
    }

    @Test
    public void powinienStworzycLekarzaZKonkretnymiDanymi() throws Exception {
        Czlowiek zlamas = new Lekarz(IMIE,NAZWISKO,PESEL);

        assertThat(zlamas.pobierzImie(), equalTo(IMIE));
        assertThat(zlamas.pobierzNazwisko(), equalTo(NAZWISKO));
        assertThat(zlamas.pobierzPESEL(), equalTo(PESEL));
    }
}
