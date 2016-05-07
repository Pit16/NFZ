/**
 * Created by pit on 07.05.16.
 */

public class Pacjent extends Czlowiek{

    private Choroba choroba;

    public Pacjent() {
        super();
        choroba = Choroba.ZDROWY;
    }

    public Pacjent(String imie, String nazwisko, long PESEL) {
        super(imie,nazwisko,PESEL);
        choroba = Choroba.ZDROWY;
    }

    @Override
    public String toString() {
        return pobierzImie() +" " +pobierzNazwisko() +", chory";
    }

    public String przedstawObjawy() {
        return "Cieknie mi z nosa";
    }

    public void ustawChorobe(Choroba choroba) {
        this.choroba = choroba;
    }

    public Choroba pokazChorobe() {
        return choroba;
    }
}
