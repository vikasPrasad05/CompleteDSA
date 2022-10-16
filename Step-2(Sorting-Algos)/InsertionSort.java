import java.util.*;
class InsertionSort{
    public static void main(String[] args){
     int[]  arr = {13,46,24,52,20,9};
     isort(arr);
     System.out.println(Arrays.toString(arr));
    }

    public static void isort(int[] arr){
        for(int i = 1 ; i < arr.length ; i++){
            int cur = arr[i];
            int j = i-1 ; 

            while(j >= 0 && arr[j] > cur){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = cur;
        }
    }

     



}