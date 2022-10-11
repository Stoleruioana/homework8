package Homework11;
import java.util.ArrayList;
public class Person {
    private String name;
    private int age;
    private String hairColour;


    public Person(String name, int age, String hairColour) {
        this.name=name;
        this.age=age;
        this.hairColour=hairColour;
    }

    public int getAge() {
        return age;
    }

    public String getHairColour() {
        return hairColour;
    }

    public String getName() {
        return name;
    }
}