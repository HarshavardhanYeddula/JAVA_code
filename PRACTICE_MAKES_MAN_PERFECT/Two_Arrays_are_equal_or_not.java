package PRACTICE_MAKES_MAN_PERFECT;

import java.util.Scanner;

public class Two_Arrays_are_equal_or_not {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Size of first array: ");
        int n1 = s.nextInt();
        System.out.println("Size of second array: ");
        int n2 = s.nextInt();
//        System.out.println("Size of second array: "+n2);
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        boolean EqualOrnot=true;
        if(n1!=n2){
            System.out.println("Equal arrays can't be formed");
        }
        else{
        System.out.println("Enter Elements in first array");
        for (int i = 0; i <n1 ; i++) {
            arr1[i]=s.nextInt();
        }
        System.out.println("Enter Elements in second array");
        for (int i = 0; i <n2 ; i++) {
            arr2[i]=s.nextInt();
        }
        for (int i = 0; i <n1 ; i++) {
            System.out.println("Array 1 : "+arr1[i]);
        }
            for (int i = 0; i <n1 ; i++) {
                System.out.println("Array 2 : " + arr2[i]);
            }

            for (int i = 0; i <n1 ; i++) {
                if (arr1[i]!=arr2[i]){
                    EqualOrnot=false;
                }

               EqualOrnot=true;
            }



        }
        if (EqualOrnot==true){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
