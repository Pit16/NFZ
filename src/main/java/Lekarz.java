import java.util.LinkedList;

/**
 * Klasa odpowiedzialna za rozpoznawanie choroby oraz jej leczenie
 * @author Piotr Katerzawa
 *
 */
public class Lekarz extends Czlowiek {

    protected String wymaganeSkierowanie = "Skierowanie do specjalisty";
    protected LinkedList<Choroba> uleczalneChoroby = new LinkedList<>();

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


    /**
     * Sprawia, ze lekarz leczy chorobe i zwraca recepty lub akcje ktora
     * lekarz wykonal.
     *
     * @param choroba choroba, ktora trzeba wyleczyc
     * @return akcja wykonywana przez lekarza
     * @throws NieUmiemLeczycTejChoroby gdy dana choroba nie jest z profesii tego lekarza
     */
    public String lecz(Choroba choroba)throws NieUmiemLeczycTejChoroby{
        return "Dziekuje za wizyte";
    }

    public String wypiszRecepte() {
        return "Recepta na katar";
    }

    public String dajSkierowanie(Choroba choroba) {
        return "Skierowanie do specjalisty";
    }

    /**
     * Rozpoznaje chorobe a podstawie objawow.
     *
     * @param objawy z jakimi zglasza sie pacjent
     * @return chorobe rozpoznana
     */
    public Choroba diagnozuj(String objawy) {
        return Choroba.NIEZNANA;
    }
    public String dajWymaganeSkierowanie() {
        return wymaganeSkierowanie;
    }
}