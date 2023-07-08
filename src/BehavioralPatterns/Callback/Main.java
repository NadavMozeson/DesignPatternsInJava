package BehavioralPatterns.Callback;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        Callback callback = new CallbackImpl();
        String inputData = "Hello, World!";
        processor.processData(inputData, callback); // -> "Processing complete. Result: HELLO, WORLD!"
    }
}
