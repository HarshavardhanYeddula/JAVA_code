package linkedlist;

public class ll_client {
    public static void main(String[] args) throws Exception {
        ll list = new ll();
        list.addlast(10);
        list.addlast(12);

        list.addlast(13);
        list.addfirst(9);


        list.display();
        System.out.println();
        System.out.println(list.getfirst());
        System.out.println(list.getlast());
        System.out.println(list.getat(2));
//        System.out.println(list.getat(4));
        list.addAt(11,1);

        list.display();
//        System.out.println();
//        System.out.println("first element:"+list.removeFirst());
//        System.out.println("last element:"+list.removeLast());
        System.out.println();
        System.out.println(list.removeAt(2));
        list.Reverse();
        list.display();
        System.out.println();
        list.ReversePointerd();
        list.display();
//        System.out.println(list.get);
    }
}
