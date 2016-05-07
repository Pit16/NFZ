/**
 * Created by pit on 07.05.16.
 */
public class Pacjent {

    private String imie;
    private String nazwisko;
    private long PESEL;


    public Pacjent(String imie, String nazwisko, long PESEL) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
    }

    public Pacjent() {
        imie = "Zenek";
        nazwisko = "Maniek";
        PESEL = 98765432101L;
    }

    public String pobierzImie() {
        return imie;
    }

    public String pobierzNazwisko() {
        return nazwisko;
    }

    public long pobierzPESEL() {
        return PESEL;
    }
}
