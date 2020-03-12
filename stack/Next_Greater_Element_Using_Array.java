package stack;

import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element_Using_Array {
    public static void main(String[] args) {
        int[] arr = {2,1,3,8,6,7,5};
//
//        Scanner s = new Scanner(System.in);
//        int size = s.nextInt();
//        int [] arr= new int[size];
//        for (int i = 0; i <size ; i++) {
//            arr[i]=s.nextInt();
//            int ar=arr[i];
//        }
//        System.out.println(ar);
        Stack<Integer> stack =new Stack<>();
        for (int i = 0; i <arr.length ; i++) {

            while (!stack.isEmpty()&&arr[i]>stack.peek()){
                int rv = stack.pop();
                System.out.println(rv+"-->"+arr[i]);
            }
            stack.push(arr[i]);}
            while (!stack.isEmpty()){
                int rv = stack.pop();
                System.out.println(rv+"-->"+-1);
            }

        }
    }


