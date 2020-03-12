package stack;

public class stackbook {
    protected int[] data;
    protected int tos;

    public stackbook() {
        this (5);
    }

    public stackbook(int capacity){
        this.data = new int[capacity];
        this.tos = -1;
    }

    public void push(int item) throws Exception {
        if (this.size() == this.data.length) {
            throw new Exception("stack is full");
        }
        this.tos++;
        this.data[this.tos] = item;

    }

    public int pop() throws Exception {
        if (this.size() == 0) {
            throw new Exception("stack is empty");
        }
        int element = this.data[this.tos];
        this.data[this.tos] = 0;
        this.tos--;
        return element;

    }
    public int peek() throws Exception{
        if (this.size()==0){
            throw new Exception("stack is empty");

        }
        int element = this.data[this.tos];
        return element;
    }
    public int size(){
        return this.tos+1;

    }
    public boolean isEmpty(){
        return this.size()==0;

    }
    public void display(){
        System.out.println("_____");
        for (int i = this.tos; i >=0 ; i--) {
            System.out.print(this.data[i]+" ");

        }
        System.out.println(".");
        System.out.println("_____");
    }
}
