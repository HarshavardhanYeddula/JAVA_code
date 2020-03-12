import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(12);
        list.add(16);
        list.add(12);
        for (int val:list){
            System.out.println(val + " ");
        }
        System.out.println();
        System.out.println(list.contains(16));
        list.set(6,18);
        System.out.println();
        System.out.println(list.contains(16));
        list.add(7,19);
        System.out.println("new list:");

        for (int val:list){
            System.out.println(val + " ");
        }
        System.out.println();
        System.out.println(list.indexOf(16));
        System.out.println("list size");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("index of number");
        System.out.println(list.indexOf(18));
        System.out.println("deleting element");
        System.out.println(list.remove(0));

       System.out.println(list.lastIndexOf(12));
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}
