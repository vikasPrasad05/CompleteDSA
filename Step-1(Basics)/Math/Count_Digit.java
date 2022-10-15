class Count_Digit{
    public static void main(String[] args){
        System.out.print(countNum(12));
    }


    public static int countNum(int n){
        int count = 0;
        while(n != 0){
           
            count = count + 1;
            n = n / 10;
        }
        return count;
    }
}