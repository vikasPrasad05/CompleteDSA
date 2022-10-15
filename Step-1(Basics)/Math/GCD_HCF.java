import java.lang.*;

class GCD_HCF{
    public static void main(String[] args){
        System.out.println(gcd(3,6));
    }


//brute force solution
//intitution : traverse from 1 to min of n1 and n2 and check if i divide from both number
    public static int HCF1(int n1 , int n2){
        int ans = 1;
        for(int i = 1 ; i <= Math.min(n1 , n2) ; i++){
            if(n1%i == 0 && n2%i == 0){
                ans = i;
            }
        }
        return ans;
    }



//Using Euclidean’s theorem.
public static int HCF2(int n1 , int n2){
    while(n1 % n2 != 0){
        int rem = n1 % n2;
        n2 = n1;
        n1 = rem;

    }
    return n1;
}

//Recursive method -> gcd(a,b) = gcd(b , a%b);

public static int gcd(int a , int b){
    if(b == 0){
        return a;
    }

    return gcd(b , a % b);
}

}