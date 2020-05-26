package com.cd.Lamda;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author Chen zhi xiang
 * @date 2020/5/23 18:52
 */
public class Demo01 {
    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>();
//        Predicate<String> pre = strings::add;
//        pre.test("sd");
//        System.out.println(strings);
//        test1();
//        test2();
        for (int i = 0; i <100 ; i++) {
            new Thread(()->{
                System.out.println((int)(Math.random()*9000+1000));
            }).start();
        }
        System.out.println("测试代码");

    }
    public static void testFunction(Predicate<Integer> pre ,int num){
        System.out.println(pre.test(num));
    }
    public static void test2(){
        testFunction(x->x>20,10);
    }


    public static void test1(){
        Predicate<Integer> pre = num1->num1>10;
        System.out.println(  pre.test(1));
    }
}
