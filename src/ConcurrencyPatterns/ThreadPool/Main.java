package ConcurrencyPatterns.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new TestRunnable());
        }
        executorService.shutdown();
    }
}

class TestRunnable implements Runnable {
    public void run() {
        synchronized (System.out){
            System.out.println("Running");
        }
        try {
            Thread.sleep(2000);
            synchronized (System.out){
                System.out.println("Finished Running");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}