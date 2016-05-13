/**
 * Created by pit on 13.05.16.
 */

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class SzpitalTest {

    Szpital szpital = new Szpital();
    @Test
    public void powienienRejestrowacLekarza(){
        Lekarz nowyLekarz = new Lekarz();

        szpital.rejestrujLekarza(nowyLekarz);

        assertThat(szpital.wypiszLekarzy(), equalTo("Lekarze: \n" +nowyLekarz.toString()));
    }

    @Test
    public void powienienRejestrowacDwochLekarzy(){
        Lekarz nowyLekarz = new Lekarz("Pierwszy", "Lekarz", 98765432100L);
        Lekarz drugiLekarz = new Lekarz("Drugi", "Lekarz", 98765432101L);

        szpital.rejestrujLekarza(nowyLekarz);
        szpital.rejestrujLekarza(drugiLekarz);

        assertThat(szpital.wypiszLekarzy(), equalTo("Lekarze: \n" +nowyLekarz.toString() +"\n" +drugiLekarz.toString()));
    }

    @Test
    public void powienienRejestrowacPacjenta(){

        Pacjent pacjent = new Pacjent();

        Lekarz nowyLekarz = new Lekarz("Pierwszy", "Lekarz", 98765432100L);
        szpital.rejestrujLekarza(nowyLekarz);
        
        szpital.rejestrujPacjenta(pacjent);

        assertThat(szpital.wypiszPacjentow(), equalTo("Lista pacjentow: \n" +pacjent.toString()));
    }
    @Test
    public void powinienZwrocicLekarzaPrzyRejestracjiPacjenta(){

        Pacjent pacjent = new Pacjent();
        Lekarz nowyLekarz = new Lekarz("Pierwszy", "Lekarz", 98765432100L);
        szpital.rejestrujLekarza(nowyLekarz);
        assertThat(szpital.rejestrujPacjenta(pacjent), equalTo(nowyLekarz));
    }
}
