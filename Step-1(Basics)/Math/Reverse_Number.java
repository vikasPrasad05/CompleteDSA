class Reverse_Number{
    public static void main(String[] args){

        System.out.print(reverseInt(123));
    }

    public static int reverseInt(int n ){
        int rev = 0;
        while(n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n /10;
        }
        return rev;
    }
}