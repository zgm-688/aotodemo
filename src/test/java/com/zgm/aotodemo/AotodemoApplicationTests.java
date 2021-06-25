package com.zgm.aotodemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@SpringBootTest
class AotodemoApplicationTests {

    @Test
    void contextLoads() {

    }

    public static void main(String[] args) throws InterruptedException {
        tt1 tt1 = new tt1();
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                try {
                    while (true){
                        tt1.add();
                        Thread.sleep(100);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    while (true) {
                        tt1.get();
                        Thread.sleep(100);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }


    static class tt1 {
        ReentrantLock lock = new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();

        LinkedList arrayList = new LinkedList();

        public void add() throws InterruptedException {
            while (arrayList.size() == 10) {
                condition1.await();
                condition2.signalAll();
            }
            arrayList.add(new Object());
            System.out.println("add" + arrayList.size());
        }

        public void get() throws InterruptedException {
            while (arrayList.size() == 0) {
                condition2.await();
                condition1.signalAll();
            }
            arrayList.removeFirst();
            System.out.println("get" + arrayList.size());
        }

    }
}
