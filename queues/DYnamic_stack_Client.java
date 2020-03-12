package queues;

public class DYnamic_stack_Client {
    public static void main(String[] args) throws Exception{
        DYnamic_Queue q = new DYnamic_Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.Display();
//        q.enqueue(60);
//        q.front();
//        q.Display();
        System.out.println();
        System.out.println(q.front());
        System.out.println( q.dequeue());
        System.out.println();
        System.out.println(q.dequeue());
        q.enqueue(60);
        q.enqueue(70);
        System.out.println();
//        q.dequeue();
//        q.dequeue();
//
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(80);
        q.enqueue(90);
        q.Display();
        System.out.println();
        System.out.println(q.front());
        System.out.println(q.size());
        System.out.println(q.IsEmpty());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
        System.out.println(q.IsEmpty());

    }
}
