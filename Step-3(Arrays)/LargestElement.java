class LargestElement{
    public static void main(String[] args){

int[] arr = { 12,76,34,23,79,90,222600};
System.out.print(Largest(arr));
    }

    public static int Largest(int[] arr){
        int largest = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}