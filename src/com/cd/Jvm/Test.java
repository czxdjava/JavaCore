package com.cd.Jvm;

/**
 * @author Chen zhi xiang
 * @date 2020/5/22 0:03
 */
public class Test {
    public static void main(String[] args) {
        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                Singleton instance = new Singleton().getInstance();
                System.out.println(instance);
            }
        }).start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(1);
    }
}
