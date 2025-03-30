import java.util.Scanner;
class Multiply {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนแม่สูตรคูณเริ่มต้น :");
        int start=kb.nextInt();
        System.out.print("ป้อนแม่สูตรคูณสุดท้าย :");
        int stop=kb.nextInt();

        System.out.println("##################");
        for (int m = start; m <= stop; m++){
                System.out.println("แม่่ที่" +m);
                for (int n = 1; n <=12 ; n++){
                    System.out.println(m+ " x " +n+ " = " +(m*n));
                }
        }
    }
}
