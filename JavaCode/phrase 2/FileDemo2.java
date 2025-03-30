import java.io.*;
class FileDemo2 {
    public static void main(String[] args) {
        try{
            FileReader reader=new FileReader(new File("Intro.txt"));
            BufferedReader br = new BufferedReader(reader);
            String message = "";

            while((message=br.readLine()) != null){
                System.out.println(message);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        // catch (FileNotFoundException e) {
        //     System.out.println("หาไฟล์ไม่เจอ");
        // }
    }   
}
