import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var heap = new Heap();
        heap.insert(10);
        heap.insert(5);
        heap.insert(17);
        heap.insert(4);
        heap.insert(22);

        // desc order print
        while (!heap.isEmpty()) {
            System.out.println(heap.remove());
        }

        int[] numbers = {5, 3, 8, 4, 1, 2};
        MaxHeap.heapify(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(MaxHeap.getKthLargest(numbers, 2));
    }
}
