import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class LekarzTest {

    @Test
    public void powienienLeczyc() throws Exception{
        Lekarz lekarz = new Lekarz();
        String poWizycie = lekarz.lecz();
        assertThat(poWizycie, equalTo("Dziekuje za wizyte"));
    }

    @Test
    public void powinienWypisacRecepte() throws Exception {
        Lekarz lekarz = new Lekarz();
        String recepta = lekarz.wypiszRecepte();
        assertThat(recepta, equalTo("Recepta na katar"));
    }
}