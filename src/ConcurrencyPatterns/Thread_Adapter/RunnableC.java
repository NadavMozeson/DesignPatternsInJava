package ConcurrencyPatterns.Thread_Adapter;

public class RunnableC extends C implements Runnable{
    @Override
    public void run() {
        func();
    }
}
