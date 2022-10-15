class LinearSearch{
    public static void main(String[] args){
        int[] arr = {4,7,12,90,54,32,78,66,54,34,61};
        System.out.println(LS(arr , 54));
    }

    public static int LS(int[] arr , int n){
        for(int i = 0; i < arr.length - 1; i++){
           if(arr[i] == n){
            return i;
           }
        }
        return -1;
    }
}