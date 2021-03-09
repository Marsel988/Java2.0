package present;

public class Candy extends SomeSweet {
    private boolean isWithFilling;

    public Candy() {
    }

    public Candy(String name, double weight, double price, boolean isWithFilling) {
        super(name, weight, price);
        this.isWithFilling = isWithFilling;
    }

    @Override
    public String toString() {
        return "Candy " + super.toString() + ", filling = " + isWithFilling + "}";
    }
}
