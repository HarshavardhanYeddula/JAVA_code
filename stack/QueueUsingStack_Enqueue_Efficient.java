package stack;

public class QueueUsingStack_Enqueue_Efficient {
    private Dynamic_Stack primary;
    private Dynamic_Stack secondary;


    public QueueUsingStack_Enqueue_Efficient() throws Exception{
        this.primary=new Dynamic_Stack();
        this.secondary=new Dynamic_Stack();
    }
    public boolean isEmpty(){
        return this.primary.isEmpty();
    }
    public int size(){
        return this.primary.size();
    }
//    o()
    public int dequeue() throws Exception{
        while (primary.size()!=1){
           secondary.push(primary.pop());

        }
        int rv = primary.pop();
        while (!secondary.isEmpty()){
            primary.push(secondary.pop());

        }
        return rv;
    }


    public void enqueue(int data) throws Exception{
        this.primary.push(data);
    }
    public int front()throws Exception{
        while (primary.size()!=1){
            secondary.push(primary.pop());

        }
        int rv = primary.top();
        while (!secondary.isEmpty()){
            primary.push(secondary.pop());

        }
        return rv;

    }
    public void display()throws Exception{
        reversestack(primary,secondary,0);
        primary.display();
        reversestack(primary,secondary,0);
    }

        public static void reversestack(Dynamic_Stack Stack, Dynamic_Stack helper,int index) throws Exception{
            if(Stack.isEmpty()){
                return;
            }
            int item = Stack.pop();
            reversestack(Stack,helper,index+1);
            helper.push(item);
            if (index==0){
                while (!helper.isEmpty()){
                    Stack.push(helper.pop());
                }
            }
        }
    }




