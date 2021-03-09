package present;

public class Chocolate extends SomeSweet {
    private String color;

    public Chocolate() {
    }

    public Chocolate(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chocolate " + super.toString() + ", color = }" + color + "}";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
