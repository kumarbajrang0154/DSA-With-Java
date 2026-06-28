class MyHashMap {

    class Node {
        int key, value;
        Node next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private Node[] buckets;
    private int size = 1000; 

    public MyHashMap() {
        buckets = new Node[size];
    }

    private int hash(int key) {
        return key % size;
    }

    public void put(int key, int value) {
        int idx = hash(key);
        Node head = buckets[idx];

        if (head == null) {
            buckets[idx] = new Node(key, value);
            return;
        }

        Node curr = head;
        while (true) {
            if (curr.key == key) {
                curr.value = value; // update
                return;
            }
            if (curr.next == null) break;
            curr = curr.next;
        }

        curr.next = new Node(key, value);
    }

    public int get(int key) {
        int idx = hash(key);
        Node curr = buckets[idx];

        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }
        return -1;
    }

    public void remove(int key) {
        int idx = hash(key);
        Node curr = buckets[idx];
        Node prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    buckets[idx] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}
