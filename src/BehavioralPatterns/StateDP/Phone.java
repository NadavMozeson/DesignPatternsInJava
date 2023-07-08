package BehavioralPatterns.StateDP;

public class Phone {
    private MobileAlertState currentState;

    public Phone() {
        currentState = new Vibration();
    }

    public void setState(MobileAlertState state) {
        currentState = state;
    }

    public void alert() { currentState.alert(this); }
}

