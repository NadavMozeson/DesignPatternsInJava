package BehavioralPatterns.Observer;

public class NewsChannel implements Observer {
    private String channelName;

    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(String message) {
        System.out.println("Received news on " + channelName + ": " + message);
    }
}
