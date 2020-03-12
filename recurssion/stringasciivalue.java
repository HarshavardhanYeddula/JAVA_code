package recurssion;

public class stringasciivalue {
    public static void main(String[] args) {
        subascii("","abc");

    }
    public static void subascii( String  processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        subascii(processed+(int)(ch),unprocessed);
        subascii(processed+ch,unprocessed);
        subascii(processed,unprocessed);

    }
}


