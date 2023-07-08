package BehavioralPatterns.Iterator;

import java.util.List;

public class CollegeIterator implements Iterator{
    public final List<Student> students;
    private int index = 0;

    public CollegeIterator(List<Student> students) { this.students = students; }

    @Override
    public Student nextStudent() {
        Student student = null;
        for (; index < students.size(); index++) {
            if ((students.get(index)).getType().equals("College")) {
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
            if ((students.get(i)).getType().equals("College")){
                return false;
            }
        }
        return true;
    }

    @Override
    public Student currentStudent() {
        if (index < students.size()){
            if (students.get(index).getType().equals("College")){
                return students.get(index);
            }
        }
        return null;
    }
}
