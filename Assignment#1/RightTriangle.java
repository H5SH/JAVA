import java.util.Scanner;

class RightTriangle{
    public static void main(String argv[]){
        int lenght, base;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter length of the Triangle Between 1 to 10");
            lenght = sc.nextInt();
            System.out.println("Enter Base of the Triangle between 1 to 10");
            base = sc.nextInt();
        }

        if(lenght > 10 || base > 10){
            System.out.println("Wrong Input Try Again");
        }
        else{
            for(int i = 0; i < lenght; i++){
                for(int j = 0; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}