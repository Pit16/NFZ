/**
 * Created by pit on 15.05.16.
 */
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class SpecjalistaTest {

    @Test
    public void chirurgPowienienZalozycGips() throws Exception{
        Chirurg chirurg = new Chirurg();
        String poWizycie = chirurg.lecz(Choroba.ZAWAL);
        //TODO: jest zawal a zaklada gips, nie korzysta ze specyfikacji choroby
        // moze zwrocic, nie moja profesja, idz do innego lekarza

        assertThat(poWizycie, equalTo("Zalozylem gips."));
    }

    @Test
    public void internistaPowinienLeczycPrzeziebienie() throws Exception{
        Internista internista = new Internista();
        String poWizycie = internista.lecz(Choroba.ZMECZENIE);

        assertThat(poWizycie, equalTo("Prosze odpoczac dwa dni w domu."));

    }

    @Test
    public void lekarzPKPowienieDiagnozowacIWysylacDalej() throws Exception{
        PierwszegoKontaktu pierwszegoKontaktu = new PierwszegoKontaktu();
    }

    @Test
    public void powinienZdiagnozowacChorobeNaPodstawieObjawow() throws Exception {
        PierwszegoKontaktu pierwszegoKontaktu = new PierwszegoKontaktu();
        Choroba choroba = pierwszegoKontaktu.diagnozuj("Cieknie mi z nosa");
        assertThat(choroba,equalTo(Choroba.ANGINA));

        assertThat(pierwszegoKontaktu.diagnozuj("Duze zrenice"),equalTo(Choroba.ZMECZENIE));
    }

}
