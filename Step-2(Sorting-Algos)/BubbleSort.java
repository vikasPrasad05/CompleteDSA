import java.util.*;
public class BubbleSort{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};


        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
           for(int j = 0; j < arr.length -1 ; j++){
               if(arr[j] > arr[j+1]){
               int temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
        }
    }
}

     }
    
   

   
   

       

 
}