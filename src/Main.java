import java.net.InetAddress;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String name = "Frodo";
        String surname = "Baggins";
        LocalDate dateOfBirth = LocalDate.of(1968, 9, 22);
        int numberOfContracts = 15;
        double weight = 3;
        String cityName = "The Shire";
        String carIdentification = "111 FRODO";
        int consumption = 8;
        String ip = "68.12.5.10";

        double averageSell = weight/numberOfContracts;
        System.out.println("Průměrně se na jednu smlouvu prodalo " + averageSell+ " tun mrkve.");

    }
}