package heap;

public class Heap_client {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.add(10);
        heap.add(1);
        heap.add(2);
        heap.add(6);
        heap.display();
        System.out.println(heap.remove());
        heap.display();
        heap.heapsort();
//        heap.display();
        System.out.println(heap.rightchild(1));


    }
}
