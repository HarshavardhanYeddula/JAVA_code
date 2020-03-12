package practice;

public class LInkList {
    private class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    private int temp;
    public void display(){
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }

    }


    public void addlast(int item){
        Node no = new Node();
        no.data=item;
        no.next=null;
        if(this.size>=1){
            this.tail.next=no;
        }
        if(this.size==0){
            this.head=no;
            this.tail=no;
            this.size++;
        }
        else{
            this.tail=no;
            this.size++;
        }
    }


    public void addfirst(int item ){
        Node no = new Node();
        no.data=item;
        no.next=null;
        if(this.size>=1){
            no.next=head;


        }
        if (this.size==0){
            this.head=no;
            this.tail=no;
            this.size++;


        }
        else{
            this.head=no;
            this.size++;
        }

    }
}
