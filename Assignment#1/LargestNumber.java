import java.util.Scanner;

class LargestNumber{
    public static void main(String argv[]){
        int[] number;
        number = new int[10];
        int largest = -10000;
        try (Scanner sc = new Scanner(System.in)) {
            for(int count = 0; count < number.length; count++){
                System.out.println("Enter Sales of Salesperson " + (count + 1));
                number[count] = sc.nextInt();
                if(largest < number[count]){
                    largest = number[count];
                }
            }
        }
        System.out.println("The largest Sales Figure is " + largest);

    }
}