package queues;

public class DYnamic_Queue extends quueUsingArrays{
    public DYnamic_Queue() throws Exception{
        this(DEFAULT_CAPACITY);
    }
    public DYnamic_Queue(int Capacity) throws Exception{
        super(Capacity);
    }
    public void enqueue(int value)throws Exception{
        if(this.size()==this.data.length){
            int[] arr=new int[2*this.data.length];
            for(int i=0;i<this.size;i++){
                arr[i]=this.data[(this.front+i)%this.data.length];
            }
            this.data=arr;
            this.front=0;
        }
        super.enqueue(value);
    }
}
