import java.util.Scanner;
class Nestedif {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนอายุของคุณ: ");
        int age= kb.nextInt();

        if (age<=15){
            System.out.println("ม.ต้น");
            if(age==15){
                System.out.println("ม.3");

            }
            else if(age==14){
                System.out.println("ม.2");
            }
            else if(age==13){
                System.out.println("ม.1");
            }
            else{
                System.out.println("ประถมศึกษา");
            }

            System.out.println("จบโปรแกรม");
        }

    }
}
