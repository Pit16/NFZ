/**
 * Created by pit on 07.05.16.
 */

public class Pacjent extends Czlowiek{

    private Choroba choroba;
    private String objawy;

    public Pacjent() {
        super();
        choroba = Choroba.ZDROWY;
        objawy = "Brak objawow";
    }

    public Pacjent(String imie, String nazwisko, long PESEL) {
        super(imie,nazwisko,PESEL);
        choroba = Choroba.ZDROWY;
        objawy = "Brak objawow";
    }

    @Override
    public String toString() {
        return pobierzImie() +" " +pobierzNazwisko() +", chory";
    }

    public String przedstawObjawy() {
        return objawy;
    }

    public void ustawChorobe(Choroba choroba) {
        this.choroba = choroba;
    }

    public Choroba pokazChorobe() {
        return choroba;
    }

    public void ustawObjawy(String objawy) {
        this.objawy = objawy;
    }
}
