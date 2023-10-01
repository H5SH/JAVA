import java.util.Scanner;

class Resturant{
    private int size = 10;
    private String Menu[] = new String[size];
    private int prices[] = new int[size];
    private int index = 0;
    private double rating[] = new double[size];
    
    
    

    public Resturant() {
        for (int i = 0;i < size; i++){
            // Store None in Menu
            Menu[i] = "None";
            // Store 0 in prices
            prices[i] = 0;
            // Store 0.0 in ratings
            rating[i] = 0.0;
        }
    }

    public String[] getMenu() {
        return Menu;
    }

    // new Item must be added with the price
    public void setMenu(String menu, int price) {
        this.Menu[index] = menu;
        setPrices(price);
    }
  
    public int[] getPrices() {
        return prices;
    }

    // price can not be added independently so the function is private
    private void setPrices(int prices) {
        this.prices[index++] = prices;
    }

    public double[] getRating() {
        return rating;
    }

    // sets rating according to the item name
    public void setRating(double rating, String name) {
        for(int i = 0; i < size; i++){
            if(Menu[i].equals(name)){
                this.rating[i] = rating;
                System.out.println("Rating added for " + Menu[i]);
                break;
            }
        }
    }

    // Average Rating
    public double CalculateAverageRating(){
        double sum = 0;
        for(int i = 0; i < size; i++){
            sum = sum + rating[i];
        }
        return (double)sum/size;
    }


    public void DeleteItem(String name){
        // find the item
        for (int i = 0; i < size; i++){
            if(Menu[i].equals(name)){
                // Swap with last element, store null and dicrement index
                // Swap item
                String temp;
                temp = Menu[i];
                Menu[i] = Menu[size - 1];
                Menu[size - 1] = temp;

                // swap price
                int tempPrice;
                tempPrice = prices[i];
                prices[i] = prices[size - 1];
                prices[size - 1] = tempPrice;

                // swap rating
                double tempRating;
                tempRating = rating[i];
                rating[i] = rating[size - 1];
                rating[size - 1] = tempRating;

                // Store null
                Menu[size - 1] = "None";
                prices[size - 1] = 0;
                rating[size - 1] = 0.0;

                --index;

                System.out.println(name + " Deleted");
                break;
            }
        }

        // re arrange the array and dicriment the index
        // reArrange all the arrays price and rating
    }

    public void DisplayMenu(){
        for(int i = 0;i < size; i++){
            System.out.println(Menu[i] + "   " + prices[i] + "   " + rating[i]);
        }
    }
    
}

class ResturantManaging{
    public static void main(String argv[]){
        // Class Object
        Resturant r = new Resturant();

        // Scanner for input
        Scanner sc = new Scanner(System.in);

        while(true){
        // Basic Home page
        System.out.println("Press 1 to add New Item");
        System.out.println("Press 2 to Delete Item");
        System.out.println("Press 3 to Rate Item");
        System.out.println("Press 4 to Get Average Rating");
        System.out.println("Press 5 to Display Menu");
        System.out.println("Press 6 to Exit");

        int s = sc.nextInt();
        sc.nextLine();
        if(s == 1){
            // take name
            System.out.println("Enter Name of the new item");
            String name = sc.next();

            // take price
            System.out.println("Enter Price for " + name);
            int price = sc.nextInt();

            // Call Function
            r.setMenu(name, price);
        }
        else if(s == 2){
            // take Item name
            System.out.println("Enter the name of the Item you want to delete");
            String name = sc.next();

            // Call delete function
            r.DeleteItem(name);
        }
        else if(s == 3){
            // take name
            System.out.println("Enter the name of Item you want to rate");
            String name = sc.next();

            // take rating
            System.out.println("Enter rating of " + name);
            sc.nextLine();
            double rating = sc.nextDouble();

            // call setRating function
            r.setRating(rating, name);
        }
        else if(s == 4){
            // Call Average Rating function6
            System.out.println("Average rating is :" + r.CalculateAverageRating());
        }
        else if(s == 5){
           r.DisplayMenu();
        }
        else if( s == 6){
            sc.close();
            break;
        }
        else{
            System.out.println("Wrong input please try again");
        }
    }
    }
}