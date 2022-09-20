package JavaCourse.Homework8.exercise1;

public class Main {
    public static void main(String[] args) {
        Product Wardrobe = new Product(400, "wardrobe", "Double door clothes wardrobe", 5);
        System.out.println(Wardrobe.getProductDescription());
        Wardrobe.setQuantity(2);
        System.out.println(String.format("There are still %s %s in stock", Wardrobe.quantity, Wardrobe.name));

        Cosmetics eyePalette= new Cosmetics(300, "Dior Eye Shadow", "Shell shaped, double layer", 20, "Nudes", 1);
        System.out.println(String.format("Total price with shipping for %s, colour %s is %s", eyePalette.name, eyePalette.colour, eyePalette.totalPackagePrice()));

        Electronics coffeeMaker = new Electronics(1000, "Franke dream coffee espressor", "10 type coffee espressor with incorporated milk foamer", 5, "kitchen elctronics", 25,20, 13, 15);
        System.out.println(coffeeMaker.howMuchSpace());

        Fridge Beko = new Fridge(2000, "Grey kitchen beauty","double door fridgo-freezer", 10, "kitchen", 100,200,70, 35, -20 );
        System.out.println("Your fridge's present temperature is" + Beko.getTemp());
        Beko.setHigherTemperature(10);
        System.out.println("Your fridge's temp has been updated, current temp is" + Beko.getTemp());
    }
}
