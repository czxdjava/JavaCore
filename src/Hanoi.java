import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Chen zhi xiang
 * @date 2020/5/7 16:15
 */
public class Hanoi {
    public static void main(String[] args) {
        //hanoi(2,'a','b','c');
        int arr[] = {3,2,6,4,10,9,5};
        System.out.println(findKthLargest(arr,2));
        System.out.println(findK(arr,3));
    }
    //汉罗塔问题
    public static void hanoi(int n , char a ,char b , char c){
        if(n==1){
            System.out.println(a + "---->" + c);
        }else{
            //a 柱借助 C 到达 b
            hanoi(n-1,a,c,b);
            System.out.println(a + "---->" + c);
            // b柱借助a  到达c
            hanoi(n-1,b,a,c);
        }
    }
    // 有问题
    public static int findKthLargest(int [] num,int k){
        //优先队列，保证最小的在前面
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n:
             num) {
            pq.add(n);
            if (pq.size()>k){
                System.out.println(pq);
                Integer poll = pq.poll();
                System.out.println(poll);
            }
        }
        return pq.peek();
    }


    public static int findK(int arr[],int k){
        Arrays.sort(arr);
        return arr[arr.length -1- k];

    }
}
