class CheckPalindrome{
    public static void main(String[] args){
        System.out.print(isPal(45654));
    }

    public static boolean isPal(int n){
        int rev = 0;
        int temp = n;
        while(temp != 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp /10;
        }
        
        if(rev == n){
            return true;
        }else{
            return false;
        }

    }
}