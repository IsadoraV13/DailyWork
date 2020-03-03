package Day_2.Multithreading;

public class MultiThreadingExamples {
    public static void main(String[] args) {
        System.out.println("Main method step 1");
        //Thread 1
        ExtendThreadEx01 threadOne = new ExtendThreadEx01("Thread 1");
        try {
            threadOne.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Thread 2
        System.out.println("Main method step 2");
        ExtendThreadEx02 threadTwo = new ExtendThreadEx02("Thread 2");
        threadTwo.start();
        try {
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Thread 3
        System.out.println("Main method step 3");
        ExtendThreadEx03 threadThree = new ExtendThreadEx03("Thread 3");

        //Thread 4
        System.out.println("Main method step 4");
        ImplementRunnableEx01 threadFour = new ImplementRunnableEx01("Thread 4");

        //Thread 5
        System.out.println("Main method step 5");
        ImplementRunnableEx02 threadFive = new ImplementRunnableEx02("Thread 5");
        threadFive.run();

        //Thread 6
        System.out.println("Main method step 6");
        ImplementRunnableEx03 threadSix = new ImplementRunnableEx03("Thread 6");

        System.out.println("Main method complete");
    }
}
