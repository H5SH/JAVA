import java.util.Scanner;

class TwoLargestNumbers{
    public static void main(String[] argv){
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        // initializing largest with a small value
        int largest = -10000;
        int largest2nd = -10000;

        // take input and checking the largest 
        for(int i = 0; i < 10; i++){
            System.out.println("Enter Value of " + (i + 1));
            a[i] = sc.nextInt();
            if(a[i] > largest){
                largest = a[i];
            }
        }

        // checking second largest because we need a certain largest before calculating the second largest 
        for(int i = 0; i < 10; i++){
            if(a[i] > largest2nd && a[i] < largest){
                largest2nd = a[i];
            }
        }
        sc.close();
        System.out.println("Largest Number is " + largest);
        System.out.println("Second Largest Number is " + largest2nd);
    }
}