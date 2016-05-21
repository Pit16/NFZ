
/**
 * Created by pit on 15.05.16.
 */
public class Chirurg extends Lekarz{


    public Chirurg(String imie, String nazwisko, long PESEL) {
        super(imie,nazwisko,PESEL);
        wymaganeSkierowanie = "Skierowanie do chirurga";
        uleczalneChoroby.add(Choroba.WYROSTEK_ROBACZKOWY);
        uleczalneChoroby.add(Choroba.ZLAMANIE);
    }

    public Chirurg() {
        super();
        wymaganeSkierowanie = "Skierowanie do chirurga";
        uleczalneChoroby.add(Choroba.WYROSTEK_ROBACZKOWY);
        uleczalneChoroby.add(Choroba.ZLAMANIE);
    }
    @Override
    public String lecz (Choroba choroba) throws Exception{
        if(uleczalneChoroby.contains(choroba)){

            return "Przeprowadzam operacje.";
        }
        throw new NieUmiemLeczycTejChoroby();
    }
}
