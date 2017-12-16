package com.lbb.thread.syn;

class MyTicketThread extends Thread{
    private int ticketNum =5;

    private String name;

    public MyTicketThread(String name){
        this.name = name;
    }

    public void run(){
        while (ticketNum>0){
            ticketNum--;
            System.out.println(name+"售出1张票，剩余票数"+ticketNum);
        }
    }
}

public class TicketThread extends Thread {
    public static void main(String[] args){
        MyTicketThread ticketThread1 = new MyTicketThread("窗口1");
        MyTicketThread ticketThread2 = new MyTicketThread("窗口2");
        MyTicketThread ticketThread3 = new MyTicketThread("窗口3");
        ticketThread1.start();
        ticketThread2.start();
        ticketThread3.start();
    }

}
