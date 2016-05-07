/**
 * Created by pit on 07.05.16.
 */
public abstract class Czlowiek {

    private String imie;
    private String nazwisko;
    private long PESEL;

    public Czlowiek(){
        imie = "Zenek";
        nazwisko = "Maniek";
        PESEL = 98765432101L;
    }

    public Czlowiek(String imie, String nazwisko, long PESEL) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
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
