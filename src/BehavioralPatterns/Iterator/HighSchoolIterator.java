package BehavioralPatterns.Iterator;

import java.util.List;

public class HighSchoolIterator implements Iterator {
    public final List<Student> students;
    private int index = 0;

    public HighSchoolIterator(List<Student> students) { this.students = students; }

    @Override
    public Student nextStudent() {
        Student student = null;
        for (; index < students.size(); index++) {
            if ((students.get(index)).getType().equals("High School")) {
                student = students.get(index);
                index++;
                break;
            }
        }
        return student;
    }

    @Override
    public boolean isLastStudent() {
        for (int i = index; i < students.size(); i++) {
            if ((students.get(i)).getType().equals("High School")){
                return false;
            }
        }
        return true;
    }

    @Override
    public Student currentStudent() {
        for (; index < students.size(); index++) {
            if (students.get(index).getType().equals("High School")){
                return students.get(index);
            }
        }
        return null;
    }
}
