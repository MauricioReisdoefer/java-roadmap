class NewThread extends Thread {
    @Override
    public void run() {
        System.out.println("Running on thread: " + Thread.currentThread().getName());
    }
}

public class ThreadsJava {
    public static void main(String[] args) {
        NewThread t1 = new NewThread();
        t1.start(); // Starts new thread
        System.out.println("This is the main thread");
    }
}
