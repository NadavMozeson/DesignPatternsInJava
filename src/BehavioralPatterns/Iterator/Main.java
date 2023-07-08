package BehavioralPatterns.Iterator;

public class Main {
    public static void main(String[] args){
        School school = new School();
        school.addStudent(new Student("Tamir", "High School"));
        school.addStudent(new Student("Aviv", "College"));
        school.addStudent(new Student("Tom", "High School"));
        school.addStudent(new Student("Jack", "High School"));
        school.addStudent(new Student("Maor", "College"));
        Iterator highSchoolIterator = school.createIterator("High School");
        System.out.println("First Student: " + highSchoolIterator.currentStudent().getName());
        while (!highSchoolIterator.isLastStudent()){
            System.out.println("High School Student: " + highSchoolIterator.nextStudent().getName());
        }
        Iterator collegeIterator = school.createIterator("College");
        while (!collegeIterator.isLastStudent()){
            System.out.println("College Student: " + collegeIterator.nextStudent().getName());
        }
    }
}
