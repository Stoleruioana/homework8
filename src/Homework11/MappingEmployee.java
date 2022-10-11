package Homework11;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class MappingEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Wayne", 35, "black", "Endava", 2500));
        employees.add(new Employee("Jack Sparrow", 50, "black", "NTT", 1500));
        employees.add(new Employee("Jim Beam", 36, "bold", "Iquest", 2000));
        employees.add(new Employee("Jane End", 27, "blonde", "NTT", 1500));
    }

    public static ArrayList<String> goodSalary (ArrayList<Employee> employees, int sum) {
        ArrayList<String> result = new ArrayList<>();
        for (Employee i: employees) {
            if (i.getSalary()>sum) {
                result.add(i.getName());
            }
        } return result;
    }

    public static HashMap<String, ArrayList<String>> companyEmployees(ArrayList<Employee> employees) {
        HashMap<String, ArrayList<String>> result = new HashMap<>();

        for (Employee p: employees) {
            if (!result.containsKey(p.getCompany())) {
                result.put(p.getCompany(), new ArrayList<>());
                result.get(p.getCompany()).add(p.getName());
            } else result.get(p.getCompany()).add(p.getName());
        } return result;
    }
}
