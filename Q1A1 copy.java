import java.util.Scanner;

class PalindromeNumber{

    public static boolean palindrome(int number){

        int reverse = 0;
        int original = number;
        
        while(number != 0) {
            int remember = number % 10;
            reverse = reverse * 10 + remember;
            number /= 10;
        }

        if(original == reverse){
            return true;
        }
        return false;
    }
    public static void main(String argv[]){
        try (Scanner sc = new Scanner(System.in)) {
            int Number;

            while(true){
                System.out.println("Enter number");
                Number = sc.nextInt();
                if(Number < 10000){
                    System.out.println("Invalid Input");
                }
                else if(palindrome(Number)){
                    System.out.println("Number " + Number + " is a palindrome");
                    break;
                }
                else{

                    System.out.println("Number " + Number + " is not a palindrome");
                    break;
                }

   }
        }
    }
}