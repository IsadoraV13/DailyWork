package Day_2.Multithreading;

public class ImplementRunnableEx03 implements Runnable {
    Thread threadSix;

    public ImplementRunnableEx03(String name) {
        threadSix = new Thread(this, name);
        threadSix.start();
    }

    @Override
    public void run() {
        System.out.println(threadSix.getName() + " starting");
        System.out.println(threadSix.getName() + " going to sleep");
        try {
            threadSix.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
        System.out.println(threadSix.getName() + " re-starting");
        System.out.println(threadSix.getName() + " still running. Will the main method complete before it?");
    }
}
