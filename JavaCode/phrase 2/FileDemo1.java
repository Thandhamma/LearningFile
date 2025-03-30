import java.io.*;
class FileDemo1{
    public static void main(String[] args) {
        //File f=new File("Demo.txt");
        try {
            FileWriter writer = new FileWriter(new File("Intro.txt"));
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Hello World\n");
            bw.write("เขียนโปรแกรมภาษา Java เบื้องต้น\n");
            bw.write("เรียนโดยต้นๆ");
            bw.close();
            System.out.println("เขียนไฟล์เสร็จแล้ว!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}