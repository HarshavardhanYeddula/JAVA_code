package stack;

public class Dynamic_Stack extends StackusingArray{
    public Dynamic_Stack() throws Exception{
        this(DEFAULT_CAPACITY);
    }
    public Dynamic_Stack(int Capacity) throws Exception{
        super(Capacity);
    }

    public void push(int item) throws Exception{
        if (this.size()==this.data.length){
            int[] arr = new int[2*this.size()];
            for (int i = 0; i < this.size(); i++) {
                arr[i]=this.data[i];


            }
            this.data=arr;
        }
        super.push(item);
    }
}
