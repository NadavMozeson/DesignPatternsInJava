package BehavioralPatterns.Memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("Lion");
        Memento memento = originator.createMemento(); // שומרים את המצב
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(memento); // שומרים תמצב ברשימה
        originator.setState("Tiger");
        originator.setState("Horse");
        memento = originator.createMemento();
        caretaker.addMemento(memento);
        originator.setState("Elephant");
        System.out.println("Originator Current State: " + originator.getState()); // -> "Elephant"
        System.out.println("Originator restoring to previous state..."); // -> לך אחורה למצב הקודם
        memento = caretaker.getMemento(1);
        originator.setMemento(memento);
        System.out.println("Originator Current State: " + originator.getState()); // -> "Horse"
        System.out.println("Again restoring to previous state..."); //-> לך אחורה למצב הקודם
        memento = caretaker.getMemento(0);
        originator.setMemento(memento);
        System.out.println("Originator Current State: " + originator.getState()); // -> "Lion"
    }
}
