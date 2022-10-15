class Fibonnachi{
    public static void main(String[] arr){
        System.out.println(fibo(24));
    }

    public static int fibo(int num){
        if(num < 2){
            return num;
        }

        return fibo(num - 1) + fibo(num -2);
    }
}