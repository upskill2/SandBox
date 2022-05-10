package leetcode;

public class DesignHashMap<V, K> {

    private Entry<K, V>[] hashTable;
    private static int CAPACITY = 1000000;
    private int size = 0;

    public DesignHashMap() {
        hashTable = new Entry[CAPACITY];
    }

    class Entry<K, V> {

        int key;
        int value;
        Entry<K, V> next;

        public Entry(int k, int v) {
            this.key = k;
            this.value = v;
        }
    }

    public void put(int key, int value) {

        int userhash = key * 0xfffffff;
        int bucket = getBucketNumber(userhash);

        Entry<K, V> newEntry = new Entry(key, value);
        Entry<K, V> existingEntry = findElement(bucket, key);

        if (existingEntry.next == null) {
            existingEntry.next = newEntry;
            size++;
        } else {
            existingEntry.next.value = value;
        }
    }

    public int get(int key) {
        int userhash = key * 0xfffffff;
        int bucket = getBucketNumber(userhash);

        Entry<K, V> existingEntry = findElement(bucket, key);

        return existingEntry.next == null ? -1 : existingEntry.next.value;

    }

    public void remove(int key) {

        int userhash = key * 0xfffffff;
        int bucket = getBucketNumber(userhash);

        Entry<K, V> existingEntry = findElement(bucket, key);

        if (existingEntry.next != null) {
            existingEntry.next = existingEntry.next.next;
        }
        size--;
    }

    /* Utils   */
    private Entry<K, V> findElement(int index, int key) {
        if (hashTable[index] == null)
            return hashTable[index] = new Entry<K, V>(-1, -1);

        Entry<K, V> existingEntry = hashTable[index];

        while (existingEntry.next != null && existingEntry.next.key != key) {
            existingEntry = existingEntry.next;
        }
        return existingEntry;
    }

    public int getBucketNumber(int hashcode) {
        return hashcode & (CAPACITY-1);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {

        DesignHashMap dh = new DesignHashMap();

        dh.put(1, 1); // The map is now [[1,1]]
        dh.put(2, 2); // The map is now [[1,1], [2,2]]
        dh.get(1);    // return 1, The map is now [[1,1], [2,2]]
        dh.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        dh.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        dh.get(2);    // return 1, The map is now [[1,1], [2,1]]
        dh.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        dh.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]

    }

}
