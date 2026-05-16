import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<V> extends Search<V> {

    public BreadthFirstSearch(WeightedGraph<V> graph, Vertex<V> source) {
        super(source);
        bfs(source);
    }

    private void bfs(Vertex<V> current) {
        Queue<Vertex<V>> queue = new LinkedList<>();
        marked.add(current);
        queue.add(current);

        while (!queue.isEmpty()) {
            Vertex<V> v = queue.poll();

            for (Vertex<V> neighbor : v.getAdjacentVertices().keySet()) {
                if (!marked.contains(neighbor)) {
                    edgeTo.put(neighbor, v);
                    marked.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}
