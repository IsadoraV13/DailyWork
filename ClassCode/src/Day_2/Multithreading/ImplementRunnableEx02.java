package Day_2.Multithreading;

public class ImplementRunnableEx02 implements Runnable {
    Thread threadFive;

    public ImplementRunnableEx02(String name) {
        threadFive = new Thread(this, "Thread 5");
    }

    @Override
    public void run() {
        System.out.println(threadFive.getName() + " starting without start() in its constructor so run() is called from main");
        System.out.println(threadFive.getName() + " still running. Will the main method complete before it?");
    }
}
