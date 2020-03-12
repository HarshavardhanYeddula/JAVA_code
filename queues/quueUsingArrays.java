package queues;

public class quueUsingArrays {

    protected int[] data;
    protected int size;
    protected int front;


    public static final int DEFAULT_CAPACITY = 10;

    public quueUsingArrays() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public quueUsingArrays(int capacity) throws Exception {
        if (capacity < 1) {
            throw new Exception("queue can not be formed");
        } else {
            this.data = new int[capacity];
            this.front = 0;
            this.size = 0;

        }
    }
        public int size () {
            return this.size;

        }
        public boolean IsEmpty () {
            return this.size() == 0;
        }

        public void enqueue ( int value) throws Exception {
            if (this.size == this.data.length) {
                throw new Exception("queue is full");

            } else {
                int ai = (this.front + this.size) % this.data.length;
                this.data[ai] = value;
                this.size++;
            }
        }


        public int dequeue ()throws Exception {
            if (this.size() == 0) {
                throw new Exception("queue is empty");
            } else {
                int rr = this.data[this.front];
                this.data[this.front] = 0;
                this.front = (this.front + 1) % this.data.length;
                this.size--;
                return rr;
            }
        }


        public int front () throws Exception {
            if (this.size() == 0) {
                throw new Exception("queue is Empty");
            } else {
                int rr = this.data[this.front];
                return rr;
            }
        }

        public void Display() {
            for (int i = 0; i <this.data.length ; i++) {
                int ai = (this.front+i)%this.data.length;
                System.out.print(this.data[ai]+" => ");
            }
            System.out.print("end");
        }
    }


