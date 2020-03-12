package hashmap;

import J_A_V_A.Link_list;

public class Hasmap_linked_list<T> {
    public class Node {
        T data;
        Node next;
    }
    private T temp;
    private Node head;
    private Node tail;
    private int size;


    public void display(){
        Node temp  = this.head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("end");
    }

    public void Addfirst(T item){
        Node nn= new Node();
        nn.data=item;
        nn.next=null;

        if(this.size>=1){
            nn.next=head;

        }

        if (this.size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else{
            this.head=nn;
            this.size++;
        }
    }



    public void AddLast(T item){
        Node nn= new Node();
        nn.data=item;
        nn.next=null;

        if(this.size>=1){
            this.tail.next=nn;

        }
        if (this.size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else{
            this.tail=nn;
            this.size++;
        }
    }


    public T GetFirst() throws Exception{
        if (this.size==0){
            throw new Exception("LL is empty");
        }
        return this.head.data;
    }


    public T Getlast() throws Exception{
        if (this.size==0){
            throw new Exception("LL is empty");
        }
        return this.tail.data;
    }

    public T GetAt(int index) throws Exception{
        if (this.size==0){
            throw new Exception("LL is empty");
        }
        if(this.size<0 || index>=this.size){
            throw new Exception("Invalid index");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp.data;
    }

    private Node GetNodeAt(int index) throws Exception{
        if (this.size==0){
            throw new Exception("LL is empty");
        }
        if(this.size<0 || index>=this.size){
            throw new Exception("Invalid index");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }



    public void Add_Node_at(int index,T item) throws Exception{
        if (this.size<0  ||index>=this.size){
            throw new Exception("invalid index");
        }
        if(index==0){
            Addfirst(item);
        }
        if (index==this.size){
            AddLast(item);
        }
        else{
            Node nn= new Node();
            nn.data=item;
            nn.next=null;


            Node nm1=GetNodeAt(index);
            Node np1=nm1.next;
            nm1.next=nn;
            nn.next=np1;


            this.size++;
        }
    }


    public T Remove_first() throws Exception{
        if(this.size==0){
            throw new Exception("Empty linked list");
        }
        T rv = this.head.data;
        if(this.size==1){
            this.head=null;
            this.tail=null;
            this.size=0;
        }
        else{
            this.head=this.head.next;
            this.size--;
        }
        return rv;
    }



    public T Remove_last()throws Exception{
        if(this.size==0){
            throw new Exception("Empty linked list");
        }
        T rv = this.tail.data;
        if(this.size==1){
            this.head=null;
            this.tail=null;
            this.size=0;
        }
        else{
           Node nm1 = GetNodeAt(this.size-2);
            this.tail=nm1;
            this.tail.next=null;
            this.size--;
        }
        return rv;
    }


    public T Remove_At(int index)throws Exception {
        if (this.size == 0) {
            throw new Exception("Empty linked list");
        }
        if (index==0 || index>=this.size){
            throw new Exception("Invalid index");
        }
        if (index==0){
            return Remove_first();
        }
        if (index==this.size-1){
            return Remove_last();
        }
        else{
            Node np1= GetNodeAt(index-1);
            Node n1= GetNodeAt(index);
            Node nn1= GetNodeAt(index+1);
            np1.next=nn1;
            this.size--;
            return n1.data;
        }

    }

    public int Find(T data){
        int index=0;
       for (Node temp = this.head;temp!=null;temp=temp.next){
           if(temp.data.equals(data)){
               return index;
           }
           index++;
       }
       return -1;
    }
}
