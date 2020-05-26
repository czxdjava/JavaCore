public class Main {

    public static void main(String[] args) {
        int arr[] = {3,2,6,4,8,9,5};
        int[] ints = insertSort(arr, arr.length);
        for (int a:
             ints) {
            System.out.print(a+" ");
        }


        test();
        System.out.println("Hello World!");
    }
    //插入排序
    public static int[] insertSort(int arr[],int n){
        int i,j;
        for (i = 1;  i<n ; i++) {
            //需要插入的数 ：从左往右
            int temp = arr[i];
           //从右往左比较，找到需要插入的位置
            for (j=i; j > 0 && arr[j-1] > temp ; j--){
                arr[j] = arr[j-1];
        }
            //把插入的放在应该在的位置就可以了
            arr[j] = temp;
        }
        return arr;
    }
     public static void test(){
         for (int i = 0; i <= 10; i++) {
             System.out.println(i);

         }
     }
}
