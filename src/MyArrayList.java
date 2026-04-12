public class MyArrayList<T> implements MyList<T> {
    private Object[] data;
    private int size;

    public MyArrayList() {
        data = new Object[10];
        size = 0;
    }

    private void resize() {
        Object[] newData = new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    public void add(T element) {
        if (size == data.length) resize();
        data[size++] = element;
    }

    public void add(int index, T element) {
        if (size == data.length) resize();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
        size++;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public T remove(int index) {
        T removed = (T) data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return removed;
    }

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    public void clear() {
        data = new Object[10];
        size = 0;
    }

    public boolean contains(T element) {
        return indexOf(element) != -1;
    }

    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) return i;
        }
        return -1;
    }
}