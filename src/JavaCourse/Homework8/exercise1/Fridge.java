package JavaCourse.Homework8.exercise1;

import JavaCourse.Homework8.exercise1.Electronics;

public class Fridge extends Electronics {
    private int temp;

    public Fridge(int price, String name, String description, int quantity, String type, float length, float height, float width, float weight, int temp) {
        super(price, name, description, quantity, type, length, height, width, weight);
    this.temp=temp;
    }

    public void setLowerTemperature(int i) {
        this.temp-=i;
    }

    public void setHigherTemperature(int i) {
        this.temp+=i;
    }

    public int getTemp() {
        return temp;
    }
}
