package queues;

public class quueUsingArrays_Client {
    public static void main(String[] args) throws Exception{
        quueUsingArrays q = new quueUsingArrays(5);
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



//
//public class Queue_basic {
//    public int data[];
//    public int front;
//    public int size;
//
//    public static final int capacity=10;
//    public Queue_basic()throws Exception {
//        this(capacity);
//    }
//
//
//    public Queue_basic(int capacity)throws Exception{
//        if(capacity<1){
//            throw new Exception("Can't from queue");
//        }
//        else{
//            this.data=new int[capacity];
//            this.front=0;
//            this.size=0;
//        }
//    }
//    public int size(){
//        return this.size;
//    }
//
//    public boolean Isempty(){
//        return this.size()==0;
//    }
//    public boolean Isfull(){
//        return this.size()==this.data.length;
//    }
//
//    public void Enqueue(int item) throws Exception{
//        if(Isfull()){
//            throw new Exception("Queue is full");
//        }
//        int it=(this.front+this.size)%this.data.length;
//        this.data[it]=item;
//        this.size++;
//    }
//
//
//    public int Dequeue()throws Exception{
//        if (Isempty()){
//            throw new Exception("Queue is Empty");
//        }
//        int rr=this.data[this.front];
//        this.data[this.front]=0;
//        this.front=(this.front+1)%this.data.length;
//        this.size--;
//        return rr;
//
//    }
//
//
//    public int Front() throws Exception{
//        if(Isempty()){
//            throw new Exception("Queue is empty");
//        }
//        int rr=this.data[this.front];
//        return rr;
//    }
//
//
//
//    public void display() throws Exception{
//        for (int i = 0; i <this.data.length ; i++) {
//            int ai=(this.front+i)%this.data.length;
//            System.out.print(this.data[ai]+" ->");
//        }
//        System.out.println("End");
//    }
//
//
//    public static void main(String[] args) throws Exception {
////        Scanner s1= new Scanner(System.in);
//        PRACTICE_MAKES_MAN_PERFECT.Queue_basic q= new PRACTICE_MAKES_MAN_PERFECT.Queue_basic(5);
//        System.out.println(q.Isempty());
//
//        q.Enqueue(10);
//        q.Enqueue(9);
//        q.Enqueue(8);
//        q.Enqueue(7);
//        q.Enqueue(6);
//        q.display();
//        System.out.println(q.Front());
//        System.out.println( q.Isfull());
//        System.out.println(q.size());
//        System.out.println(q.Dequeue());
//        System.out.println(q.Dequeue());
//        System.out.println(q.Dequeue());
//        System.out.println(q.Dequeue());
//        System.out.println(q.Dequeue());
//        System.out.println(q.Dequeue());
//    }
//
//
//}
