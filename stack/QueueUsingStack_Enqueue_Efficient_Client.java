package stack;

public class QueueUsingStack_Enqueue_Efficient_Client {
    public static void main(String[] args) throws Exception {
        QueueUsingStack_Enqueue_Efficient q = new QueueUsingStack_Enqueue_Efficient();
        for (int i = 1; i <= 5; i++) {
            q.enqueue(i * 10);

        }
        q.display();
        System.out.println(q.dequeue());
        q.display();
        System.out.println(q.front());
        System.out.println(q.dequeue());
        q.display();
    }

    }






