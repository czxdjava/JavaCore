package com.cd.sort;

/**
 * @author Chen zhi xiang
 * @date 2020/5/19 21:35
 */
public class Sort1 {
    public static void main(String[] args) {
        int[] num = {1,3,2,6,4,5,4,10,3236,54};
        int[] ints = insertSort(num, 10);
        for (int int1:
            ints ) {
            System.out.println(int1);

        }
    }
    public static int[] sort(int[] num,int n){
        for (int i = 0; i < n; i++) {
            boolean logan = false;
            int tmp = 0;
            for (int j = 0; j <n-i-1; j++) {
                if (num[j]>num[j+1]){
                    tmp = num[j+1];
                    num[j+1] =num[j];
                    num[j] = tmp;
                    logan = true;
                }
            }
            if (logan=false) break;
        }
        return num;
    }
    public static int[] insertSort(int[] num,int n){
        for (int i = 1; i <n ; i++) {
            int j = i -1;
            int val = num[i];
            for (;j>0; --j) {
                if (num[j] > val){
                    num[j+1] = num[j];
                }else {
                    break;
                }
            }
            num[j+1] = val;
        }
        return num;
    }
}
