package recurssion;

public class permutation {
    public static void main(String[] args) {
        perm("", "abc");

    }

    public static void perm(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
////        perm(processed + (int) (ch), unprocessed);
//        perm(processed + ch, unprocessed);
//        perm(processed, unprocessed);
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i);
            perm(first + ch + second, unprocessed);

        }

    }
}




