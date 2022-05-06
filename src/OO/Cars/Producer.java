package OO.Cars;

public class Producer {

    private String country;
    private String name;

    private double discount;

    public Producer(String country, String name, double discount) {
        this.country = country;
        this.name = name;
        this.discount = discount;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }
}
