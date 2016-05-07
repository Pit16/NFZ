
public class Lekarz extends Czlowiek {

    public Lekarz(String imie, String nazwisko, long PESEL) {
        super(imie,nazwisko,PESEL);
    }

    @Override
    public String toString() {
        return pobierzImie() +" " +pobierzNazwisko() +", lekarz";
    }

    public Lekarz() {
        super();
    }
    public String lecz(){
        return "Dziekuje za wizyte";
    }

    public String wypiszRecepte() {
        return "Recepta na katar";
    }

    public String dajSkierowanie() {
        return "Skierowanie do specjalisty";
    }
}