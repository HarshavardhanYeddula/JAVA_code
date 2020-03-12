package queues;


import stack.Dynamic_Stack;

import stack.StackusingArray;

//import t
public class QueueUsingStack_dequeuee_Efficient extends Dynamic_Stack {
    Dynamic_Stack primary;
    Dynamic_Stack secondary;



    public QueueUsingStack_dequeuee_Efficient() throws Exception{
      this.primary =new Dynamic_Stack();
       this.secondary= new Dynamic_Stack();
    }

    public int size(){
        return this.primary.size();
    }
    public boolean isEmpty(){
        return this.primary.isEmpty();
    }

    public void enqueue(int data) throws Exception{
        while (primary.size()!=0){
            secondary.push(primary.pop());
        }
        primary.push(data);
        while (secondary.size()!=0){
           primary.push(secondary.pop());
        }

    }
    public int dequeue() throws Exception{
        return this.primary.pop();
    }
    public int front() throws Exception{
        return this.primary.top();

    }
    public void display(){
        this.primary.display();
    }

}
