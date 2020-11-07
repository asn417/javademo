package juc;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock可重入锁，默认是非公平的
 */
public class ReentrantLockTest {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();//等价于new ReentrantLock(false);

        Thread.currentThread().getState();
    }
}
