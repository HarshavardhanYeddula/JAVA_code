package practice;

public class spiral {
    public static void main(String[] args) {
        int[][] a ={{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
        int t = 0;
        int l =0;
        int bottom = a.length-1;
        int right = a[0].length-1;
        while(t<= bottom && l<= right){
            for (int i = l; i <=bottom ; i++) {
                System.out.print(a[i][t]+" ");

            }
            t++;
            System.out.println();
            for (int i = t; i <=bottom ; i++) {
                System.out.print(a[right][i]+" ");

            }
            right--;
            System.out.println();
            for (int i = right; i >=l ; i--) {
                System.out.print(a[i][bottom]+ " ");

            }
            bottom--;
            System.out.println();
            for (int i = bottom;i>=t;i--){
                System.out.print(a[l][i]+" ");
            }
            l++;
            System.out.println();
        }

    }
}
