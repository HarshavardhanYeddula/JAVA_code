package stack;

import java.util.Stack;

public class stack_client {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        try{
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
