import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BST<K extends Comparable<K>, V> implements Iterable<BST<K, V>.KVPair> {

    private Node root;
    private int size = 0;

    private class Node {
        private K key;
        private V val;
        private Node left, right;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    public class KVPair {
        private K key;
        private V val;

        public KVPair(K key, V val) {}

    public void put(K key, V val) {}

    private Node put(Node node, K key, V val) {}

    public V get(K key) {}

    public void delete(K key) {}

    private Node delete(Node node, K key) {}

    private Node min(Node node) {}

    private Node deleteMin(Node node) {}

    public int size() {}

    @Override
    public Iterator<KVPair> iterator() {}

    private void inOrder(Node node, List<KVPair> elements) {}
}
