/**
 * Created by pit on 07.05.16.
 */

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class PacjentTest {


    Pacjent pacjent = new Pacjent();

    @Test
    public void powinienOkazywacObjawyChoroby() throws Exception {
        String objawy = pacjent.przedstawObjawy();

        assertThat(objawy, equalTo("Cieknie mi z nosa"));
    }

    @Test
    public void powienienWyswietlicWizytowkePajcenta() throws Exception {
        assertThat(pacjent.toString(),
                equalTo(Czlowiek.DOMYSLNE_IMIE + " " + Czlowiek.DOMYSLNE_NAZWISKO + ", chory"));
    }

    @Test
    public void powinienNaPoczatkuBycZdrowy() throws Exception {
        assertThat(pacjent.pokazChorobe(), equalTo(Choroba.ZDROWY));
    }

    @Test
    public void powinienNadacPacjentowiChorobe() throws Exception {
        pacjent.ustawChorobe(Choroba.ANGINA);

        assertThat(pacjent.pokazChorobe(), equalTo(Choroba.ANGINA));
    }

}
