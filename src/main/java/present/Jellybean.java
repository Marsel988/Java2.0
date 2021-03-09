package present;

public class Jellybean extends SomeSweet{
    private double amountOfSugar;

    public Jellybean() {
    }

    public Jellybean(String name, double weight, double price, double amountOfSugar) {
        super(name, weight, price);
        this.amountOfSugar = amountOfSugar;
    }

    @Override
    public String toString() {
        return "Jellybean " + super.toString() + ", sugar percent = " + amountOfSugar + "}";
    }

    public double getAmountOfSugar() {
        return amountOfSugar;
    }

    public void setAmountOfSugar(float amountOfSugar) {
        this.amountOfSugar = amountOfSugar;
    }
}
