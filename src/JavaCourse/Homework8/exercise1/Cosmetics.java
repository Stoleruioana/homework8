package JavaCourse.Homework8.exercise1;

public class Cosmetics extends Product {

    String colour;
    private int weight;

    public Cosmetics(int price, String name, String description, int quantity, String colour, int weight) {
        super(price, name, description, quantity);
        this.colour = colour;
        this.weight = weight;
    }

    // use this method to determine the price of the package adding the shipping price depending on its weight
    public int totalPackagePrice() {
        if (this.weight > 20) {
            return price + 200;
        } else {
            return price + 100;
        }
    }

    }


