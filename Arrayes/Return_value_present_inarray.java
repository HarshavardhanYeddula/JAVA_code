package Arrayes;

import java.util.Scanner;

public class Return_value_present_inarray {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = s.nextInt();
        int a[] = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at index " + i + " :");
            a[i] = s.nextInt();

//            System.out.print(a[i]+"->");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "->");
        }
        System.out.print("end");
        System.out.println();

        System.out.println("Enter Search element");
        int User_input = s.nextInt();
//        boolean find=true;
        present(a,User_input);
        System.out.println(present(a,User_input));
    }

    public static int present(int a[],int User_input){
        int len=a.length;
        int i=0;
      while (i<len){
          if(a[i]==User_input){
              return i;
          }
          else{
             i= i+1;
          }

        }
      return -1;
    }
}




