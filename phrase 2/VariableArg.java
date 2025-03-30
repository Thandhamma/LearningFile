class VariableArg {
    public static void main(String[] args){
        summation(23,42,100,-50,20,29);
    }

    public static void summation(int a, int b){
        int sum = a+b;
        System.out.println("ผลรวม ="+sum);
    }
    public static void summation(int a, int b, int c){
    
        int sum = a+b+c;
        System.out.println("ผลรวม ="+sum);
    }
    public static void summation(int...number){
        int sum=0;
        for(int i = 0 ; i<number.length;i++){
            sum += number[i];
        }
    
        System.out.println("ผลรวม = " +sum);
    }
}
