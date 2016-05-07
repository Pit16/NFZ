import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class LekarzTest {

    Lekarz lekarz = new Lekarz();

    @Test
    public void powienienLeczyc() throws Exception{
        String poWizycie = lekarz.lecz();

        assertThat(poWizycie, equalTo("Dziekuje za wizyte"));
    }

    @Test
    public void powinienWypisacRecepte() throws Exception {
        String recepta = lekarz.wypiszRecepte();

        assertThat(recepta, equalTo("Recepta na katar"));
    }

    @Test
    public void powinienSkierowacDoSpecjalisty() throws Exception {
        String skierowanie = lekarz.dajSkierowanie();

        assertThat(skierowanie, equalTo("Skierowanie do specjalisty"));
    }
}