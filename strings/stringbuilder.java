package strings;

public class stringbuilder {
    public static void main(String[] args) {
        String s = "";
        StringBuilder bu = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
//            s= s+"a";
            bu.append('a');

        }
        System.out.println(bu);
    }
}
