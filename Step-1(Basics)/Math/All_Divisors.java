import java.util.*;
class All_Divisors{
    public static void main(String[] args){
       System.out.println(Arrays.toString(all_divisor(9)));
    }



    //intution
//     The above method takes O(n) time complexity. We can also think of another approach. If we take a closer look, we can notice that, the quotient of a division by one of the divisors is actually another divisor. Like, 4 divides 36. The quotient is 9, and 9 also divides 36.
// Another intuition is that, the root of a number actually acts as a splitting part of all the divisors of a number.
// Also the quotient of a divison by any divisor gives an equivalent divisor on the other side. Like, 4 gives 9 while dividing 36. See the image below.

    public static int[] all_divisor(int num){
        int[] ans = new int[num];
        int j = 0;
        for(int i = 1 ; i <= (int)Math.sqrt(num); i++){
            if(num % i == 0){
            ans[j] = i;
            j++;
            int a = num / i;
            ans[j] = a;
            }
        }
        return ans;
    }
}