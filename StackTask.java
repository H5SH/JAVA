import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;


class StackTask{

    public static Stack<Integer> ascendingStack(Stack<Integer> stack)
    {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!stack.isEmpty())
        {
            int tmp = stack.pop();
    
            while(!tmpStack.isEmpty() && tmpStack.peek() < tmp)
            {
                stack.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        return tmpStack;
    }

    public static void reverseStack(Stack<Integer> stack){
        Queue<Integer> arrCopy=new LinkedList<Integer>();
        while(!stack.empty()){
            arrCopy.add((int)stack.pop());
        };
        System.out.println();
        while(!arrCopy.isEmpty()){
            System.out.print((int)arrCopy.remove() + ", ");
        }
        System.out.println();
    }

    public static int stackCount(Stack<Integer> stack){
        Stack<Integer> countStack = new Stack<Integer>();
        countStack.addAll(stack);
        int count = 0;
        while(!countStack.empty()){
            countStack.pop();
            count++;
        }
        return count;
    }

    public static Stack<Integer> removeDuplicate(Stack<Integer> stack){
        Set<Integer> set = new HashSet<Integer>();
        // enter all in set to remove duplicate
        while(!stack.empty()){
            set.add(stack.pop());
        }

        // filling stack with non repatative data
        for(Integer i: set){
            stack.push(i);
        }

        return stack;
    }

    public static Stack<Integer> stutter(Stack<Integer> stack){
        Stack<Integer> stutterStack = new Stack<Integer>();
        Stack<Integer> temp = new Stack<Integer>();
        while(!stack.empty()){
            temp.push(stack.pop());
        }
        while(!temp.isEmpty()){
            int i = temp.pop();
            stutterStack.add(i);
            stutterStack.add(i);
        }
        return stutterStack;
    }

    public static boolean equal(Stack<Integer> stack1, Stack<Integer> stack2){
        int notequal = 0;
        if(stack1.size() == stack2.size()){
            while(!stack1.isEmpty()){
                if(stack1.pop() != stack2.pop()){
                    notequal++;
                }
            }
            if(notequal > 0){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }

    public static void Chocolate(){
        int count = 0;
        Stack<Integer> stock = new Stack<Integer>();
        Stack<Integer> sold = new Stack<Integer>();
        Scanner sc = new Scanner(System.in); 
        while(true){
            System.out.println("press 1 to Add A chocolate Box");
            System.out.println("press -1 to Sell A chocolate Box");
            System.out.println("press 0 to Exit");
            int c = sc.nextInt();
            sc.nextLine();
            if(c == 0){
                break;
            }
            else if(c == 1){
                stock.push(++count);
            }
            else if(c == -1 && count > 0){
                stock.pop();
                sold.push(--count);
                System.out.println(stackCount(sold));
            }
            else if(stock.empty()){
                System.out.println("Chocolates are out stock");
            }
            else{
                System.out.println("Wrong Input try again");
            }
        }

    }
    
    public static void main(String argv[]){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(20);
        stack.push(40);
        stack.push(20);
        stack.push(40);
        stack.push(34);
        stack.push(23);
        stack.push(45);

        System.out.println("Stack Top Element: " + stack.peek());
        System.out.println("Stack is Empty: " + stack.isEmpty());

        // Ascending stack
        Stack<Integer> ascendingStack = ascendingStack(stack);
        System.out.println("Decending stack: " + ascendingStack);

        // Stack count
        System.out.println("Stack count: " + stackCount(ascendingStack));
        
        // Non duplicated Stack
        Stack<Integer> noDuplication = removeDuplicate(ascendingStack);
        System.out.println("No duplicate Stack: " + noDuplication);
        System.out.println(noDuplication.remove(2) + " Removed");

        System.out.println("Stack subList: " + noDuplication.subList(0, 2));

        // Stutter 
        Stack<Integer> stutter = stutter(noDuplication);
        System.out.println("Stutter: " + stutter);

        // Chocolate
        System.out.println();
        System.out.println();
        Chocolate();
    }
}