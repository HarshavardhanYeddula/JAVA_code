package hashmap;

public class Hasmap_linked_list_client {
    public static void main(String[] args) {
        Hasmap_linked_list ll = new Hasmap_linked_list();
        ll.Addfirst("hello");
        ll.AddLast(" world");
        ll.display();
        System.out.println();
        ll.Addfirst("hello java");
        ll.AddLast(" 10");
        ll.Addfirst('A');
        ll.AddLast(20);
        ll.display();
        System.out.println();
        System.out.println(ll.Find("hello jav"));
        System.out.println();
        ll.display();
    }
}
