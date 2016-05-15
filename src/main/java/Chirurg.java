/**
 * Created by pit on 15.05.16.
 */
public class Chirurg extends Lekarz{

    public Chirurg(String imie, String nazwisko, long PESEL) {
        super(imie,nazwisko,PESEL);
    }

    public Chirurg() {
        super();
    }
    @Override
    public String lecz (Choroba choroba){
        return "Zalozylem gips.";
    }
}
