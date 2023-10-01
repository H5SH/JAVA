class T2{
    public static void main(String argv[]){
        int x = 2, y = 3, z = 4, count = 0;
        z = x + y;
        x++;
        count = z;
        if(count > 10){
            System.out.println("Count is gearter than 10");
        }
        --x;
        int total = count;
        total -= x;
        int q = 10;
        int remainder = q % 2;
        System.out.println(q + "%2 = " + remainder);
        System.out.println(q + " Divided by 2 we get Reaminder " + remainder);
    }
}