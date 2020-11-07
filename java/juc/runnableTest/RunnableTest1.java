package juc.runnableTest;

public class RunnableTest1 implements Runnable{

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        RunnableTest1 runnableTest1 = new RunnableTest1();
        Thread thread = new Thread(runnableTest1);
    }
}
