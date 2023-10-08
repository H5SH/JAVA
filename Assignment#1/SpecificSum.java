import java.util.Scanner;

class SpecificSum{
    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main Number");
        int MainSum = sc.nextInt();
        int i = 0, sum = 0;
        while(sum < MainSum){
            System.out.println("Enter number until there sum is bigger then MainNumber and the loop Breaks");
            i = sc.nextInt();
            sum += i;
        }
    }
}