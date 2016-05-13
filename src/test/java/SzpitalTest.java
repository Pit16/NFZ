/**
 * Created by pit on 13.05.16.
 */

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class SzpitalTest {
    @Test
    public void powienienRejestrowacLekarza(){
        Lekarz nowyLekarz = new Lekarz();
        Szpital sobieskiego = new Szpital();

        sobieskiego.rejestrujLekarza(nowyLekarz);

        assertThat(sobieskiego.wypiszLekarzy(), equalTo("Lekarze: \n" +nowyLekarz.toString()));
    }
    @Test
    public void powienienRejestrowacDwochLekarzy(){
        Lekarz nowyLekarz = new Lekarz("Pierwszy", "Lekarz", 98765432100L);
        Lekarz drugiLekarz = new Lekarz("Drugi", "Lekarz", 98765432101L);
        Szpital ckr = new Szpital();

        ckr.rejestrujLekarza(nowyLekarz);
        ckr.rejestrujLekarza(drugiLekarz);

        assertThat(ckr.wypiszLekarzy(), equalTo("Lekarze: \n" +nowyLekarz.toString() +"\n" +drugiLekarz.toString()));
    }
}
