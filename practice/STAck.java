package practice;

public class STAck {
    public int data[];
    public  int default_size=10;
    public int top= -1;
    public STAck(){
        this.data=new int[default_size];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean IsFull(){
//        return top == this.length - 1;
        return top == data.length - 1;
    }
    public boolean push(int element) {
        if (IsFull()){
//            throw new Exception("Stack is full");
            return false;
        }
        data[++top]=element;
        return true;
    }
    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Empty stack");
        }
        return data[top--];
    }

    public int peek(){
        return data[top];
    }

    public void display(){
        for (int i = data.length-1; i >=0 ; i--) {
            System.out.print(data[i]+"->");
        }
    }
    public static void main(String[] args) throws Exception {
        STAck s = new STAck();
        System.out.println(s.isEmpty());
        System.out.println(s.IsFull());
        System.out.print(s.push(1));
        System.out.print( s.push(2));
        System.out.print(s.push(3));
        System.out.print( s.push(4));
        System.out.print(s.push(5));
        System.out.print(s.push(6));
        System.out.print(s.push(7));
        System.out.print(s.push(8));
        System.out.println(s.push(9));
        System.out.println(s.push(10));
        System.out.println("display fun");
        s.display();
        System.out.println("peek fun");
        System.out.println(s.peek());
        System.out.println("pop fun");
        System.out.println( s.pop());
        System.out.println( s.pop());
        System.out.println( s.pop());
        System.out.println( s.pop());
        System.out.println( s.pop());
        System.out.println( s.pop());
        System.out.println( s.pop());
        System.out.println( s.pop());
        System.out.println( s.pop());

    }
}
