import java.util.Scanner;

class Factorial{

    // function for factorial
    public static int Factorial(int number){
        int p = number;
        for(int i = p - 1; i > 0; i--){
            p *= i;
        }
        // return factorial
        return p;
    }

    // function for Mathematical Constant e
    public static double MathContant(int iterations){
        double e = 1.0;
        for(int i = 1; i <= iterations; i++){
            e += (double)i/Factorial(i);
        }
        return e;
    }

    // function for Mathematical Constant e raise to power x
    public static double MathContantRaiseToX(int iterations, int x){
        double e = 1.0;
        for(int i = 1;i <= iterations; i++){
            e += (double)(Math.pow(x, i)/Factorial(i));
        }
        return e;
    }
    public static void main(String argv[]){
        // Manu for factorial, constant and raise to X constant
        System.out.println("Press 1 for Factorial");
        System.out.println("Press 2 for Mathematical Constant e");
        System.out.println("Press 3 for mathemitical Contant e raise to power x"); 

        System.out.println("Enter your Choice");
        Scanner sc = new Scanner(System.in);

        // take option
        int choice = sc.nextInt();
        int number = 0;

        // incase of factorial
        if(choice == 1){
            // take number for factorila
            System.out.println("Enter the Number for Factorial");
            number = sc.nextInt();

            // if the number is Nagetive the break
            if(number < 0){
                System.out.println("Invalid Input");
            }
            else{
                // call factorial function and display asnwer
                System.out.println("The Factorial of " + number + " is " + Factorial(number));
            }
        }

        // incase of contant
        else if(choice == 2){
            // take number of iterations
            System.out.println("Enter The Number of Iterations");
            number = sc.nextInt();

            // if the number is Nagetive the break
            if(number <= 0){
                System.out.println("Invalid Input");
            }
            else{
                // call function and display answer
                System.out.println("Mathematical Constant With " + number + " iterations is " + MathContant(number));
            }
        }
        
        // incase of constant raise to the power x
        else if(choice == 3){
            // take number of iterations
            System.out.println("Enter the number of iterations");
            number = sc.nextInt();
            // take value of x
            System.out.println("Enter the Value of X");
            int x = sc.nextInt();

            // if the number is Nagetive the break
            if(number <= 0 || x <= 0){
                System.out.println("Invalid Input");
            }
            else{
                // call function and display
                System.out.println("Mathematical Constant with " + number + " iterations and value of x = " + x + " is " + MathContantRaiseToX(number, x));
            }
        }
        else{
            // wrong input
            System.out.println("Invalid Input");
        }

    }
}