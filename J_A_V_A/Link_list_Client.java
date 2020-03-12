package J_A_V_A;

public class Link_list_Client {
    public static void main(String[] args)throws Exception {
        Link_list l = new Link_list();
        l.Addfirst(30);
        l.Addfirst(20);l.Addfirst(10);
        l.AddLast(40);
        l.AddLast(50);
        l.AddLast(60);
        l.display();
        l.Add_Node_at(2,35);
        System.out.println();
        l.display();
        System.out.println();
    }
}
