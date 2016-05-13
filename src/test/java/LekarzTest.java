import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class LekarzTest {

    Lekarz lekarz = new Lekarz();

    @Test
    public void powienienLeczyc() throws Exception{
        String poWizycie = lekarz.lecz(Choroba.ANGINA);

        assertThat(poWizycie, equalTo("Dziekuje za wizyte"));
    }

    @Test
    public void powinienWypisacRecepte() throws Exception {
        String recepta = lekarz.wypiszRecepte();

        assertThat(recepta, equalTo("Recepta na katar"));
    }

    @Test
    public void powinienSkierowacDoSpecjalisty() throws Exception {
        String skierowanie = lekarz.dajSkierowanie(Choroba.ANGINA);

        assertThat(skierowanie, equalTo("Skierowanie do specjalisty"));
    }

    @Test
    public void powienienWyswietlicWizytowkeLekarza() throws Exception {
        assertThat(lekarz.toString(),
                equalTo(Czlowiek.DOMYSLNE_IMIE + " " + Czlowiek.DOMYSLNE_NAZWISKO + ", lekarz"));
    }

    @Test
    public void powinienZdiagnozowacChorobeNaPodstawieObjawow() throws Exception {
        Choroba choroba = lekarz.diagnozuj("Cieknie mi z nosa");
        assertThat(choroba,equalTo(Choroba.ANGINA));

        assertThat(lekarz.diagnozuj("Duze zrenice"),equalTo(Choroba.ZMECZENIE));
    }
}