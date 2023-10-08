import java.util.Scanner;

class CommissionCalculator{
    public static void main(String argv[]){
        System.out.println("Item     Value");
        System.out.println(" 1       239.99");
        System.out.println(" 2       129.75");
        System.out.println(" 3        99.95");
        System.out.println(" 4       350.89");

        try (Scanner sc = new Scanner(System.in)) {
            int[] sales;
            double total = 0.0;
            sales = new int [4];
            for(int i = 0; i < sales.length; i++){
                System.out.println("Number of Item " + (i + 1) + "sold");
                sales[i] = sc.nextInt();
                if(i == 0){
                    total += 239.99 * sales[i];
                }
                else if(i == 1){
                    total += 129.75 * sales[i];
                }
                else if(i == 2){
                    total += 99.95 * sales[i];
                }
                else{
                    total += 350.89 * sales[i];
                }
            }

            float precentage = (float) (0.09 * total);
            float earnings = precentage + 200;
            System.out.println("Base Earning $200 plus $" + total + " in Sales gives You a commision of "+ precentage + " So total earnig is " + earnings);
        }


    }
}