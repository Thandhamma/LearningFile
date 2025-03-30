import java.util.Scanner;
class Assignment3 {
    // เขียนโปรแกรมหาเลชคู่ / เลขคี่
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนตัวเลข = ");
        int number = kb.nextInt();

            //  % number % 2 ลงตัว => คู่
            //  % number % 2 ไม่ลงตัว => คี่

        String result="";
        
        // ตัวแปร = (เงื่อนไข) ? คำสั่งเมื่อเงื่อนไขเป็นจริง : คำสั่งเมื่อเงื่อนไขเป็นเท็จ;

        result = (number%2 == 0) ? number+ " เป็นเลขคู่" : number+ " เป็นเลขคี่";
        System.out.println(result);
    }
}
