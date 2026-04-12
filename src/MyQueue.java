public class MyQueue<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void enqueue(T element) {
        list.add(element);
    }

    public T dequeue() {
        return list.remove(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}