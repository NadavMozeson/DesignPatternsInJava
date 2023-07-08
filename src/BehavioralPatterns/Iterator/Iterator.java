package BehavioralPatterns.Iterator;

public interface Iterator {
    Student nextStudent();
    boolean isLastStudent();
    Student currentStudent();
}

