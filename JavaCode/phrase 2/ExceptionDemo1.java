import java.util.Scanner;
class ExceptionDemo1 {
    public static void main(String [] args) {
    
    try {
        Scanner kb = new Scanner(System.in); 
        System.out.print("ป้อนตัวเลข ="  );
        int number = kb.nextInt();       
        System.out.println(number);
    } catch(Exception e) {
        e.printStackTrace();
    //     System.out.println("ห้าหารด้วย 0 นะครับ");
    // } catch(ArrayIndexOutOfBoundsException e){
    //     System.out.println("Indext ไม่ถูกต้องนะค้ายบบ");
    // }

    }    
    }

}
