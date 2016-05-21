/**
 * Created by pit on 21.05.16.
 */
public class NieZnalezionoLekarzaPierwszegoKontaktu extends Exception {
    @Override
    public String getMessage(){
        return "Nie ma w szpitalu lekarza Pierwszego Kontaktu";
    }
}
