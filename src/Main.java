public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); // 20

        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.dequeue()); // 1

        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.add(5);
        heap.add(2);
        heap.add(8);
        System.out.println(heap.removeMin()); // 2
    }
}