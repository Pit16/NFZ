/**
 * Created by pit on 15.05.16.
 */
public class Internista extends Lekarz{

    public Internista(String imie, String nazwisko, long PESEL) {
        super(imie,nazwisko,PESEL);
    }

    public Internista() {
        super();
    }
    @Override
    public String lecz (Choroba choroba) {
        return "Prosze odpoczac dwa dni w domu.";
    }
}
