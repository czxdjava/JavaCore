package com.cd;

/**
 * @author Chen zhi xiang
 * @date 2020/5/12 22:58
 */
public class Test {
    public static void main(String[] args) {
        Student czx = new Student(1, "czx", "123456");
        txl txl = new txl();
        //增加和查询
        txl.add(czx);
        txl.selete(czx);
        //改
        Student dh = new Student(1, "dh", "123456");
        txl.update(czx,"65498");
        System.out.println(czx.toString());
        //删除
        txl.delete(czx);
        System.out.println(txl.students.isEmpty());


    }

}
