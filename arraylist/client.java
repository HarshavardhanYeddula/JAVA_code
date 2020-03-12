package arraylist;

public class client {
    public static void main(String[] args) {
        array_list list = new array_list();
//        list.add(1);
//        list.add(2);
//        list.add(10);
//        list.add(20);
        for (int i = 1; i <=3*10 ; i++) {
            list.add(i);
        }
        for (int i = 1; i <=10 ; i++) {
            System.out.println(list.remove());
        }
//        System.out.println(list.remove());
//        System.out.println(list.remove());
//        System.out.println(list.remove());
//        System.out.println(list.remove());

    }
}
