package arraylist;

public class dynamicstack extends stack {
    @Override
    public boolean push(int element) {
        if (this.isFull()) {
            int temp[] = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;

        }
        return super.push(element);
    }

}

