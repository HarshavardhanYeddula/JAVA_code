package recurssion;

public class string {
    public static void main(String[] args) {
        substring("","abc");

    }
    public static void substring( String  processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        substring(processed+ch,unprocessed);
        substring(processed,unprocessed);

    }
}
