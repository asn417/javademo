package juc.threadTest;

/**
 * 两个线程交替打印1到100
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        Num num1 = new Num(true);
        Num num2 = new Num(false);

        num1.start();
        num2.start();
    }
}
class Num extends Thread{

    private static int num = 1;
    private Boolean flag;
    public Num(Boolean flag){
        this.flag = flag;
    }
    public void run(){
        while (num <= 1000) {
            if (flag && num % 2 == 0) {
                System.out.println(Thread.currentThread() + "，偶数->" + num++);
            }
            if (!flag && num % 2 == 1) {
                System.out.println(Thread.currentThread() + "-，奇数>" + num++);
            }
        }

    }

}