//package queues;
//
//import stack.myexception;
//
//public class basicprogram {
//    private int data[];
//    private int DEFAULT_SIZE = 10;
//    private int end = 0;
//
//    public basicprogram() {
//        this.data = new int[DEFAULT_SIZE];
//    }
//
//    public boolean isFull() {
//        return end == data.length;
//    }
//
//    public boolean enqueue(int value) {
//        if (isFull()) {
//            return false;
//
//        }
//        data[end++] = value;
//        return true;
//    }
//
//    public boolean isEmpty() {
//
//        return end == 0;
//    }
//
//    public int dequeue() throws Exception {
//        if (isEmpty()) {
//            throw new myexception("stack empty");
//            int temp = data[0];
//            for (int i = 1; i < end; i++) {
//                data[i - 1] = data[i];
//            }
//            end--;
//            return temp;
//
//        }
//    }
//}
//
//
