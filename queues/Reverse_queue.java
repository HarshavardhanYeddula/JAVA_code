package queues;

public class Reverse_queue  {
    public static void Reverse_queue(DYnamic_Queue Queue)throws Exception{
        if (Queue.IsEmpty()) {
        return;
        }
        int element=Queue.dequeue();
        Reverse_queue(Queue);
        Queue.enqueue(element);
    }
}
