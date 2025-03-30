import java.util.Scanner;
class inputTutorial {
    public static void main(String[] args) {
        // รับค่าข้อมูล
        // ข้อมูลแบบไหน ?  ตัวเลข integer, float , long , double , ข้อความ string
        // ข้อความทำอะไร 
        // ข้อความแบบตัวเลข => คำนวณได้ | คำนวณไม่ได้

        // ประกาศใช้งาน Class | New 
        Scanner sc=new Scanner(System.in);
        System.out.print("ป้อนชื่อของคุณ: "); // แสดงข้อความที่พิมพ์
        String name = sc.nextLine(); // รับค่า String จากคีย์บอร์ด => name
        
        System.out.print("ป้อนปีเกิด พ.ศ. = ");
        int year = sc.nextInt(); // รับค่า int จากคีย์บอร์ด => year

        int age= 2568 - year;// คำรวณอายุ 

        System.out.println("ชื่อของคุณ คือ = "+name); // แสดงงข้อความที่พิมพ์
        System.out.println("ปีเกิด คือ = "+year); // แสดงข้อความที่พิมพ์
        System.out.println("อายุ คือ = "+age); // แสดงข้อความที่พิมพ์
    }    
}
