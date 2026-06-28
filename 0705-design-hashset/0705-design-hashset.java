class MyHashSet {

    class Node {
        int key;
        Node next;

        Node(int key) {
            this.key = key;
        }
    }

    private Node[] buckets;
    private int size = 1000;

    public MyHashSet() {
        buckets = new Node[size];
    }

    private int hash(int key) {
        return key % size;
    }

    public void add(int key) {
        int idx = hash(key);
        Node head = buckets[idx];

        if (head == null) {
            buckets[idx] = new Node(key);
            return;
        }

        Node curr = head;
        while (true) {
            if (curr.key == key) return; // already exists
            if (curr.next == null) break;
            curr = curr.next;
        }

        curr.next = new Node(key);
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

    public boolean contains(int key) {
        int idx = hash(key);
        Node curr = buckets[idx];

        while (curr != null) {
            if (curr.key == key) return true;
            curr = curr.next;
        }
        return false;
    }
}
