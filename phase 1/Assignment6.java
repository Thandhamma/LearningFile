import java.util.Scanner;
class Assignment6 {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนจำนวนเงิน = ");
        int money=kb.nextInt();
        System.out.println("จำนวนเงิน =" +money+ "บาท");

        if (money >= 1000) {
            System.out.println("1000 บาท = " +(money/1000)+ " ใบ");
            money %= 1000; // money = money % 1000;
            
            
        }
        if(money >= 500){
            System.out.println("500 บาท = " +(money/500)+ " ใบ");
            money %= 500; // money = money % 500;
           

        }
        if(money >= 100){
            System.out.println("100 บาท = " +(money/100)+ " ใบ");
            money %= 100; // money = money % 100;

        }
        if(money >= 50){
            System.out.println("50 บาท = " +(money/50)+ " ใบ");
            money %= 50; // money = money % 50;

        }
        if(money >= 20){
            System.out.println("20 บาท =" +(money/20)+ " ใบ");
            money %= 20; // money = money % 20;
        }
        if(money >= 10){
            System.out.println("10 บาท = " +(money/10)+ " เหรียญ");
            money %= 10; // money = money % 10;

            
        }
        System.out.println("เศษ = "+money);
    }
}
