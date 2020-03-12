public class linearsearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,4};
        int ele = 6;
        System.out.println(sort(a,0,ele));
    }
    public static boolean sort(int a[],int index,int ele){
        if(index == a.length-1){
            return false;

        }
        if (a[index]==ele){
            return true;
        }
        return sort(a,index+1,ele);
    }
}

