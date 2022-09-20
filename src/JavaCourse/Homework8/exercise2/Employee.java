package JavaCourse.Homework8.exercise2;
import java.util.Date;

public class Employee implements Person {
    String firstName;
    String lastName;
    Date birthDate;
    String Adress;
    Date dateOfEmployment;
    String position;

    public Employee (String firstName, String lastName, Date dateOfBirth, String Adress, Date employment, String position) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate = dateOfBirth;
        this.Adress = Adress;
        this.dateOfEmployment= employment;
        this.position=position;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public Date getBirthday() {
        return this.birthDate;
    }

    @Override
    public String getAdress() {
        return this.Adress;
    }
}
