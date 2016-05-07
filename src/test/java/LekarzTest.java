import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class LekarzTest{
    @Test
    public void powienienLeczyc()throws Exception{
        Lekarz kowalski = new Lekarz();
        String poWizycie = kowalski.lecz();
        assertThat(poWizycie, equalTo("Dziekuje za wizyte"));
    }
}