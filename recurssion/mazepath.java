package recurssion;

public class mazepath {
    public static void main(String[] args) {
        mazepath(3,3,"");

    }
    public static void mazepath(int row,int col,String process){
        if(row==1 && col == 1){
            System.out.println(process);
            return;
        }
        if(row>1){
            mazepath(row-1,col,process+"V");
        }
        if(col>1){
            mazepath(row,col-1,process+"H");
        }
    }
}
