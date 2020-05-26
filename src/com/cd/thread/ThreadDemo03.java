package com.cd.thread;

/**
 * @author Chen zhi xiang
 * @date 2020/5/26 19:17
 */

/**
 * 需求：模拟学院学车，10个Vip,10个普通学员。
 * Vip在普通学院之前结束学车，并且Vip学员的时间比普通的长
 */
class VipStudent implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(i+"vip正在学车。。。。。");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class NormalStudent implements Runnable{
    Thread vip ;
    public NormalStudent(Thread vip) {
        this.vip = vip;
    }
    public NormalStudent() {

    }
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            //保证vip普通学员前学完
            if (i==9){
                try {
                    vip.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i+"普通学员正在学车。。。。。");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadDemo03 {
    public static void main(String[] args) {
        VipStudent vipStudent = new VipStudent();
        Thread Vipthread = new Thread(vipStudent,"a");

        NormalStudent normalStudent = new NormalStudent(Vipthread);
        Thread Normalthread = new Thread(normalStudent);
        //设置优先级
        Vipthread.setPriority(Thread.MAX_PRIORITY);
        Normalthread.setPriority(Thread.MIN_PRIORITY);

        Vipthread.start();
        Normalthread.start();

    }
}
