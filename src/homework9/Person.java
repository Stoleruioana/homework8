package homework9;
import java.util.ArrayList;

public class Person {
    private String name;
    private String occupation;
    private int age;

    public Person(String name, String occupation, int age) {
        this.name=name;
        this.occupation=occupation;
        this.age=age;
    }

    public String getName() {
        return this.name;
    }

    public String getOccupation(){
        return this.occupation;
    }

    public int getAge() {
        return this.age;
    }
}

