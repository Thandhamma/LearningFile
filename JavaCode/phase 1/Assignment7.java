import java.util.Scanner;
public class Assignment7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        /* System.out.print("ป้อนอุณหภูมิ (ฟาเรนไฮน์) = ");
        float fahren= kb.nextFloat();

        Float cels = (fahren-32)*5/9;
        System.out.println(fahren+ "ฟาเรนไอน์ = " + cels + "เซลเซียส");

        */
        System.out.print("ป้อนอุณหภูมิ (เซลเซียส) = ");
        float cels = kb.nextFloat();

        float fahren = (cels*9/5)+32;
        System.out.println(cels+ "เซลเซียส = " + fahren + "ฟาเรนไอน์");
    }
    
}
