import java.util.Scanner;

class Lab7Task3{
    enum Months{
        January,
        Feburary,
        March,
        April,
        May,
        June, 
        July, 
        August, 
        Suptember, 
        Octuber, 
        November, 
        December
    }
    public static void main(String argv[]){

        System.out.println("Enter the name of the month");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        
        Months first = Months.January;
        
        // Months second = Months.Feburary;
        // Months third = Months.March;
        // Months forth = Months.April;
        // Months fifth = Months.May;
        // Months sixth = Months.June;
        // Months seventh = Months.July;
        // Months eigth = Months.August;
        // Months ninth = Months.Suptember;
        // Months tenth = Months.Octuber;
        // Months eleventh = Months.November;
        // Months teleth = Months.December;

        if(month.equals(Months.January.name())){
            System.out.print("1");
        }
        else if(month.equals(Months.Feburary.name())){
            System.out.println("2");
        }
        else if(month.equals(Months.March.name())){
            System.out.println("3");
        }
        else if(month.equals(Months.April.name())){
            System.out.println("4");
        }
        else if(month.equals(Months.May.name())){
            System.out.println("5");
        }
        else if(month.equals(Months.June.name())){
            System.out.println("6");
        }
        else if(month.equals(Months.July.name())){
            System.out.println("7");
        }
        else if(month.equals(Months.August.name())){
            System.out.println("8");
        }
        else if(month.equals(Months.Suptember.name())){
            System.out.println("9");
        }
        else if(month.equals(Months.Octuber.name())){
            System.out.println("10");
        }
        else if(month.equals(Months.November.name())){
            System.out.println("11");
        }
        else if(month.equals(Months.December.name())){
            System.out.println("12");
        }

    }
}