package Tricky_Questions;

public class Duplicate_elements_inArray {
    public static void main(String[] args) {
// for numbers
        int a[]={1,1,2,3,4,5,6,7,3,8};

        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if((a[i]==a[j]) &&(i!=j)){
                    System.out.println("duplicate value are : "+a[j]);
                }

            }

        }
// for string
        String str[]={"hello","hi","if","else","hello","hi","else if"};
        for (int i = 0; i <str.length-1 ; i++) {
            for (int j = i+1; j <str.length ; j++) {
                if ((str[i].equals(str[j]))&&(i!=j)){

                        System.out.println("duplicate value are : " + str[j]);
                    }

            }

        }
    }
}
