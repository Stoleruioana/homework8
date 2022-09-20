package JavaCourse.Homework8.exercise1;

public class Product {
     int price;
     String name;
     String Description;
     int quantity;

    public Product (int price, String name, String description, int quantity) {
        this.price=price;
        this.name=name;
        this.Description=description;
        this.quantity=quantity;
    }

    public String getProductDescription() {
        return String.format("The %s you chose has the following specifications: %s", name,Description);
    }

    // use this method when a product is sold and its quatity decreases
    public void setQuantity(int soldProducts) {
        this.quantity-=soldProducts;
    }


}
