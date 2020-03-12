package PRACTICE_MAKES_MAN_PERFECT;

import java.util.Scanner;

public class Queue_basic {

        public int[] data;
        public int size;
        public int front;

        public static final int cap=10;

        public Queue_basic() throws Exception{
            this(cap);
        }

        public Queue_basic(int cap) throws Exception{
            if(cap<1){
                throw new Exception("Queue will not be formed");
            }
            this.data=new int[cap];
            this.size=0;
            this.front=0;

        }


        public boolean IsEmpty(){
            return this.size()==0;
        }



         public boolean IsFull(){
        return this.size()== this.data.length;
        }


        public int size(){
//            this.size=this.data.length-1;
            return this.size;
        }


        public void Enqueue(int item) throws Exception{
            if (IsFull()){
                throw new Exception("Queue is full");

            }
            int fst=(this.front+this.size)%this.data.length;
            this.data[fst]=item;
            this.size++;


        }

        public int Dequeue() throws Exception{
            if(IsEmpty()){
                throw new Exception("Queue is Empty dude");
            }
            int rr = this.data[this.front];
            this.data[this.front]=0;
            this.front=(this.front+1)%this.data.length;
            this.size--;
            return rr;

    }

    public int Front() throws Exception{
        if(IsEmpty()){
            throw new Exception("Queue is Empty dude");
        }
        int rr=this.data[this.front];
        return rr;
    }



    public void Display() throws Exception{
            if(IsEmpty()){
            throw new Exception("Queue is Empty dude");
        }
        for (int i = 0; i <this.data.length ; i++) {
            System.out.print(this.data[i]+"->");
        }
        System.out.print("End");
    }



    public static void main(String[] args) throws Exception {
////        Scanner s1= new Scanner(System.in);
        PRACTICE_MAKES_MAN_PERFECT.Queue_basic q= new PRACTICE_MAKES_MAN_PERFECT.Queue_basic(5);
        System.out.println(q.IsEmpty());

        q.Enqueue(10);
        q.Enqueue(9);
        q.Enqueue(8);
        q.Enqueue(7);
        q.Enqueue(6);
        q.Display();
        System.out.println(q.Front());
        System.out.println( q.IsFull());
        System.out.println(q.size());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        System.out.println(q.Front());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
//        System.out.println(q.Dequeue());
    }

}
