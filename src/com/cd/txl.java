package com.cd;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chen zhi xiang
 * @date 2020/5/12 22:57
 */
public class txl {
     // list 要先new  不然要空指针
    //接口类型的对象没有用具体的类初始化
    public  List<Student> students = new ArrayList<>();
    public void add(Student student){
      students.add(student);
    }
    public void delete(Student student){
        students.remove(student);
    }
    public void update(Student student,String phoneNum){
        if (students.contains(student)){
            student.setPhoneNum(phoneNum);
        }
    }
    public void selete(Student student){
        if (students.contains(student)){
            System.out.println(student.toString());
        }
    }

}
