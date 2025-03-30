class ArrayBasic1 {
    public static void main(String[] args) {
        // การสร้าง Array

        // แบบกำหนดขนาดเอาไว้
        // int[] number = new int[4];
        // number[0] = 10;
        // number[1] = 20;
        // number[2] = 30;
        // number[3] = 40;

        // System.out.println(number[0]);

        // แบบกำหนดสมาชิก

        // int[] number = {10,20,30,40};
        // System.out.println(number[0]);
        // number[0] = 199;
        
        //  int [] number = {10,30,5,2,525,63,52,312,523,62,888,1525,3556};
        // System.out.println(number.length); // เก็บขาดสมาชิกเอาไว้
        
        // boolean [] status = {true, false, true , true};
        // System.out.println(status.length);

        // String [] name = {"หมา", "แมว", "นก", "กา", "ไก่"};
        // name[3] = "ควาย";
        // System.out.println(name.length);

        // String [] pets = {"หมู", "หมา", "กา", "ไก่", "แมว", "มนุษย์" , "ปลา" , "งู" , "ตุ๊กแก" , "แกะ", "ค้างคาว"};
        // for ( int i = 0 ; i < pets.length ; i++){
        // System.out.println(pets[i]);
        // }

        // for(String data : pets){
        //     System.out.println(data);
        // }
    //     int sum = 0;
    //     for (int item: number){
    //         sum += item;
    //         if (item == 888){
    //             break;
    //         }
    //     } 
    //     System.out.println("ผลรวม = " +sum);

        String [][] products = { {"เก้าอี้","โต๊ะ","โคมไฟ"},{"คีย์บอร์ด","เม้าส์","แป้นพิมพ์"},{"ลิปติก","โรลออน","ครีม"}};
        // products[2][0] = "แผ่นรองเม้าส์";
        // System.out.println(products[2][0]);
        // System.out.println(products[0].length);
        for(int row = 0; row< products.length; row++){
            for(int column = 0; column < products[row].length; column++){
                System.out.println(products[row][column]);
            }
            
        }
    }    
}
