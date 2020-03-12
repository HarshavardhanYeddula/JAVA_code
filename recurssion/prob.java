package recurssion;

public class prob {
    public static void main(String[] args) {
        premutation("", "abcde");
    }

    public static void premutation(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i);
            premutation(first + ch + second, unprocessed);

        }

    }
}
