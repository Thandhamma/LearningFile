import java.util.Scanner;
class Assignment4 {
    // โปรแกรมแปลงพ.ศ. เป็น ค.ศ.
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อน ค.ศ. = ");
        int number = kb.nextInt();

        // ประมวลผล
        // พ.ศ. - 543 = ค.ศ.
        // ค.ศ. + 543 = พ.ศ.
        int result = number + 543;

        
    
    System.out.println(number+ " แปลงเป็น พ.ศ = " +result);
    }
}
