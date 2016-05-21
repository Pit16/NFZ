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
    public void powinienZwrocicLekarzaPierwszegoKontaktuPrzyRejestracjiPacjenta(){
        Pacjent pacjent = new Pacjent();
        Lekarz nowyLekarz = new Internista("Pierwszy", "Lekarz", 18765432100L);
        Lekarz drugiLekarz = new Internista("Drugi", "Lekarz", 28765432100L);
        Lekarz trzeciLekarz = new PierwszegoKontaktu("Trzeci", "Lekarz", 38765432100L);
        Lekarz czwartyLekarz = new Chirurg("Czwarty","Lekarz", 48765432100L);
        szpital.rejestrujLekarza(nowyLekarz);
        szpital.rejestrujLekarza(drugiLekarz);
        szpital.rejestrujLekarza(trzeciLekarz);
        szpital.rejestrujLekarza(czwartyLekarz);

        Lekarz znalezionyLekarz = szpital.rejestrujPacjenta(pacjent);

        assertThat(znalezionyLekarz, equalTo(trzeciLekarz));
    }
    @Test
    public void powinienZwrocicNullGdyNieZnajdzieLekarzaPierwszegoKontaktu(){
        Pacjent pacjent = new Pacjent();
        Lekarz nowyLekarz = new Internista("Pierwszy", "Lekarz", 18765432100L);
        Lekarz drugiLekarz = new Internista("Drugi", "Lekarz", 28765432100L);
        Lekarz trzeciLekarz = new Chirurg("Trzeci", "Lekarz", 38765432100L);
        Lekarz czwartyLekarz = new Chirurg("Czwarty","Lekarz", 48765432100L);
        szpital.rejestrujLekarza(nowyLekarz);
        szpital.rejestrujLekarza(drugiLekarz);
        szpital.rejestrujLekarza(trzeciLekarz);
        szpital.rejestrujLekarza(czwartyLekarz);

        Lekarz znalezionyLekarz = szpital.rejestrujPacjenta(pacjent);

        assertThat(znalezionyLekarz, equalTo(null));
    }
    @Test
    public void powinienZwrocicSpecjalisteNaPodstawieSkierowania(){
        Lekarz internista = new Internista("Pierwszy", "Lekarz", 18765432100L);
        szpital.rejestrujLekarza(internista);
        Lekarz chirurg = new Chirurg("Chirurg", "Lekarz", 38765432100L);
        szpital.rejestrujLekarza(chirurg);

        Lekarz znalezionyLekarz = szpital.skierujDoSpecjalisty("Skierowanie do chirurga");

        assertThat(znalezionyLekarz, equalTo(chirurg));
    }
}
