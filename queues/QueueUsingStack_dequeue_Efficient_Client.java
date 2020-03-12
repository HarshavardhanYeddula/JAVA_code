package queues;

import stack.QueueUsingStack_Enqueue_Efficient;

import java.sql.SQLOutput;

public class QueueUsingStack_dequeue_Efficient_Client {
    public static void main(String[] args) throws Exception {

  QueueUsingStack_dequeuee_Efficient Q= new QueueUsingStack_dequeuee_Efficient();
        for (int i = 1; i <=5 ; i++) {
            Q.enqueue(i*10);
        }
        Q.display();
        System.out.println(Q.dequeue());
        Q.display();
        System.out.println(Q.front());
        System.out.println(Q.front());
    }
}
