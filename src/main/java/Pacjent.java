/**
 * Created by pit on 07.05.16.
 */

public class Pacjent extends Czlowiek{

    public Pacjent(String imie, String nazwisko, long PESEL) {
        super(imie,nazwisko,PESEL);
    }

    public Pacjent() {
        super();
    }

    public String przedstawObjawy() {
        return "Cieknie mi z nosa";
    }
}
