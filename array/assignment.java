package array;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        int p = s.nextInt();
        float ans = square(a);
        float f = (float)0.1;
        for (int i = 0;i<p;i++){
            while (ans*ans<=a){
                ans=ans+f;
            }
        ans=ans-f;
            f=f/10;
        }
        System.out.println(ans);
        System.out.printf("%"+p+"f",ans);
    }

    public static int square(int n) {
        int ans = 0;
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == n) {

                return mid;
            } else if (mid * mid < n) {
                ans = mid;
                start = mid + 1;

            } else {
                end = mid - 1;


            }
        }
        System.out.println(ans);
        return ans;
    }
}
