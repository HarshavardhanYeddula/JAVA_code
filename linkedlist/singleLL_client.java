package linkedlist;

public class singleLL_client {
    public static void main(String[] args) {

        singleLL list = new singleLL();
        singleLL list1 = new singleLL();
        singleLL list2 = new singleLL();
        list1.insertfirst(2);
        list1.insertfirst(3);
        list1.insertlast(4);
        list1.display();
        list2.insertlast(5);
        list2.insertlast(7);
        list2.insertlast(6);
        list2.display();
        list =list.merge(list1,list2);
        list.display();
        list=list.mergesort(list);
        list.display();

////        list.reverse();
////        list.display();
//        System.out.println(list.mid().value);
////        System.out.println(list.mid());
////        System.out.println(list.mergesort(list));
////        list.duplicate();
////        list.display();
    }
}
