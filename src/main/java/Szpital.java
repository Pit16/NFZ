import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by pit on 13.05.16.
 */
public class Szpital {

    private static HashMap<String,Type> skierowaniaDoLekarzy = new HashMap<>();
    static {
        skierowaniaDoLekarzy.put("Skierowanie do internisty", Internista.class);
        skierowaniaDoLekarzy.put("Skierowanie do chirurg", Chirurg.class);
    }

    private LinkedList<Lekarz> listaLekarzy = new LinkedList<>();
    private LinkedList<Pacjent> listaPacjentow = new LinkedList<>();

    public void rejestrujLekarza(Lekarz nowyLekarz) {
        listaLekarzy.add(nowyLekarz);

    }

    public String wypiszLekarzy() {

        String lekarzeWSzpitalu = "";
        for(Lekarz lekarz: listaLekarzy){
            lekarzeWSzpitalu +="\n" +lekarz;
        }

        return "Lekarze: " +lekarzeWSzpitalu;
    }

    public Lekarz rejestrujPacjenta(Pacjent pacjent) {
       listaPacjentow.add(pacjent);
        for (Lekarz lekarz: listaLekarzy) {
            if (lekarz instanceof PierwszegoKontaktu){
                return lekarz;
            }
        }
        return null;
    }

    public String wypiszPacjentow() {
        String pacjenciWSzpitalu = "";
        for(Pacjent pacjent: listaPacjentow){
            pacjenciWSzpitalu +="\n" +pacjent;
        }
        return "Lista pacjentow: " +pacjenciWSzpitalu;
    }

    public Lekarz skierujDoSpecjalisty(String skierowanie) {

        for (Lekarz lekarz: listaLekarzy) {
            if (lekarz instanceof Chirurg) { // TODO: zrobic mapowanie SkierowanieDoLekarzy
                return lekarz;
            }
        }
        return null;
    }
}
// TODO: zrobic wyjatek gdy nie znajduje lekarza
