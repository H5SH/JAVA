import java.util.Scanner;

class BinaryToDecimal{

    public static int Decimal(int binary){
        // take the value of right most
        int rightMost = binary % 10;
        binary = binary / 10;

        // take value of second bit
        int SecongBit= binary % 10;
        binary = binary / 10;
        
        // 3Rd bit
        int ThirdBit = binary % 10;
        binary = binary / 10;

        // 4th bit
        int ForthBit = binary % 10;

        // return -1 if the number is not Binary
        if((rightMost != 1 && rightMost != 0) ||
        (SecongBit != 1 && SecongBit != 0) ||
        (ThirdBit != 1 && ThirdBit != 0) ||
        (ForthBit != 1 && ForthBit != 0)){
            return -1;
        }
        else{
            // return Decimal Value
            return rightMost * 1 + SecongBit * 2 + ThirdBit * 4 + ForthBit * 8;
        }
        
    }
    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        // take binary input og 4 char
        System.out.println("Enter binary numbers consisting of 4 bits");
        int binary = sc.nextInt();

        // return if the number is smaller then 1000
        if(binary < 1000 || binary > 9999){
            System.out.println("Input must be of 4 bits");
        }
        else{
            // convert to decimal
            int decimal = Decimal(binary);
            if(decimal == -1){
                System.out.println("Invalid Input");
            }
            // if the number is not binary break
            else{
                System.out.println("Decimal value of " + binary + " is " + decimal);
            }
        }

        
    }
}