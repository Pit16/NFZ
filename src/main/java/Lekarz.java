
public class Lekarz extends Czlowiek {

    public Lekarz() {
        super();
    }

    public Lekarz(String imie, String nazwisko, long PESEL) {
        super(imie,nazwisko,PESEL);
    }

    @Override
    public String toString() {
        return pobierzImie() +" " +pobierzNazwisko() +", lekarz";
    }

    public String lecz(Choroba choroba){
        return "Dziekuje za wizyte";
    }

    public String wypiszRecepte() {
        return "Recepta na katar";
    }

    public String dajSkierowanie() {
        return "Skierowanie do specjalisty";
    }

    public Choroba diagnozuj(String objawy) {
        switch (objawy){
            case "Duze zrenice":
                return Choroba.ZMECZENIE;
            case "Cieknie mi z nosa":
                return Choroba.ANGINA;

            default:
                return Choroba.ZDROWY;
        }

    }
}