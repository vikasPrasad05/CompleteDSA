import java.util.*;
class ReverseArray{
    public static void main(String[] args){
       int[] arr = {1,2,3,4,5};
       System.out.println(Arrays.toString(arr));
       reverseR(arr , 0 , arr.length - 1);
       System.out.println(Arrays.toString(arr));
    }

    // Iterative method
    public static void reverseI(int[] arr){
        int start = 0;
        int end = arr[arr.length-2];

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Recursive method
    public static void reverseR(int[] arr , int start , int end){
        if(start < end){
             int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseR(arr , start + 1 , end - 1 );
        }
    }
}