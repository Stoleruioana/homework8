package homework9;
import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {
        ArrayList<Person> employees = new ArrayList<Person>();
        employees.add(new Person("John Doe", "Manager", 42));
        employees.add(new Person ("Mike Spencer","plummer",35 ));
        employees.add(new Person("Mike Tyson", "welder",55));
        employees.add(new Person("Roger Federer", "carpenter", 42));
        System.out.println(getManager(employees).getName());

        ArrayList<Person> occupied = getPersons(employees, "plummer");
        if (occupied.size()>0) {
            for (int i=0; i<occupied.size();i++) {
                System.out.println(occupied.get(i).getName());
            }
        }

        ArrayList<Person> older = getOlder(employees, 35);
        if (older.size()>0) {
            for (int i=0; i<older.size();i++) {
                System.out.println(older.get(i).getName());
            }
        }

    }
    public static Person getManager(ArrayList<Person> listEmployees) {
        int d = listEmployees.size();
        String s = "manager";
        Person manager = null;
        for (int i = 0; i < d; i++) {
            Person employee = listEmployees.get(i);
            if (s.equalsIgnoreCase(employee.getOccupation())) {
                manager = employee;
            }
        }
        return manager;
    }

    public static ArrayList<Person> getPersons(ArrayList<Person> listEmployees, String job) {
        int d=listEmployees.size();
        ArrayList<Person> occupied = new ArrayList<>();
        for (int i=0; i<d; i++) {
            Person employee=listEmployees.get(i);
            if (job.equalsIgnoreCase(employee.getOccupation())) {
                occupied.add(employee);
            }
        }
        return occupied;

    }

    public static ArrayList<Person> getOlder(ArrayList<Person> listEmployees, int age) {
        int d=listEmployees.size();
        ArrayList<Person> older = new ArrayList<>();
        for (int i=0; i<d; i++) {
            Person employee=listEmployees.get(i);
            if (age < employee.getAge()) {
                older.add(employee);
            }
        }
        return older;

    }

}
