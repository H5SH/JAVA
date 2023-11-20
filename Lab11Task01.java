import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Lab11Task01{
    public static void main(String argv[]){
        // ArrayList
        List<String> colors = new ArrayList<String>();
        // some colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Orange");

        // iterating over color
        System.out.println("iterating over color");
        for(String color: colors){
            System.out.println(color);
        }

        // element at first position
        colors.add(0, "Pink");

        // element at specified index
        System.out.println("elemt at specified index");
        System.out.println(colors.get(2));

        // Update a specific array element by given element
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of a color");
        String color = sc.next();
        sc.nextLine();
        while(true){
        System.out.println("Enter the index between 0 and " + (colors.size() - 1));
        int index = sc.nextInt();
        if(index < colors.size()){
            colors.add(index, color);
            System.out.println("Updated");
            break;
        }else{
            System.out.println("Index to big");
        }
    }
    System.out.println(colors);

    colors.remove(2);

    // Search an element
    System.out.println("Element search");
    System.out.println(colors.contains(color));

    // sort given array
    System.out.println("Sorted Array");
    colors.sort(null);
    System.out.println(colors);

    // Shuffle
    System.out.println("Shuffle");
    System.out.println(colors.iterator());
    
    // Reverse
    System.out.println("Reverse");
    List<String> colorsReverse = new ArrayList<String>();
    for(int i = colors.size() - 1; i >= 0; i--){
        colorsReverse.add(colors.get(i));
    }
    System.out.println(colorsReverse);

    // Swap 2 elements
    System.out.println("Swaped element");
    while(true){
    System.out.println("Enter first swaping index between 0 " + (colors.size() - 1));
    int firstIndex = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Second Swaping index 0 " + (colors.size() - 1));
    int secondIndex = sc.nextInt();
    sc.nextLine();
    if (firstIndex < colors.size() || firstIndex > 0 || secondIndex < colors.size() - 1 || secondIndex > 0){
        String tempColor = colors.get(firstIndex);
        colors.set(firstIndex, colors.get(secondIndex));
        colors.set(secondIndex, tempColor);
        System.out.println("Swaped");
        break;
    }else{
        System.out.println("Invalid index");
    }
}

// Exract portion of an array
System.out.println("SubList");
System.out.println(colors.subList(0, 2));

// 2nd element with specified
System.out.println("Enter specified element");
String specifiedElementString = sc.next();
sc.nextLine();

colors.set(1, specifiedElementString);
System.out.println(colors);

// Empty
System.out.println("Empty List");
colors.clear();
System.out.println(colors);

// Empty or not
System.out.println("List is empty: " + colors.isEmpty());

// Copy an List into another
List<String> secondList = new ArrayList<String>();
secondList.addAll(colorsReverse);
System.out.println("Copyed List");
System.out.println(secondList);



    sc.close();
    }
}