//Write a program to sort a list of custom objects (e.g., Student with name and marks) using a Comparator.

import java.util.*;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', marks=" + marks + "}";
    }
}

class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getMarks(), s1.getMarks()); 
    }
}

public class StudentSorter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));
        students.add(new Student("David", 90));
        
        System.out.println("Before Sorting: " + students);
        
        students.sort(new MarksComparator());
        
        System.out.println("After Sorting by Marks (Descending): " + students);
    }
}
