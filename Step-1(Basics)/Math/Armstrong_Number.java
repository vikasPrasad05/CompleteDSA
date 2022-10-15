class Armstrong_Number{
    public static void main(String[] args){
        System.out.print(isArmstrong(163));
    }

    public static boolean isArmstrong(int n){
        int num = 0;  // final value
        int temp = n; // temp variable
        while(temp != 0){
           int rem = temp % 10;
           num = num + rem*rem*rem;
           temp = temp /10;
        }

        if(n == num ){
            return true;
        }else{
            return false;
        }
    }
}