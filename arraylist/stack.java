package arraylist;

public class stack {

    public int[] data;

    public int DEFAULT_SIZE = 10;

    public int top = -1;

    public stack() {
        this.data = new int[DEFAULT_SIZE];

    }

    public boolean isFull() {

        return top == data.length - 1;
    }


    public boolean push(int element) {

        if (isFull()) {
            return false;
        }

        data[++top] = element;
        return true;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int pop() throws Exception {

        if (isEmpty()) {


            throw new myexception("Khaali he be");
        }

        return data[top--];
    }

    public int peek() {
        return data[top];
    }
}

