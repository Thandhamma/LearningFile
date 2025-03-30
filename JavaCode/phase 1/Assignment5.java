import java.util.Scanner;
class Assignment5 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนน้ำหนัก (kg) : ");
        double weight = sc.nextDouble();
        System.out.print("ป้อนส่วนสูง (cm) : ");
        double height = sc.nextDouble();
        height /=  100; // height = height / 100;
        double bmi = weight / (height * height );

        System.out.println("น้ำหนัก = " +weight+ " กิโลกรัม");
        System.out.println("ส่วนสูง = " +height+ " เมตร");
        System.out.println("ค่า Bmi =" +bmi);
        String predict = "";

        if (bmi < 18) {
            predict = "ต่ำกว่าเกณฑ์";
        }
         else if (bmi >= 18.5 && bmi <= 22.9) {
            predict ="สมส่วน";
        }
         else if (bmi >= 23 && bmi <= 24.9) {
            predict ="น้ำหนักเกิน";
        } 
         else if (bmi >= 25) {
            predict ="อ้วน";
        } 
         else  {
            predict ="โรคอ้วนอันตราย";
        }
        System.out.println("ผลการตรวจ" +predict);


        /*
         * น้อยกว่า 18 = ต่ำกว่าเกณฑ์
         * 18.5 - 22.9 = สมส่วน
         * 23 - 24.9 = น้ำหนักเกิน
         * มากกว่า 25 = อ้วน
         * มากกว่า 30 = โรคอ้วนอันตราย
         */
    }
}
