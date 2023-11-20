import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Lab11Task03{
    public static void main(String argv[]){
        List<String> names = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter name");
            String name = sc.next();
            sc.nextLine();
            if (name.equals("quite")){
                break;
            }

            names.add(name);
        }

        // foreach
        System.out.println("All names");
        names.forEach((n)-> System.out.println(n));

        // Lucky winner
        Random random = new Random();
        System.out.println("Lucky Winner");
        System.out.println(names.get(random.nextInt(names.size() - 1)));


    }
}