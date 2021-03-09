package present;

public class Cake extends SomeSweet {
    private int diameter;

    public Cake() {
    }

    public Cake(String name, double weight, double price, int diameter) {
        super(name, weight, price);
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Cake " + super.toString() + ", diameter = " + diameter + "}";
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
