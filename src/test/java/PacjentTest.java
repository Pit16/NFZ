/**
 * Created by pit on 07.05.16.
 */

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class PacjentTest {
    
    @Test
    public void powinienStworzycPacjenta(){
        Pacjent chorowitek = new Pacjent();
        assertThat(chorowitek.pobierzImie(), equalTo("Zenek"));
    }
}
