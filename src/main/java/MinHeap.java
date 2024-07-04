import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    private List<Integer> heap;

    public MinHeap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;

        while (current > 0 && heap.get(current) < heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void sinkDown(int idx) {


        int minIdx = idx;
        while (true) {
            int lIdx = leftChild(idx);
            int rIdx = rightChild(idx);



            if (idx < heap.size() && lIdx < heap.size() && rIdx < heap.size() ) {


                if (heap.get(idx) >= heap.get(lIdx) || heap.get(idx) >= heap.get(rIdx)) {
                    if (heap.get(lIdx) < heap.get(rIdx)) {

                        idx = lIdx;
                    } else {
                        swap(idx, rIdx);
                        idx = rIdx;
                    }
                }
            }


            if (idx != minIdx) {
                minIdx = idx;
            } else {
                return;
            }

        }

    }


    public Integer remove() {
        if (heap.size() == 0) {
            return null;
        }

        if (heap.size() == 1) {
            return heap.remove(0);
        }

        int minValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);

        return minValue;
    }

    public static void main(String[] args) {

        MinHeap minHeap = new MinHeap();
        minHeap.insert(1);
        minHeap.insert(2);
        minHeap.insert(3);

        minHeap.remove();


        System.out.println(minHeap);
    }

    @Override
    public String toString() {
        return "MinHeap{" +
                "heap=" + heap +
                '}';
    }
}