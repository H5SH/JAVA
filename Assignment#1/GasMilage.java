import java.util.Scanner;

class GasMilage{
    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);

        // Total number of trips
        int trips;
        System.out.println("Enter the number of trips");
        trips = sc.nextInt();

        // Gallons and miles for Each trip
        int[] miles, gallons;
        miles = new int[trips];
        gallons = new int[trips];

        // Total Miles and Gallons for Total average
        int totalMiles = 0, totalGallons = 0;

        // Taking input for each trip
        for(int i = 0; i < trips; i++){
            System.out.println("Enter Miles for trip " + (i + 1));
            miles[i] = sc.nextInt();
            totalMiles += miles[i];
            System.out.println("Enter Gallons for trip " + (i + 1));
            gallons[i] = sc.nextInt();
            totalGallons += gallons[i];
            System.out.println("trip " + (i + 1) + " Cost " + miles[i]/gallons[i] + "Miles per Gallons");
        }

        System.out.println("Average of all Trips is " + (totalMiles/trips)/(totalGallons/trips));
    }
}