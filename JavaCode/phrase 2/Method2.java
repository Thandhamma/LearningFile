import java.util.Scanner;
class Method2 {
    public static void main(String[] args) {

        int [] numberA = {10,20,30};
        displayArray(numberA);
        swapElement(numberA,0,1);
        displayArray(numberA);

        // int [] numberA = {10,20,30,40,50,};
        // System.out.println("ค่าที่มากที่สุด ="+findMaxInArray(numberA)); 
        // System.out.println("ตำแหน่ง = "+findMaxIndex(numberA));
        // System.out.println("ค่าที่น้อยที่สุด ="+findMinInArray(numberA));
        // System.out.println("ตำแหน่ง = "+findMinIndex(numberA)); 

        
        // int [] numberB = {10,20,30,40,50};
        // System.out.println("ค่าที่มากที่สุด ="+findMaxInArray(numberB));
        // System.out.println("ตำแหน่ง = "+findMaxIndex(numberB));
        // System.out.println("ค่าที่น้อยที่สุด ="+findMinInArray(numberB));
        // System.out.println("ตำแหน่ง = "+findMinIndex(numberB));  

        // System.out.println("ผลการเปรียบเทียบเป็น  " +compareArray(numberA, numberB));
        // int [] numberC = {100,200};
        // System.out.println("ค่าที่มากที่สุด ="+findMaxInArray(numberC)); 
        // System.out.println("ตำแหน่ง = "+findMaxIndex(numberC));
        // System.out.println("ค่าที่น้อยที่สุด ="+findMinInArray(numberC));
        // System.out.println("ตำแหน่ง = "+findMinIndex(numberC)); 
        
        
        
        // for (int i=0; i<numberA.length; i++){
        //     System.out.println("ลำดับที่ = "+i + " ค่า =" +numberA[i]);
        // }

        // int [] numberB = { -50, -20 ,-30 ,100 ,50};
        
        // for (int i=0;i<numberB.length; i++){
        //     System.out.println("ลำดับที่ + "+i +"ค่า = " +numberB[i]);
   
        // }
    }

    // แสดงผลตัวเลขใน array ที่ส่งเข้ามาทำงานในเมธอด
    static void displayArray(int [] arr){
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
            System.out.print(",");
            }
            
            
        }
        System.out.print("}");

       

    
        //โปรแกรมหลัก
    //     int result=maxNumber(100,500);
    //     System.out.println("ค่าที่มากที่สุดคือ ="+result);


    // }
    // /*
    //  ชนิดข้อมูลที่จะส่งออกไป ชื่อเมธอด (ค่าที่ส่งเข้ามา){
    //     //การประมวลผล
    //     return ชนิดข้อมูล
    //  }
    //  */

    //  //เปรียบเทียบตัวเลข 2 ตัว
    //  static int maxNumber(int a , int b){
    //     // การประมวลผล
    //     if(a>b){
    //         return a;
    //     }else{
    //         return b;
    //     }
        
    //  }
    }
    static int findMaxInArray(int [] arr){
        //ค้นหาค่าที่มากที่สุดใน Array
        // ได้ค่าที่มากที่สุด
        int maxValue = arr[0] ; //เก็บค่าสูงสุดเอาไว้
        for(int i=0; i<arr.length;i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue; 
    }
    static int findMinInArray(int [] arr){
        //ค้นหาค่าที่มากที่สุดใน Array
        // ได้ค่าที่มากที่สุด
        int minValue = arr[0] ; //เก็บค่าสูงสุดเอาไว้
        for(int i=0; i<arr.length;i++){
            if(arr[i]<minValue){
                minValue = arr[i];
            }
        }
        return minValue; 
    }

    static int findMaxIndex(int [] arr){
        int maxIndex=0; // เก็บค่าตำแหน่ง Index สมาชิกที่มีค่ามากที่สุดใน arr
        for(int i=0;i<arr.length;i++){
        if(arr[i]>maxIndex){
            maxIndex =i;
        }
    }
    return maxIndex;
    }

    static int findMinIndex(int [] arr){
        int minIndex=0; // เก็บค่าตำแหน่ง Index สมาชิกที่มีค่าน้อยที่สุดใน arr
        for(int i=0;i<arr.length;i++){
        if(arr[i]<minIndex){
            minIndex=i;
        }
    }
    return minIndex;
    }
    static boolean compareArray(int [] a, int[] b){
        for(int i=0;i<a.length;i++){
            if(a[i] != b[i]){
                return false;
            }
        
        }
        return true;

    }

    static void swapElement(int [] a, int x, int y){
        //x = ตำแหน่งเริ่มต้น
        //y = ตำแหน่งปลายทาง
        // จัดเก็บตำแหน่งชั่วคราว
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
