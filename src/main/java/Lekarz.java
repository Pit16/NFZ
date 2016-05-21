
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
    //TODO: A moze zrobic dla chirurga wyswietla chirurg a nie lekarz

    public String lecz(Choroba choroba){
        return "Dziekuje za wizyte";
    }

    public String wypiszRecepte() {
        return "Recepta na katar";
    }

    public String dajSkierowanie(Choroba choroba) {
        return "Skierowanie do specjalisty";
    }

    public Choroba diagnozuj(String objawy) {
        return Choroba.NIEZNANA;
    }
}