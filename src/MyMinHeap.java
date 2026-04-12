public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap = new MyArrayList<>();

    public void add(T element) {
        heap.add(element);
        heapifyUp();
    }

    private void heapifyUp() {
        int i = heap.size() - 1;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap.get(i).compareTo(heap.get(parent)) >= 0)
                break;
            swap(i, parent);
            i = parent;
        }
    }

    public T removeMin() {
        T min = heap.get(0);
        heap.remove(0);
        heapifyDown();
        return min;
    }

    private void heapifyDown() {
        int i = 0;
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;

            if (left < heap.size() &&
                    heap.get(left).compareTo(heap.get(smallest)) < 0)
                smallest = left;

            if (right < heap.size() &&
                    heap.get(right).compareTo(heap.get(smallest)) < 0)
                smallest = right;

            if (smallest == i) break;

            swap(i, smallest);
            i = smallest;
        }
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.remove(i);
        heap.add(i, heap.get(j));
        heap.remove(j);
        heap.add(j, temp);
    }
}