package PRACTICE_MAKES_MAN_PERFECT;

public class Linked_list {
    private class Node {
        int data;
        Node next;

    }


    private int size;
    private int temp;
    private Node head;
    private Node tail;



    public void Display(){
        Node temp=this.head;
        for (int i = 0; i <this.size ; i++) {
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.print("End");
    }


    public void Addfirst(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;
        if (this.size >= 1) {
            nn.next = head;
        }
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.head = nn;
            this.size++;

        }
    }


    public void Addlast(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;
        if (this.size >= 0) {
            this.tail.next = nn;
        }
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.tail = nn;
            this.size++;
        }
    }


    public int Getfirst() throws Exception {
        if (this.size == 0) {
            throw new Exception("LL is Empty");

        }
        return this.head.data;
    }

    public int GetLast() throws Exception {
        if (this.size == 0) {
            throw new Exception("LL is Empty");

        }
        return this.tail.data;
    }

    public int Get_Node_at_index(int index) throws Exception {
        if (index < 0 || index > this.size) {
            throw new Exception("Invalid index");

        }
        if (this.size == 0) {
            throw new Exception("Linked list is Empty");

        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }


    private Node Get_Node_at(int index) throws Exception {

        if (this.size == 0) {
            throw new Exception("Linked list is Empty");

        }
        if (index < 0 || index > this.size) {
            throw new Exception("Invalid index");

        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public void AddnodeAt(int item, int index) throws Exception {
        if (index == 0) {
            Addfirst(item);
        }
        if (index == this.size - 1) {
            Addlast(item);
        }
        if (index < 0 || index > this.size) {
            throw new Exception("Invalid index");
        }
        Node nn = new Node();
        nn.data = item;
        nn.next = null;
        Node nm1 = Get_Node_at(index);
        Node np1 = nm1.next;
        nm1.next = nn;
        nn.next = np1;
        this.size++;
    }


    public int RemoveFirst() throws Exception {
        if (this.size == 0) {
            throw new Exception("Empty LL");
        }
        int fst = this.head.data;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size--;
        } else {
            this.head = this.head.next;
            this.size--;
        }
        return fst;
    }



    public int RemoveLast() throws Exception {
        if (this.size == 0) {
            throw new Exception("Empty LL");
        }
        int lst = this.tail.data;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size--;
        } else {
            Node nm1 = Get_Node_at(this.size - 2);
            this.tail = nm1;
            this.tail = null;
            this.size--;
        }
        return lst;


    }


}