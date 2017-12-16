package com.lbb.thread.syn;

class MyTicketRunnable implements Runnable{
    private int ticketNum =10;

    public void run(){
        while(ticketNum>0){
            synchronized(MyTicketRunnable.class){
                if (ticketNum > 0){
                    ticketNum--;
                    System.out.println(Thread.currentThread().getName()
                            + "正在卖票,还剩" + ticketNum + "张票");
                }else{
                    System.out.println("票已经卖完！");
                    return;
                }
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}

public class TicketRunnable {

    public static void main(String[] args){
        MyTicketRunnable ticketThread = new MyTicketRunnable();
        Thread ticketThread1 = new Thread(ticketThread,"窗口1");
        Thread ticketThread2 = new Thread(ticketThread,"窗口2");
        Thread ticketThread3 = new Thread(ticketThread,"窗口3");
        ticketThread1.start();
        ticketThread2.start();
        ticketThread3.start();
    }
}
