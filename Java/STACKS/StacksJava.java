package STACKS;
import java.util.*;

class Test {
    
    static void stackPush(Stack<Integer> stack) {  //PUSH
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stackPop(Stack<Integer> stack) { //POP
        System.out.println(("POP operation"));
        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }
    
    static void stackDisplay(Stack<Integer> stack) { //DISPLAY
        Integer element = (Integer) stack.peek();
        System.out.println("Top of stack: " + element);
    }
    
    static void stackSearch(Stack<Integer> stack, int element){
        Integer position = (Integer) stack.search(element);
        if (position == -1) {
            System.out.println(("Element not found."));
        }
        else {
            System.out.println("Element found at : "+position);
        }
    }
                
}

public class StacksJava{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        Test obj = new Test();
        Test.stackPush(stack);
        Test.stackPop(stack);
        Test.stackPush(stack);
        Test.stackDisplay(stack);
        Test.stackSearch(stack, 2);
        Test.stackSearch(stack, 6);
    }
}