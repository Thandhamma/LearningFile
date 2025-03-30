
class Method3 {
    public static void main(String[] args){
        int [] numberA =  {10,20,30,40,50};
        int [] numberB = copyArray(numberA);
        displayArray(numberA);
        displayArray(numberB);
        System.out.println(searchElement(numberA, 50));

        String [] fruits = {"กล้วย","มะละกอ","ส้ม","มะละกอ"};
        System.out.println(searchFruits(fruits,"ส้ม"));

    }

    static int [] copyArray(int [] a){
        // โยน Array A = 6 Array ใหม่ = 6 ช่องว่าง
        int [] newArr = new int[a.length];
        for(int i=0;i<a.length;i++){
            newArr[i] = a[i];
        }
        return newArr;
    }

    static void displayArray(int [] arr){
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
            System.out.print(",");
            }
            
            
        }
        System.out.print("}");

    }

    static int searchElement(int [] arr , int number){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == number){
                return i;
            }
        }
    return -1;

    }

    static int searchFruits(String [] arr , String name){
        for(int i =0; i<arr.length;i++){
            if(arr[i].equals(name)){
                return i;
            }
        }
        return -1;
    }

}

