class Escape {
    public static void main(String[] args) {
        /*
          \n => ขึ้นบรรทัดใหม่
          \t => tab
            \b => ลบตัวอักษรก่อนหน้า
            \r => กลับไปที่ตำแหน่งแรกสุดของบรรทัด
            \\ => แสดงเครื่องหมาย \
            \" => แสดงเครื่องหมาย "
            \' => แสดงเครื่องหมาย '

         */
        System.out.println("Hello\nWorld");
        System.out.println("Hello\tWorld");
        System.out.println("Hello W\bor\bld");
    }
}
