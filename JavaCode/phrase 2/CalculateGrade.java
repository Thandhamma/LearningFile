import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
class CalculateGrade {
    public static void main(String[] args){
        PrintWriter output = null;
        try {
            Scanner input=new Scanner(new File("Score.txt"));
            output = new PrintWriter(new File("GradeFile.txt"));
            String nisit = "";
            while(input.hasNext()){
                nisit = input.nextLine();
                // System.out.println("ข้อมูล = " +nisit);
                int pos = nisit.indexOf(" ");
                //  System.out.println(pos);
                 String scoreStr = nisit.substring(pos, nisit.length()); // หาตำแหน่งคะแนน
                 scoreStr = scoreStr.trim();
                //  System.out.println(score);

                 double score = Double.parseDouble(scoreStr);
                 String grade = "";
                
                if(score >= 80){
                    grade = "A";
                }
                else if(score >= 70){
                    grade = "B";
                }
                else if(score >= 60){
                    grade = "C";
                }
                else if(score >= 50){
                    grade = "D"; 
                }
                else{
                    grade = "F";
                }
                
                output.println(nisit+ " "+grade);
                }

        } catch (Exception e){
            e.printStackTrace();
        }
        output.close();
        
    }
}
