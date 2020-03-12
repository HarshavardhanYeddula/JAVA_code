package Genrics;

public class Genrics_linked_list<T> {
    private class Node {
        T data;
        Node next;

    }

    private Node head;
    private Node tail;
    private int temp;
    private int size;


    //complexity of display o(n)
    public void display() {

        Node temp = this.head;

        while (temp != null) {
            System.out.println(temp.data + "-->");
            temp = temp.next;
        }
    }


    public void addlast(T item) {
//        create a new node
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        //attach

        if (this.size >= 1) {
            this.tail.next = nn;

        }
        //summary object
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.tail = nn;
            this.size++;
        }
    }


    public void addfirst(T item) {
        Node newnd = new Node();
        newnd.data = item;
        newnd.next = null;


        if (this.size >= 1) {
            newnd.next = head;
        }
        if (this.size == 0) {
            this.head = newnd;
            this.tail = newnd;
            this.size++;
        } else {
            this.head = newnd;
            this.size++;
        }

    }


//   complexity of getfirstO(1)


    public T getfirst() throws Exception {
        if (this.size == 0) {
            throw new Exception(" ll is empty");
        }
        return this.head.data;

    }


//complexity of getlast O(1)


    public T getlast() throws Exception {
        if (this.size == 0) {
            throw new Exception("LL is empty");
        }
        return this.tail.data;
    }


    public T getat(int index) throws Exception {
        if (this.size == 0) {
            throw new Exception("LL is empty");

        }
        if (index < 0 || index >= this.size) {
            throw new Exception("invalid index");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        return temp.data;

    }


    private Node getNodeAt(int index) throws Exception {
        if (this.size == 0) {
            throw new Exception("LL is empty");

        }
        if (index < 0 || index >= this.size) {
            throw new Exception("invalid index");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        return temp;
    }


    public void addAt(T item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("invalid index");
        }
        if (index == 0) {
            addfirst(item);
        } else if (index == this.size) {
            addlast(item);
        } else {
            // create a new node
            Node nn = new Node();
            nn.data = item;
            nn.next = null;
            // attach

            Node nm1 = getNodeAt(index);
            Node np1 = nm1.next;
            nm1.next = nn;
            nn.next = np1;


            //summary update

            this.size++;


        }


    }


    public T removeFirst() throws Exception {
        if (this.size == 0) {
            throw new Exception("this is a empty LL");
        }
        T rv = this.head.data;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;

        } else {
            this.head = this.head.next;
            this.size--;
        }
        return rv;
    }


    public T removeLast() throws Exception {
        if (this.size == 0) {
            throw new Exception("this is empty");
        }
        T last = this.tail.data;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else {
            Node nm1 = getNodeAt(this.size - 2);
            this.tail = nm1;
            this.tail.next = null;
            this.size--;

        }
        return last;
    }


//    public T removeAt(int index) throws Exception {
//        if (index == 0) {
//            throw new Exception("LL is empty");
//        }
//        if (index < 0 || index >= this.size) {
//            throw new Exception("invalid index");
//        }
//
//        if (index == 0)
//        {
//            return removeFirst();
//        }
//        else if (index == this.size - 1) {
//            return removeLast();
//        }
//        else {
//            Node nm1 = getNodeAt(index - 1);
//            Node n = getNodeAt(index);
//            Node np1 = getNodeAt(index + 1);
//            nm1.next = np1;
//            this.size--;
//            return n.data;
//        }
//    }
//
//
//
//
//    public void Reverse() throws Exception{
//        int left=0;
//        int right = this.size-1;
//        while(left<right){
//            Node ln = getNodeAt(left);
//            Node rt = getNodeAt(right);
//
//            int temp=ln.data;
//            ln.data=rt.data;
//            rt.data=temp;
//
//            left++;
//            right--;
//        }
//    }
//
//
//
//
//
//    public void ReversePointerd(){
//        Node prev=this.head;
//        Node curr =prev.next;
//        while (curr!=null){
//            Node ahead=curr.next;
//                curr.next=prev;
//            prev=curr;
//            curr=ahead;
//        }
//        Node t = this.head;
//        this.head=this.tail;
//        this.tail=t;
//
//        this.tail.next=null;
//    }

}


