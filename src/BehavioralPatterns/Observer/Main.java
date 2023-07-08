package BehavioralPatterns.Observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Observer channel1 = new NewsChannel("Channel 1");
        Observer channel2 = new NewsChannel("Channel 2");
        Observer channel3 = new NewsChannel("Channel 3");

        newsAgency.registerObserver(channel1);
        newsAgency.registerObserver(channel2);
        newsAgency.registerObserver(channel3);

        newsAgency.publishNews("Breaking news!");

        newsAgency.unregisterObserver(channel2);

        newsAgency.publishNews("Another news!");
    }
}
