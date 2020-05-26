package com.cd.thread;

/**
 * @author Chen zhi xiang
 * @date 2020/5/26 19:39
 */
public class Ticket implements Runnable {
    private int ticket = 1000;
    @Override
    public void run() {
        Object o = new Object();
        synchronized (o){
        for (int i = 0; i <1000; i++) {
          if (ticket>0){
              ticket--;
              System.out.println(Thread.currentThread().getName()+ "剩余票数："+ticket);
          }
        }
        }
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread threadA = new Thread(ticket,"A窗口");
        Thread threadB = new Thread(ticket,"B窗口");
        threadA.start();
        threadB.start();
    }
}
