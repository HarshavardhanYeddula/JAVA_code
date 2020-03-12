package functions;



public class armstrong {

    public static void main(String[] args) {
        int n = 371;
        int arm = armstrong(n);
        System.out.println(arm);
    }

    public static int armstrong(int n) {
        int arm = 0;
        int count = 1;


        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            arm = (int) (arm + Math.pow(rem, count));
            if (n == arm) {
                System.out.println(arm + " it is a armstrong number");
            } else {
                System.out.println(arm + " it is not a armstrong number");
            }
        }
        return arm;
    }
}


