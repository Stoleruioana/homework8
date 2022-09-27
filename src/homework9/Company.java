package homework9;
import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {
        ArrayList<Person> employees = new ArrayList<Person>();
        employees.add(new Person("John Doe", "Manager", 42));
        employees.add(new Person ("Mike Spencer","plummer",35 ));
        employees.add(new Person("Mike Tyson", "welder",55));
        employees.add(new Person("Roger Federer", "carpenter", 42));
        System.out.println(getManager(employees));


    }
    public static Person getManager(ArrayList<Person> listEmployees) {
         int d= listEmployees.size();
         for (int i=0; i<d; i++) {
             if (getOccupation(listEmployees.get(i)) ==
         }
    }



    }
}
