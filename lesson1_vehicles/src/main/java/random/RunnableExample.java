package random;

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from Runnable");
    }

    Thread getThread() {
        return new Thread(this);
    }
}
