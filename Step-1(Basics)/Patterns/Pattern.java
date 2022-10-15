class Pattern{
    public static void main(String[] args){
      pattern6(5);
    }


    //Pattern 1
    // *****
    // *****
    // *****
    // *****
    // *****
    public static void pattern1(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 

    //Pattern 2
    // *
    // **
    // ***
    // ****
    // *****
    public static void pattern2(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern 3
    //1
    //12
    //123
    //1234
    //12345
    public static void pattern3(int n){
        for(int i = 0 ; i < n ; i ++ ){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    //Pattern 4
    //1
    //22
    //333
    //4444
    //55555
    public static void pattern4(int n){
        for(int i = 0 ; i < n ; i ++ ){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    //Pattern 5
    //*****
    //****
    //***
    //**
    //*
    public static void pattern5(int n){
        for(int i = n ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //Pattern 6
    //12345
    //1234
    //123
    //12
    //1
    public static void pattern6(int n){
        for(int i = n ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                System.out.print(j + 1);
            }
            System.out.println();
        }

    }

    


}