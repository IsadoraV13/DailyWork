package Day_2.Multithreading;

public class ExtendThreadEx03 extends Thread {
    public ExtendThreadEx03(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " starting");
        System.out.println(getName() + " still running. Will the main method complete before it?");
    }
}
