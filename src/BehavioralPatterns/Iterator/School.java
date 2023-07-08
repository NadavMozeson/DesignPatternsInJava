package BehavioralPatterns.Iterator;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents(){return students;}

    public void addStudent(Student student){students.add(student);}

    public void removeStudent(Student student){students.remove(student);}

    public Iterator createIterator(String type) {
        if (type.equals("High School")){
            return new HighSchoolIterator(students);
        }else{
            return new CollegeIterator(students);
        }
    }
}
