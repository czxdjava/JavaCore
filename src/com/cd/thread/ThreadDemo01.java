package com.cd.thread;

/**
 * @author Chen zhi xiang
 * @date 2020/5/24 14:52
 */
public class ThreadDemo01  extends Thread{
    public static void main(String[] args) {
        ThreadDemo01 t1 = new ThreadDemo01();
        t1.setName("Thread1");
        ThreadDemo01 t2 = new ThreadDemo01();
        t2.setName("Thread2");
        //这里有3个线程去抢cpu，谁抢到了，谁就输出
        t1.start();
        System.out.println("-----------");
        t2.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+": "+ i);
        }
    }
}
