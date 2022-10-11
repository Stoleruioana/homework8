package Homework11;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.*;

public class StudentMapEx1 {

    public static void main(String[] args) {
        HashMap<String, Integer> StudentMap = new HashMap<>();
        StudentMap.put("Gilbert Mark", 9);
        StudentMap.put("White Ann", 8);
        StudentMap.put("Boleyn Ann", 10);
        StudentMap.put("Tudor Henry", 10);
        System.out.println(StudentMap);
        System.out.println(highestGradeStudents(StudentMap));
    }

    public static HashMap<Integer, ArrayList<String>> highestGradeStudents(HashMap<String, Integer> StudentMap) {
        Integer maxGrade = 0;
        for (Integer i: StudentMap.values()) {
            if (i>maxGrade) {maxGrade=i;}
        }
        HashMap<Integer, ArrayList<String>> highest = new HashMap<>();
        highest.put(maxGrade, new ArrayList<String>());

        Set<Map.Entry<String, Integer>> entries = StudentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() ==maxGrade) {
                highest.get(maxGrade).add(entry.getKey());
            }
        } return highest;
    }
}
