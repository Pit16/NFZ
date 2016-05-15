/**
 * Created by pit on 15.05.16.
 */
public class PierwszegoKontaktu extends Lekarz{

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
}
