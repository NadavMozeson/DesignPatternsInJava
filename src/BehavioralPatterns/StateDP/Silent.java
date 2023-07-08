package BehavioralPatterns.StateDP;

public class Silent implements MobileAlertState{
    @Override
    public void alert(Phone phone) {
        System.out.println("silent...");
    }
}
