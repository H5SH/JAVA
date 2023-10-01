import java.util.Scanner;

class javaLab3{

    public static int Factorials(int a){
        int q = a;
        for (int i = a - 1; i > 0; i--){
            q = q * i;
        }
        // System.out.println(q);
        return q;
    }
    public static void main(String argv[]){
        int [] arr, factorials;
        arr = new int [5];
        factorials = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Values");

        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();
            // System.out.println(arr[i]%2);
            if(arr[i]%2 == 0){
                factorials[i] = Factorials(arr[i]);
            }
        }

        System.out.println("Array Values Are");
        for(int i = 0; i < arr.length; i++){
            System.out.println(factorials[i]);
        }

        // for(int i = 0; i < arr.length; i++){
        //     arr[i] =  arr[i] * arr[i];
        // }

        //  System.out.println("Square of Array");
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        
        // System.out.println("Reversed Array");
        // for(int i = arr.length - 1; i >= 0; i--){
        //     System.out.println(arr[i]);
        // }

        // int mid = arr.length/2;
        // arr[mid] = arr[mid] * arr[mid] * arr[mid];
        // System.out.println("Cube");
        // System.out.println(arr[mid]);


        
    }

    
}