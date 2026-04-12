public class MyLinkedList<T> implements MyList<T> {

    private class MyNode {
        T data;
        MyNode next;
        MyNode prev;

        MyNode(T data) {
            this.data = data;
        }
    }

    private MyNode head;
    private MyNode tail;
    private int size;

    public void add(T element) {
        MyNode node = new MyNode(element);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void add(int index, T element) {
        if (index == size) {
            add(element);
            return;
        }

        MyNode current = getNode(index);
        MyNode node = new MyNode(element);

        node.next = current;
        node.prev = current.prev;

        if (current.prev != null)
            current.prev.next = node;
        else
            head = node;

        current.prev = node;
        size++;
    }

    private MyNode getNode(int index) {
        MyNode current = head;
        for (int i = 0; i < index; i++)
            current = current.next;
        return current;
    }

    public T get(int index) {
        return getNode(index).data;
    }

    public T remove(int index) {
        MyNode node = getNode(index);

        if (node.prev != null)
            node.prev.next = node.next;
        else
            head = node.next;

        if (node.next != null)
            node.next.prev = node.prev;
        else
            tail = node.prev;

        size--;
        return node.data;
    }

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public boolean contains(T element) {
        return indexOf(element) != -1;
    }

    public int indexOf(T element) {
        MyNode current = head;
        int i = 0;

        while (current != null) {
            if (current.data.equals(element)) return i;
            current = current.next;
            i++;
        }
        return -1;
    }
}