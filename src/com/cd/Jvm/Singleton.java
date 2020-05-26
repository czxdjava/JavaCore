package com.cd.Jvm;

/**
 * @author Chen zhi xiang
 * @date 2020/5/21 23:57
 */
/*
双判空，加锁单例
 */
public class Singleton {
    //volatile 禁止重排序 就不会出现原子错误
    private volatile static Singleton instance =null;
    public Singleton getInstance(){
        //如果不是空，就直接返回
        if (instance==null){
            synchronized (Singleton.class){
                // 如果多个线程同时到这里，只需要一次判断是否为空
                if (instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
