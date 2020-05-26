package com.cd;

/**
 * @author Chen zhi xiang
 * @date 2020/5/12 22:58
 */
public class Student {
    int num;
    String name;
    String phoneNum;

    public Student(int num, String name, String phoneNum) {
        this.num = num;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
