package JavaCourse.Homework8.exercise1;

public class Electronics extends Product {
    String type;
    float length,width, height, weight;


    public Electronics(int price, String name, String description, int quantity, String type, float length, float height, float width, float weight) {
        super(price, name, description, quantity);
        this.type =type;
        this.length = length;
        this.width =width;
        this.height= height;
        this.weight= weight;
    }

    public String howMuchSpace () {
        return String.format("For your %s you need a space that is %s high, %s Long," +
                "%s wide for it to fit in your home", this.name, this.height, this.length, this.width);
    }
}
