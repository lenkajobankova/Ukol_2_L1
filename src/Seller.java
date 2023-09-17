import java.time.LocalDate;

public class Seller {
    String name, cityName, carIdentification, ip;
    int numberOfContracts, consumption;
    LocalDate born;
    double weight;

    public Seller(String name, LocalDate born, int numberOfContracts, double weight,
                  String cityName, String carIdentification, int consumption, String ip){
        this.name = name;
        this.born = born;
        this.numberOfContracts = numberOfContracts;
        this.weight = weight;
        this.cityName = cityName;
        this.carIdentification = carIdentification;
        this.consumption = consumption;
        this.ip = ip;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumberOfContracts() {
        return numberOfContracts;
    }

    public void setNumberOfContracts(int numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }
}
