class Lab7Task1{
    public static Integer BoxingInt(int a){
        Integer b = Integer.valueOf(a);
        return b;
    }

    public static String BoxingString(String a){
        Integer b = Integer.parseInt(a);
        int c = b;
        String f = String.valueOf(c);
        return f;
    }
    public static void main(String argv[]){
        // String a = "hello World";
        // int helloWorld = 
       System.out.println(BoxingString("44"));

    }
}