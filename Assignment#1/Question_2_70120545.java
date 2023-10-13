import java.util.Random;
import java.util.Scanner;

class Coin{
    private String[] coin = {"Head", "Tail"};
    private Random random = new Random();
    
    public String toss(){
        return coin[random.nextInt(2)];
    }
}

class Flips extends Coin{

    private int heads = 0, tail = 0, total = 0;

    public void flip(){
        ++total;
        String toss = super.toss();
        System.out.println(toss);
        if(toss.equals("Head")){
            ++heads;
        }else{
            ++tail;
        }
    }

    public int getTotal(){
        return this.total;
    }

    public int getHeads() {
        return heads;
    }

    public int getTail() {
        return tail;
    }

    
}


class Question_2_70120545{
    public static void main(String argv[]){
        Flips flip = new Flips();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            // main menu
            System.out.println("Press 1 to Flip once");
            System.out.println("Press 2 to flip multiple times");
            System.out.println("Press 3 to exit");

            System.out.println("Enter your choice");
            choice = sc.nextInt();

            // a break loop method
            if(choice == 3){
                sc.close();
                break;
            }

            // a single flip option with display of what happened
            else if(choice == 1){
                flip.flip();
            }

            // a multy flips option with display of each flip and total number of heads and tails
            else if(choice == 2){
                // take number of flips
                System.out.println("Enter the number of iterations");
                int number = sc.nextInt();

                // loop the flips
                for(int i = 0; i < number; i++){
                    flip.flip();
                }

                // display total number of heads and tails
                System.out.println("Total Heads :" + flip.getHeads());
                System.out.println("Total Tails :" + flip.getTail());
            }

            // wrong input try again
            else{
                System.out.println("Invalid Input Please Try again");
            }
        }
        // display total flips and number of heads and tails
        System.out.println("Total Heads :" + flip.getHeads());
        System.out.println("Total Tails :" + flip.getTail());
        System.out.println("Total Tosses :" + flip.getTotal());
    }
}