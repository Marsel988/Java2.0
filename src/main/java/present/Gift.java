package present;

public class Gift {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Candy1", 1.4, 5, false);
        Candy candy2 = new Candy("Candy2", 10, 45, true);
        Candy candy3 = new Candy("Candy3", 0.5, 1.99, true);
        Jellybean jellybean1 = new Jellybean("Jellybean1", 13, 20, 15.6);
        Jellybean jellybean2 = new Jellybean("Jellybean2", 59, 70, 79);
        Jellybean jellybean3 = new Jellybean("Jellybean3", 23, 24.5, 40);
        Chocolate chocolate1 = new Chocolate("Chocolate1", 0.25, 2, "white");
        Cake cake = new Cake("Cake", 0.5, 9.92, 15);
        SomeSweet[] gift = {cake, chocolate1, candy1, candy2, candy3, jellybean1, jellybean2, jellybean3};
        double totalWeight = 0;
        double totalPrice = 0;
        for (SomeSweet sweet : gift) {
            System.out.println(sweet);
            totalPrice += sweet.getPrice();
            totalWeight += sweet.getWeight();
        }
        System.out.println("Total Weight: " + totalWeight + "\n" + "Total Price: " + totalPrice +" $");
    }
}
