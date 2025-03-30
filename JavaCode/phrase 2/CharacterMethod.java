class CharacterMethod {
    public static void main(String[] args){
         char [] group = {'A','B','C','D','E','ก','ข'};
        Character alphabet = new Character('1');
        char c = 'B';
        char d = 'y';
        System.out.println(Character.isDigit(c));
        // char alphabet = 'A' ;
        
        // System.out.println(alphabet);
        // System.out.println(group[5]);
    

    if(Character.isUpperCase(group[2])){
        System.out.println("เป็นตัวพิมพ์ใหญ่");
    }

    if(Character.isLowerCase(group[2])){
        System.out.println("เป็นตัวพิมพ์เล็ก");
    }

    System.out.println("Before = "+d);
    char result = Character.toUpperCase(d);
    // char result = Character.toLowerCase(d);
    System.out.println("After = "+result);

    }
}
