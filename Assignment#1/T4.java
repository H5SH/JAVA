class T4{
    public static void main(String argv[]){
        int sum = 0;
        int x = 1;
        
        while(x <= 10){
            sum += x++;
        }

        System.out.println("The Sum is: " + sum);
    }
}