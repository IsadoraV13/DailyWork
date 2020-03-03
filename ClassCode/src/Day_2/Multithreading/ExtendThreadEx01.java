package Day_2.Multithreading;

public class ExtendThreadEx01 extends Thread {
    public ExtendThreadEx01(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " starting");
        System.out.println(getName() + " going to sleep");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " re-starting");

    }
}
