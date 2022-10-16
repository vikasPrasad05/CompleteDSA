class MergeSort{
    public static void main(String[] args){
       int[] arr = {2,4,1,9,5,6};

    }


    public static void divide(int[] arr , int start , int end ){

        if(start > end){
            return ; 
        }

        int mid = start + (end - start) / 2;
        divide(arr, start , mid);
        divide(arr , mid + 1 , end);
        conquer()
    }


    public static void conquer(int[] arr , int start , int mid , int end){
        int merged[] = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid+2;
        int x = 0;

        while(idx1 <= mid && idx2 <= end){
            
        }
    }



   
}