/**
 * Created by pit on 15.05.16.
 */
public class PierwszegoKontaktu extends Lekarz{

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
}
