class StringMethod2 {
    public static void main(String[] args) {
        // String message = " Happy New Year 2020 | Happy Birth Day 2020";

        // System.out.println("Before = " +message);
        // message = message.replaceFirst("2020","2021");
        
        // System.out.println("After = "+message);

        //String = > Array ต้องสัญลักษณ์
        // String data = "มะม่วง:มะยม:ขนุน:น้อยหน่า";
        // String [] fruit = data.split(":");
        // System.out.println(fruit[3]);
 
        //String name ="PunchrukMaew";
        // substring(เริ่มนับที่ 0, จุดสุดท้าย -1 );
        //String word = name.substring(5); 
        //System.out.println(word);

        //String name = "PunchRukMaew";
        //char [] alphabet = name.toCharArray();
        //System.out.println(alphabet[4]);
    
        // char [] name = { 'P','u','n','c','h'};
        // String result = String.copyValueOf(name);
        // System.out.println(result);
        
        // String name = "     PunchrukMaew    ";
        // System.out.println(name.length());
        // System.out.println(name);

        // name = name.trim();
        // System.out.println(name.length());
        // System.out.println(name); 
    
        // String name = "PunchRakMaew";
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
    
        int number = 36;
        double number2 = 3.1523;
        String result = String.valueOf(number);
        System.out.println(result);
        String result2 = String.valueOf(number2);
        System.out.println(result2);
    }    
}
