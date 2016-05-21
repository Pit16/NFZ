/**
 * Created by pit on 21.05.16.
 */
public class NFZ {
    public static void main(String[] args){

        Szpital woloska = new Szpital();
        Lekarz chirurg = new Chirurg("Maciek", "Chirurg", 11223345678L);
        Lekarz chirurgDrugi = new Chirurg("Zenek", "Chirurg", 21223345678L);
        Lekarz internista = new Internista("Franek", "Internista", 11123345678L);
        Lekarz internistaDrugi = new Internista("Kuba", "Internista", 21123345678L);
        Lekarz lekarzPK = new PierwszegoKontaktu("Wladek", "PierwszegoKontaktu", 11113345678L);
        Lekarz lekarzPKDrugi = new PierwszegoKontaktu("Stasiek", "PierwszegoKontaktu", 21113345678L);

        woloska.rejestrujLekarza(chirurg);
        woloska.rejestrujLekarza(chirurgDrugi);
        woloska.rejestrujLekarza(internista);
        woloska.rejestrujLekarza(internistaDrugi);
        woloska.rejestrujLekarza(lekarzPK);
        woloska.rejestrujLekarza(lekarzPKDrugi);

        System.out.println(woloska.wypiszLekarzy());

        Pacjent pacjent = new Pacjent();
        pacjent.ustawObjawy("Duze zrenice");

        Lekarz lekarzDoPierwszegoPacjenta = woloska.rejestrujPacjenta(pacjent);

        System.out.println(woloska.wypiszPacjentow());
        System.out.println(lekarzDoPierwszegoPacjenta);
        Choroba chorobaPierwszegoPacjetna = lekarzDoPierwszegoPacjenta.diagnozuj(pacjent.przedstawObjawy());

        System.out.println(chorobaPierwszegoPacjetna);
        pacjent.ustawChorobe(chorobaPierwszegoPacjetna);
        String skierowanieDlaPacjenta = lekarzDoPierwszegoPacjenta.dajSkierowanie(chorobaPierwszegoPacjetna);
        Lekarz specjalistaDlaPacjenta = woloska.skierujDoSpecjalisty(skierowanieDlaPacjenta);
        String recepta = specjalistaDlaPacjenta.lecz(chorobaPierwszegoPacjetna);
        System.out.println(recepta);

    }
}
