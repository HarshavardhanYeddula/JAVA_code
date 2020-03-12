package practice;

public class bubblybubblesort {
    public static void main(String[] args) {


        int[] a = {3, 5, 1, 7, 2};
        bubble(a);
        print(a);
    }
public static void bubble(int a[]) {
    int n = a.length;
    int temp;
    for (int i = 0; i < n; i++) {
        for (int j = i; j > 0; j--) {
            if (a[j] < a[j - 1]) {
                temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
            }
        }
    }
}
public static void print(int a[]) {
    int n = a.length;
    for (int i = 0; i < n; i++) {
        System.out.println(a[i]);
    }
}


}
