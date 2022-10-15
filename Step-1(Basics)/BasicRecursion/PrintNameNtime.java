class PrintNameNtime{
    public static void main(String[] args){
     printName("alok",10);
    }

    public static void printName(String name , int num){
        if(num == 0){
            return;
        }

        printName(name , num - 1);
        System.out.println(name + " "  + num);
    }
}