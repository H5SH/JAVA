import java.util.Scanner;


class Login{
    private String Admin = "Admin", Password = "Admin";
    public boolean Validation(String name, String pass){
        if(Admin.equals(name) && Password.equals(pass)){
            return true;
        }
        return false;
    }
}

class Resturant{
    private int size = 10;
    private String Menu[] = new String[size];
    private int prices[] = new int[size];
    private int index = 0, total = 0;
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
                Menu[i] = Menu[index];
                Menu[index] = temp;

                // swap price
                int tempPrice;
                tempPrice = prices[i];
                prices[i] = prices[index];
                prices[index] = tempPrice;

                // swap rating
                double tempRating;
                tempRating = rating[i];
                rating[i] = rating[index];
                rating[index] = tempRating;

                // Store null
                Menu[index] = "None";
                prices[index] = 0;
                rating[index] = 0.0;

                --index;

                System.out.println(name + " Deleted");
                break;
            }
        }

        // re arrange the array and dicriment the index
        // reArrange all the arrays price and rating
    }

    public int getTotal(){
        return total;
    }

    public void DisplayMenu(){
        for(int i = 0;i < size; i++){
            System.out.println(Menu[i] + "   " + prices[i] + "   " + rating[i]);
        }
    }

    public boolean takeOrder(String item, int quentity){
        for(int i = 0; i < size; i++){
            if(Menu[i].equals(item)){
                this.total = (prices[i] + total)*quentity;
                System.out.println(total);
                return true;
            }
        }
        return false;
    }
    
}

class ResturantManaging{
    public static void main(String argv[]){
        // Class Object
        Resturant r = new Resturant();
        Login login = new Login();

        String name;
        String Password;
        // Scanner for input
        Scanner sc = new Scanner(System.in);
        while(true){

        System.out.println("Enter 1 t logIn as Admin");
        System.out.println("Enter Any Other Number to Use as User");
        System.out.println("Enter -1 to exit");
        int c = sc.nextInt();

        if(c == -1){
            System.out.println("Bye");
            sc.close();
            break;
        }
       
       
        else if(c == 1){
            System.out.println("Enter Username");
            name = sc.next();
            System.out.println("Enter Password");
            sc.nextLine();
            Password = sc.next();
            
            if(!login.Validation(name, Password)){
               System.out.println("Failed to login");
        }
        else{
            System.out.println("Loged in");
        
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
             name = sc.next();

            // take price
            System.out.println("Enter Price for " + name);
            int price = sc.nextInt();

            // Call Function
            r.setMenu(name, price);
        }
        else if(s == 2){
            // take Item name
            System.out.println("Enter the name of the Item you want to delete");
            name = sc.next();

            // Call delete function
            r.DeleteItem(name);
        }
        else if(s == 3){
            // take name
            System.out.println("Enter the name of Item you want to rate");
            name = sc.next();

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
            break;
        }
        else{
            System.out.println("Wrong input please try again");
        }
    }
    }
}
else if(c != -1){
    while(true){
        // display Manue
        r.DisplayMenu();

        // Take order and Calculate bill
        System.out.println("Enter Name of the Item or Press Q to Exit");
        String item = sc.next();

        if(item.equals("Q")){
            // Exit display Bill
            System.out.println("Your Bill is " + r.getTotal());
            break;
        }
        System.out.println("Enter Quentity");
        sc.nextLine();
        int quentity = sc.nextInt();
        if(r.takeOrder(item, quentity))
        {
        System.out.println("Order has been Taken");
        }
        else{
            System.out.println("Order has been Taken");
        }

    }
}
        }
    }
    
}