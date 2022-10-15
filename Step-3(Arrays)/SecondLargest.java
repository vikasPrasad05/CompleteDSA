public class SecondLargest{
    public static void main(String[] args){
        int[] arr = {1,1,1,2};
        System.out.print(sLargest(arr));

    }


//naive solution
    public static int sLargest(int[] arr){
        int l = 0;
        int sl = -1;

        for(int i = 0; i < arr.length ; i++){
            if(arr[l] < arr[i] ){
                l = i;
            }
        }
        

        for(int j = 0; j < arr.length ;j++){
           if(arr[j] != arr[l]){
            if(sl == -1)
                sl = j;
            else if(arr[j] > arr[sl])
                sl = j;
               
            }
           }
        

        return sl;
    }


    //more efficient

}