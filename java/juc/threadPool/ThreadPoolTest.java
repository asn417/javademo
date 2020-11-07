package juc.threadPool;

import java.util.concurrent.*;

/**
 * Java创建线程池的两种方式：
 *  1）使用Executors工厂类创建线程池
 *  2）使用ThreadPoolExecutor自定义线程池
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        //创建使用单个线程的线程池
        ExecutorService es1 = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            es1.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "正在执行任务");
                }
            });
        }

        //创建使用固定线程数的线程池
        ExecutorService es2 = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            es2.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "正在执行任务");
                }
            });
        }
        //创建一个会根据需要创建新线程的线程池
        ExecutorService es3 = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            es3.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "正在执行任务");
                }
            });
        }
        //创建拥有固定线程数量的定时线程任务的线程池
        ScheduledExecutorService es4 = Executors.newScheduledThreadPool(2);
        System.out.println("时间：" + System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            es4.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println("时间："+System.currentTimeMillis()+"--"+Thread.currentThread().getName() + "正在执行任务");
                }
            },3, TimeUnit.SECONDS);
        }
        //创建只有一个线程的定时线程任务的线程池
        ScheduledExecutorService es5 = Executors.newSingleThreadScheduledExecutor();
        System.out.println("时间：" + System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            es5.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println("时间："+System.currentTimeMillis()+"--"+Thread.currentThread().getName() + "正在执行任务");
                }
            },3, TimeUnit.SECONDS);
        }
    }
}
