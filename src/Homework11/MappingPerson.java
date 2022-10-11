package Homework11;

import java.util.ArrayList;
import java.util.HashMap;


public class MappingPerson {
    public static void main(String[] args) {
        ArrayList<Person> PersonsToStudy = new ArrayList<>();
        PersonsToStudy.add(new Person("John Gable", 30, "brown"));
        PersonsToStudy.add(new Person("Stephen King", 65, "bold"));
        PersonsToStudy.add(new Person("Karl May", 100, "blonde"));

        System.out.println(nameExtractor(PersonsToStudy));
    }

    public static ArrayList<String> nameExtractor(ArrayList<Person> Persons) {
        ArrayList<String> names = new ArrayList<>();
        for (Person p: Persons) {
            names.add(p.getName());
        }
        return names;
    }

    public static HashMap<String, Integer> MappingPersons(ArrayList<Person> Persons) {
        HashMap<String, Integer> returnValues = new HashMap<>();
        for (Person p: Persons) {
            returnValues.put(p.getName(), p.getAge());
        }
        return returnValues;
    }

    public static HashMap<String, ArrayList<String>> MappingHair(ArrayList<Person> Persons) {
        HashMap<String, ArrayList<String>> returnValues = new HashMap<>();
        for (Person p:Persons) {
            if (!returnValues.containsKey(p.getHairColour())) {
                returnValues.put(p.getHairColour(), new ArrayList<String>());
                returnValues.get(p.getHairColour()).add(p.getName());
            } else returnValues.get(p.getHairColour()).add(p.getName());
        }
        return returnValues;
    }

    public static HashMap<Integer, ArrayList<String>> MappingAge(ArrayList<Person> Persons) {
        HashMap<Integer, ArrayList<String>> result = new HashMap<>();
        for (Person p:Persons) {
            if (!result.containsKey(p.getAge())) {
                result.put(p.getAge(), new ArrayList<String>());
                result.get(p.getAge()).add(p.getName());
            } else result.get(p.getAge()).add(p.getName());
        }
        return result;
    }
}
