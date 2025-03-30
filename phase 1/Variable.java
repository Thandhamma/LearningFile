class Variable {
    public static void main(String[] args) {
        
        // เช็คชนิดข้อูล
        Integer a=10;
        Double b;
        String c="Hello World";
        Boolean d;
        Character e;
        Float f;

        // เป็น (true) / ไม่เป็น (false)
        boolean result = a.toString() instanceof String;
        System.out.println(result);
    }   
}
