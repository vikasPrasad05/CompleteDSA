class SumOfNnumber{
    public static void main(String[] args){
         System.out.println(sumofN(100s));
    }

    public static int sumofN(int n){
        if( n <= 0){
            return  0;
        }
        
        return n +  sumofN(n - 1);
    }
}