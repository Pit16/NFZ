import java.util.HashMap;

/**
 * Created by pit on 15.05.16.
 */
public class PierwszegoKontaktu extends Lekarz{

    private static HashMap<Choroba,String> mapaSkierowan = new HashMap<>();
    static {
        mapaSkierowan.put(Choroba.ZMECZENIE, "Skierowanie do internisty");
        mapaSkierowan.put(Choroba.ANGINA, "Skierowanie do internisty");
        mapaSkierowan.put(Choroba.WYROSTEK_ROBACZKOWY, "Skierowanie do chirurga");
        mapaSkierowan.put(Choroba.ZLAMANIE, "Skierowanie do chirurga");
    }

    public PierwszegoKontaktu(String imie, String nazwisko, long PESEL) {
        super(imie,nazwisko,PESEL);
    }

    public PierwszegoKontaktu() {
        super();
    }

    @Override
    public Choroba diagnozuj(String objawy) {
        switch (objawy) {
            case "Duze zrenice":
                return Choroba.ZMECZENIE;
            case "Cieknie mi z nosa":
                return Choroba.ANGINA;

            default:
                return Choroba.ZDROWY;
        }
    }

    @Override
    public String dajSkierowanie(Choroba choroba) {

        return mapaSkierowan.get(choroba);
    }

}
