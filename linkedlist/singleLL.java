package linkedlist;


public class singleLL {
    private Node head;
    private int size = 0;
    private Node tail;

    public void insertfirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    public void insertlast(int value) {
        if (size < 1) {
            insertfirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public int deleteatfirst() {
        if (size == 0) {
            System.out.println("empty linked list");
            return 0;
        }
        int temp = head.value;
        head = head.next;
        size--;
        return temp;
    }

    public int deleteatlast() {
        int temp = tail.value;
        Node temp1 = head;
        while (temp1.next != tail) {
            temp1 = temp1.next;
        }
        tail = temp1;
        tail.next = null;
        size--;
        return temp;

    }

    public Node findelementonindex(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        return temp;
    }

    public void insertbetween(int value, int index) {
        if (index == 0) {
            insertfirst(value);
        }
        if (index == size) {
            insertlast(value);
        }
        Node previous = findelementonindex(index - 1);
        Node node = new Node(value);
        node.next = previous.next;
        node.next = node;
    }

    public int deleteinbetween(int index) {
//        if(index==0){
//            deleteatfirst();
//
//        }
        if (size < 2) {
            return deleteatfirst();
        }
        if (index == size - 1) {
            return deleteatlast();
        }
        Node prev = findelementonindex(index - 1);
        int temp = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return temp;

    }

    public void reverse() {
        reverse(head);
    }

    public void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;

    }

    public void duplicate() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }
            tail = temp;
        }
    }

    public int kthfromlast(int k) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.value;

    }

    public Node mid() {
        Node slow = head;
        Node fast = head;
//        while(fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public singleLL merge(singleLL first, singleLL second) {
        singleLL list = new singleLL();
        Node f = first.head;
        Node s = second.head;
        while (f != null && s != null) {
            if (s.value > f.value) {
                list.insertlast(f.value);
                f = f.next;
            } else {
                list.insertlast(s.value);
                s = s.next;
            }
        }
            while (f != null) {
                list.insertlast(f.value);
                f = f.next;
            }
            while (s != null) {
                list.insertlast(s.value);
                s = s.next;
            }

        return list;
    }
    public singleLL mergesort(singleLL list){
        if(list.size==1){
            return list;
        }
        Node mid = list.mid();
        singleLL first = new singleLL();
        first.head=list.head;
        first.tail=mid;
        first.size=(list.size+1)/2;
        singleLL second=new singleLL();
        second.head=mid.next;
        second.tail=list.tail;
        second.size=list.size/2;
        mid.next=null;
        first = mergesort(first);
        second = mergesort(second);
        return merge(first,second);
    }

    public class Node {
        public int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }


    }
}
