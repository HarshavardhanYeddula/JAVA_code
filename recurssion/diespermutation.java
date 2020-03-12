package recurssion;

public class diespermutation {
    public static void main(String[] args) {
        permu("", 4);
    }

    public static void permu(String processed, int target) {
        if (target == 0) {
            System.out.println(processed);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            permu(processed + i, target - i);
        }
    }
}

