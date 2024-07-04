import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    @Override
    public String toString() {
        return "Heap{" +
                "heap=" + heap +
                '}';
    }

    public Heap() {
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

    public int size(){
        return heap.size();
    }


    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        heap.add(value);


        int childIdx = heap.size() - 1;
        int parent = heap.get(parent(childIdx));
        while (childIdx != 0 && value > parent) {
            int parentIdx = parent(childIdx);

            swap(parentIdx, childIdx);

            childIdx = parentIdx;
            parent = heap.get(parent(childIdx));
        }


    }

    public Integer remove() {
        if (heap.isEmpty()) return null;
        if (heap.size() == 1) return heap.remove(0);
        if (heap.size() == 2) return heap.remove(1);

        int removedItem = heap.get(0);
        Integer newHead = heap.get(heap.size() - 1);
        heap.set(0, newHead);
        heap.remove(heap.size() - 1);

        int newIdx = 0;
        if(heap.size()==2){
            if(heap.get(0)<heap.get(1)){
                swap(0,1);
            }
            return removedItem;
        }
        int lChild = heap.get(leftChild(newIdx));
        int rChild = heap.get(rightChild(newIdx));

        while (newIdx != heap.size() - 1 && (newHead < lChild && newHead < rChild)) {

            swap(newIdx, leftChild(newIdx));

            newIdx = heap.get(parent(lChild));
            int idx = leftChild(newIdx);
            int idx1 = rightChild(newIdx);
            if (idx1 > heap.size() - 1 || idx1 > heap.size() - 1) {
                break;
            }
            lChild = heap.get(leftChild(newIdx));
            rChild = heap.get(rightChild(newIdx));

            //  int size = heap.size();
            System.out.println();
        }


        return removedItem;

    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(5);
        heap.insert(4);
        heap.insert(3);
        heap.insert(2);
        heap.insert(1);

        heap.remove();
        heap.remove();
        heap.remove();


        System.out.println(heap);
    }

}






