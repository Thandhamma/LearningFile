import java.util.Scanner;
class Method1  {
    public static void main(String[] args){
        // การเรียกใช้งานเมธอด
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนเงินเดือนของคุณ = ");
        double salary = kb.nextDouble();
        System.out.println("เงินเดือน "+salary);
        double bonus = getBonus();
        salary += bonus;
        System.out.println("เงินเดอน" + "โบนัส" +salary);
        System.out.println("ที่อยู่ = "+GetMyCity());
    }   
    // modifier ชนดข้อมูลที่จะส่งออกมาทำงานในโปรแกรมหลัก ชื่อเมธอด(){}
    static String getIP(){
        return "127.0.0.1";
    }
    // modifier ชนิดข้อมูลที่จะส่งออกมาทำงานในโปรแกรมหลัก ชื่อเมธอด(){}
    static Double getBonus(){
        return 1000.0;
    }

    static String GetMyCity(){
        String city = "กรุงเทพ";
        return city;
    }
        
    //    OpenVideo();
    //    playVideo();
    //    pauseVideo();
    //    playVideo();
        // display("บักจ๊าดด");
        // display("HelloWorld");
       // fullName("กล้วย","ทอด");
    //    plus(10,20);
    // plus(500,-200);
    // subtract(3,1,1);
    //    exitProgram();
    // }
    // การสรา้งเมธอด
    // }
    // static void display(String message){ // message คือ พารามิเตอร์
    //     //กลุ่มคำสั่งที่อยากให้ทำงาน
    //     System.out.println(message);
    // }
    
    // static void fullName(String firstname , String lastname){
    //     System.out.println("ชื่อ =" +firstname+ " นามสกุล =" +lastname);
    // }
    // static void plus(int a , int b){
    //     int c = a+b;
    //     System.out.println("ผลบวก" +c);
    // } 
    // static void subtract(int a , int b , int c){
    //     int d = a-b-c;
    //     System.out.println("ผลลบ" +d);
    // }

    // static void number(){
    //     int a =10;
    //     int b =20;
    //     int c= a+b;
    //     System.out.println("ผลบวก" +c);
    //     System.out.println("ผลลบ"+(a-b));
    // }

    // static void OpenVideo(){
    //     System.out.println("เปิดวีดีโอ");
    // }

    // static void playVideo(){
    //     System.out.println("เล่นวีดีโอ");
    // }

    // static void pauseVideo(){
    //     System.out.println("หยุดวีดีโอ");
    // }

    // static void exitProgram(){
    //     System.out.println("Clear Memory !");
    //     System.out.println("ปิดโปรแกรม");
    
    
}
