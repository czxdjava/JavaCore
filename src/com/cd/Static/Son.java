package com.cd.Static;

/**
 * @author Chen zhi xiang
 * @date 2020/5/23 19:45
 */
class Father{
    static int i =10;
    static {
        System.out.println("先输出Father");
    }
}
public class Son extends Father {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(Father.i);
    }
    public Son(){
        System.out.println("后输出Son");
    }
}
