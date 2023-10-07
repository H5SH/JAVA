import java.util.Scanner;

class PalindromeNumber{

    public static boolean palindrome(int number){

        // Check if palindrome
        // reverse number
        int rev = 0;
        int num = number;
        
        while(number != 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;
        }
        // check if the reverse is equal to the original
        if(num == rev){
            return true;
        }
        return false;
    }
    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        int Number;

        while(true){
            System.out.println("Enter number");
            Number = sc.nextInt();
            // if wrong input
            if(Number < 10000){
                System.out.println("Wrong Input, Must be 5 Characters");
            }
            //else check if palidrome
            else if(palindrome(Number)){
                // print palindrome
                System.out.println("Number " + Number + " is a palindrome");
                break;
            }
            else{
                // print not palindrome
                System.out.println("Number " + Number + " is not a palindrome");
                break;
            }

    }
    }
}