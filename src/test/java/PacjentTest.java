/**
 * Created by pit on 07.05.16.
 */

import org.junit.Test;
import org.omg.CORBA.StringHolder;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class PacjentTest {

    private final String DOMYSLNE_IMIE = "Zenek";
    private final String DOMYSLNE_NAZWISKO = "Maniek";
    private final long DOMYSLNY_PESEL = 98765432101L;

    @Test
    public void powinienStworzycDomyslnegoPacjenta() throws Exception {
        Pacjent chorowitek = new Pacjent();

        assertThat(chorowitek.pobierzImie(), equalTo(DOMYSLNE_IMIE));
        assertThat(chorowitek.pobierzNazwisko(), equalTo(DOMYSLNE_NAZWISKO));
        assertThat(chorowitek.pobierzPESEL(), equalTo(DOMYSLNY_PESEL));
    }

    @Test
    public void powinienStworzycPacjentaZKonkretnymiDanymi() throws Exception {
        final String IMIE = "Wojtek";
        final String NAZWISKO = "Nowak";
        final long PESEL = 99999900000L;
        Pacjent zlamas = new Pacjent(IMIE,NAZWISKO,PESEL);

        assertThat(zlamas.pobierzImie(), equalTo(IMIE));
        assertThat(zlamas.pobierzNazwisko(), equalTo(NAZWISKO));
        assertThat(zlamas.pobierzPESEL(), equalTo(PESEL));
    }

    @Test
    public void powinienOkazywacObjawyChoroby() throws Exception {
        Pacjent pacjent = new Pacjent();

        String objawy = pacjent.przedstawObjawy();

        assertThat(objawy, equalTo("Cieknie mi z nosa"));
    }
}
