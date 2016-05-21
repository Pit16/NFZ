/**
 * Created by pit on 15.05.16.
 */
public class Chirurg extends Lekarz{

    public Chirurg(String imie, String nazwisko, long PESEL) {
        super(imie,nazwisko,PESEL);
        wymaganeSkierowanie = "Skierowanie do chirurga";
    }

    public Chirurg() {
        super();
        wymaganeSkierowanie = "Skierowanie do chirurga";
    }
    @Override
    public String lecz (Choroba choroba){
        return "Zalozylem gips.";
    }
}
