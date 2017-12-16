package com.lbb.thread.base;

public class MyThread extends Thread {

    private int i = 0;

    public MyThread(){

    }

    public MyThread(Runnable runnable){
        super(runnable);
    }

    @Override
    public void run() {
        System.out.println("in MyThread run");
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args){
        for(int i =0 ;i<100;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            Thread thread1 = new MyThread(); // 将myRunnable作为Thread target创建新的线程
            thread1.start(); // 调用start()方法使得线程进入就绪状态
        }

    }

}
