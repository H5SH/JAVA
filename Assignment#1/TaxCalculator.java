import java.util.Scanner;

class TaxCalculator{
    public static void main(String argv[]){
        System.out.println("Enter your Anual earning in USD");
        Scanner sc = new Scanner(System.in);
        int earnings = sc.nextInt();
        double tax = 0.0;
        if(earnings <= 0){
            System.out.println("Invalid Input");
        }
        else if(earnings <= 30000){
             tax = (double)(0.15*earnings);
        }
        else{
             int Above30 = earnings - 30000;
             // tax fro 30000 USD
             tax = (double)(0.15 * 30000);
             // tax for the pay above 30000
             tax += (double)(0.2 * Above30);
        }
        System.out.println("Your Tax is " + tax); 
    }
}