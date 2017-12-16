package com.lbb.thread.base;

public class MyRunnable implements Runnable {

    private int i = 0;

    public void run() {
        System.out.println("in MyRunnable run");
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args){
        for(int i =0 ;i<100;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            MyRunnable myRunnable = new MyRunnable();
            Thread thread1 = new MyThread(myRunnable); // 将myRunnable作为Thread target创建新的线程
            thread1.start(); // 调用start()方法使得线程进入就绪状态
        }

    }
}
