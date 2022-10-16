class Pattern{
    public static void main(String[] args){
      pattern11(5);
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

        //pattern 3
    //     *
    //    **
    //   ***
    //  ****
    // *****
    //****** 

    public static void pattern3(int n){
        int space = n-1;
        int star = 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j  < space ; j++){
              System.out.print(" ");
            }
            for(int j = 0 ; j < star ; j++){
                System.out.print("*");
            }
            space--;
            star++;
            System.out.println();
        }
    }
    
    //pattern 4
    //******
    // *****
    //  ****
    //   ***
    //    **
    //     *
    public static void pattern4(int n){
        int space = 0;
        int star = n;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < space ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j< star ; j++){
                System.out.print("*");
            }
            space++;
            star--;
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
    //1
    //12
    //123
    //1234
    //12345
    public static void pattern6(int n){
        for(int i = 0 ; i < n ; i ++ ){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    //Pattern 7
    //1
    //22
    //333
    //4444
    //55555
    public static void pattern7(int n){
        for(int i = 0 ; i < n ; i ++ ){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }


    //Pattern 8
    //12345
    //1234
    //123
    //12
    //1
    public static void pattern8(int n){
        for(int i = n ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                System.out.print(j + 1);
            }
            System.out.println();
        }

    }

    // pattern 9
    //    *
    //   ***
    //  *****
    // *******
    //********* 

    public static void pattern9(int n){
        int space = n -1;
        int star = 1;
        for(int i = 0; i < n ; i++){
               for(int j = 0; j < space ; j++){
                System.out.print(" ");
               }

               for(int j = 0 ; j < star ; j++){
                System.out.print("*");
               }
               space--;
               star = star + 2;
               System.out.println();
        }
    }

    // pattern 10
    // *********
    //  *******
    //   *****
    //    ***
    //     *

    public static void pattern10(int n){

        int space = 0;
        int star = n;
        for(int i = 0; i < n ; i++){
            for(int j = 0; j<space ; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < star ; j++){
                System.out.print("*");
            }
            space = space + 1;
            star = star - 2;
            System.out.println();
        }
    }
    
    

    //pattern 11
    //*
    //**
    //***
    //****
    //*****
    //****
    //*** 
    //**
    //*

    public static void pattern11(int n){
        for(int i = 0; i < 2*n - 1; i++){
            for(int j = 0 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


  
}