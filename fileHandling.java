import java.io.*;
import java.util.Scanner;
public class fileHandling {
    public static void Task1(String[] args) throws IOException
    {
        //Task1

        try{
            File Obj = new File("input2.txt");
            if (Obj.createNewFile()) {
                System.out.println("File created: "+ Obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
            int count = 0;
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String[] words = Reader.nextLine().split(" ");
                for(String word: words){
                    count++;
                }
//                String data2=Reader.nextLine();
                // System.out.println(data);
                // data=data.replaceAll("\\s","");
                // int n = data.length();

                System.out.println(count);
            }
            Reader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    public static void Task3(String argv[]) throws IOException{

    try {
        File file = new File("input.csv");
        Scanner scanner = new Scanner(file);
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }

        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

    
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] data = line.split(",\\s*");


            String name = data[0];
            int rollNo = Integer.parseInt(data[1]);
            String department = data[2];
            String result = data[3];
            double cgpa = Double.parseDouble(data[4]);


            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println("Department: " + department);
            System.out.println("Result: " + result);
            System.out.println("CGPA: " + cgpa);
            System.out.println();
        }

        scanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not found");
    }

}

public static void Task2(String argv[]){
    // Task2

    try {
        boolean q = true;
        FileWriter writer = new FileWriter("output.txt", true);
        Scanner scanner = new Scanner(System.in);
         File file = new File("output.txt");
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }


        while (q) {
            System.out.println("Enter");
            String input = scanner.nextLine();
            System.out.println("Enter Input or Enter q to exit ");
            if (input.equals("q")) {
                q = false;
            } else {
                writer.write(input);
                writer.write(System.lineSeparator());
            }
        }

        writer.close();
        scanner.close();

    } catch (IOException e) {
        System.out.println("Unable to write");
        e.printStackTrace();

    }

}

public static void main(String argv[]){
      // Task5
      try {
        File file = new File("DeleteMe.txt");
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }

    } catch (IOException e) {
        System.out.println("An error has occurred.");
        e.printStackTrace();
    }


        File Obj= new File("DeleteMe.txt");
        if (Obj.delete()) {
            System.out.println("The deleted file is : "+ Obj.getName());
        }
        else {
            System.out.println("Failed in deleting the file.");
        }
 
    }

}
