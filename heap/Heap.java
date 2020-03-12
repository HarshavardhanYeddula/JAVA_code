package heap;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    ArrayList<T> list = new ArrayList<>();



    public void add(T value) {
        list.add(value);
        upheap(list.size() - 1);
    }



    public void swap(int p, int index) {
        T temp = list.get(index);
        list.set(index, list.get(p));
        list.set(p, temp);
    }



    public void upheap(int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);
        if (list.get(p).compareTo(list.get(index)) > 0) {
            swap(p, index);
            upheap(p);
        }
    }



    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("empty list");
        }
        T temp = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }



    private void downheap(int index) {
        int min = index;
        int lchild = leftchild(index);
        int rchild = rightchild(index);
        if (list.size() > lchild && list.get(lchild).compareTo(list.get(min)) < 0) {
            min = lchild;
        }
        if (list.size() > rchild && list.get(rchild).compareTo(list.get(min)) < 0) {
            min = rchild;
        }
        if (min != index) {
            swap(min, index);
            downheap(min);
        }
    }


    public void heapsort() throws Exception {
        ArrayList<T> n = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            n.add(this.remove());
        }
        System.out.println(n);
    }



    public void display() {
        System.out.println(list);
    }







    public int parent(int index) {
        return (index - 1) / 2;
    }



    public int leftchild(int index) {
        return (2 * index) + 1;
    }



    public int rightchild(int index) {

        return (2 * index) + 2;
    }
}



