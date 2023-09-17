import java.net.InetAddress;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Seller seller1 = new Seller("Frodo Baggins",
                LocalDate.of(1968, 9, 22), 15, 3,
                "The Shire", "111 FRODO", 8, "68.12.5.10");

        double averageSell = seller1.getWeight()/seller1.getNumberOfContracts();
        System.out.println("Průměrně se na jednu smlouvu prodalo " + averageSell+ " tun mrkve.");

    }
}