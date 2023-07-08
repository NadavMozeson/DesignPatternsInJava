package BehavioralPatterns.Callback;

public class DataProcessor {
    void processData(String data, Callback callback) {
        String processedData = data.toUpperCase();
        callback.onComplete(processedData);
    }
}
