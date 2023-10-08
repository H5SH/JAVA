import java.util.Scanner;

class Comparator{
    public static void main(String argv[]){
        // take numbers input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int FirstNum = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int SecondNum = sc.nextInt();

        // compare return 0 if equal
        if(FirstNum == SecondNum){
            System.out.println("Numbers are equal so returning 0");
            System.exit(0);
        }

        // return 1 if firstNumber is greater
        else if(FirstNum > SecondNum){
            System.out.println("First Number is greater so returning 1");
            System.exit(1);
        }

        // return -1 if second is greater
        else{
            System.out.print("Second number is greater so returning -1");
            System.exit(-1);
        }
        
    }
}