import java.util.LinkedList;

/**
 * Created by pit on 13.05.16.
 */
public class Szpital {

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
}
