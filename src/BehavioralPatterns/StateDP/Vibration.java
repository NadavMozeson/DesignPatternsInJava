package BehavioralPatterns.StateDP;

public class Vibration implements MobileAlertState{
    @Override
    public void alert(Phone phone) {
        System.out.println("vibration...");
    }
}
