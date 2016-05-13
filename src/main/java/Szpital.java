import java.util.LinkedList;

/**
 * Created by pit on 13.05.16.
 */
public class Szpital {

    private LinkedList<Lekarz> listaLekarzy = new LinkedList<>();

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

}
