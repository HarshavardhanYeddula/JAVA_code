package functions;

public class swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        swapque(a, b);
        System.out.println(a + " " + b);
        a = swapque(a,b);
    }
    public static int swapque(int a, int b)
    {
        int temp = a;
        a =b ;
        b = temp;
        return a;
    }
}
