package present;

public abstract class SomeSweet {
    private String name;
    private double weight;
    private double price;

    public SomeSweet() {
    }

    public SomeSweet(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "name = '" + name + '\'' +
                ", weight = " + weight +
                ", price = " + price +
                '}';
    }
}
