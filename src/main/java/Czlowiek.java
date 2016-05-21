/**
 * Created by pit on 07.05.16.
 */
public abstract class Czlowiek {

    private String imie;
    private String nazwisko;
    private long PESEL;

    public static final String DOMYSLNE_IMIE = "Zenek";
    public static final String DOMYSLNE_NAZWISKO = "Maniek";
    public static final long DOMYSLNY_PESEL = 98765432101L;

    public Czlowiek(){
        imie = DOMYSLNE_IMIE;
        nazwisko = DOMYSLNE_NAZWISKO;
        PESEL = DOMYSLNY_PESEL;
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

    public abstract String toString();

}
