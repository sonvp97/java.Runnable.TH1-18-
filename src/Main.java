public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo1.star();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo2.star();

        System.out.println("Main thread stopped!!! ");

    }
}