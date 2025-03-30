import java.util.Scanner;
class SwitchCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("ป้อนเลขเดือน = ");
        int month = kb.nextInt();
        String name;

        /* if(month == 1){
            name = "มกราคม";

        }else if(month == 2){
            name = "กุมภาพันธ์";
        
        }else if(month == 3){
            name = "มีนาคม";

        }else if(month == 4){
            name = "เมษายน";

        }else if(month == 5){
            name = "พฤษภาคม";

        }else if(month == 6){
            name = "มิถุนายน";

        }else if(month == 7){
            name = "กรกฎาคม";

        }else if(month == 8){
            name = "สิงหาคม";

        }else if(month == 9){
            name = "กันยายน";

        }else if(month == 10){
            name = "ตุลาคม";

        }else if(month == 11){
            name = "พฤศจิกายน";

        }else if(month == 12){
            name = "ธันวาคม";
        
        }else{
            name = "ไม่พบเดือนที่คุณป้อน";

        
        }
        System.out.println("เดือนที่คุณป้อนคือ" +name);

        */
        switch (month){
            case 1: name = "มกราคม"; 
            break;
            case 2: name = "กุมภาพันธ์";
            break;
            case 3: name = "มีนาคม";
            break;
            case 4: name = "เมษายน";
            break;
            case 5: name = "พฤษภาคม";
            break;
            case 6: name = "มิถุนายน";
            break;
            case 7: name = "กรกฎาคม";
            break;
            case 8: name = "สิงหาคม";
            break;
            case 9: name = "กันยายน";
            break;
            case 10: name = "ตุลาคม";
            break;
            case 11: name = "พฤศจิกายน";
            break;
            case 12: name = "ธันวาคม";
            break;
            default: name = "ไม่พบเดือนที่คุณป้อน";
        }
        System.out.println("เดือนที่คุณป้อนคือ" +name);

    }
}
