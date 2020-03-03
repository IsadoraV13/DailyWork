package Day_2.Multithreading;

public class ExtendThreadEx02 extends Thread {
    public ExtendThreadEx02(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " does not have start() in the constructor so the start method is called from main()");
    }
}
