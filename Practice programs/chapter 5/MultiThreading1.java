class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running via Runnable: " + Thread.currentThread().getName());
    }
}

public class MultiThreading1 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task); // Pass runnable to Thread constructor
        thread.start(); // Spawns the new thread
    }
}
