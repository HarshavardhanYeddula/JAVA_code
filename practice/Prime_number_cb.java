package practice;

import java.util.Scanner;

public class Prime_number_cb {

        public static void main(String args[]) {
            Scanner s= new Scanner(System.in);
            int n=s.nextInt();
            boolean flag = false;
            if(n>2&&n<=1000000000){

                for(int i = 2; i <= n/2; ++i)
                {
                    if(n% i == 0)
                    {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    System.out.println("Prime");
                else
                    System.out.println("Not Prime");
            }

        }
    }

