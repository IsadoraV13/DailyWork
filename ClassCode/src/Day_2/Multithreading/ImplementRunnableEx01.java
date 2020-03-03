package Day_2.Multithreading;

public class ImplementRunnableEx01 implements Runnable {
    Thread threadFour;

    public ImplementRunnableEx01(String name) {
        threadFour = new Thread(this, name);
        threadFour.start();
    }

    @Override
    public void run() {
        System.out.println(threadFour.getName() + " starting with start() in its constructor");
        System.out.println(threadFour.getName() + " still running. Will the main method complete before it?");
    }
}
