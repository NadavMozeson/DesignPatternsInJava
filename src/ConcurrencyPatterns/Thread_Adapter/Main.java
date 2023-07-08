package ConcurrencyPatterns.Thread_Adapter;

public class Main {
    public static void main(String[] args){
        RunnableC runnable = new RunnableC();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
