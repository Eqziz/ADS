import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DijkstraSearch<V> extends Search<V> {
    private final Map<Vertex<V>, Double> distTo;

    public DijkstraSearch(WeightedGraph<V> graph, Vertex<V> source) {
        super(source);
        distTo = new HashMap<>();

        for (Vertex<V> vertex : graph.getVertices()) {
            distTo.put(vertex, Double.POSITIVE_INFINITY);
        }
        distTo.put(source, 0.0);

        dijkstra();
    }

    private void dijkstra() {
        // Priority Queue compares vertices based on their current shortest distance from source
        PriorityQueue<Vertex<V>> pq = new PriorityQueue<>(Comparator.comparingDouble(distTo::get));
        pq.add(source);

        while (!pq.isEmpty()) {
            Vertex<V> v = pq.poll();
            marked.add(v);

            for (Map.Entry<Vertex<V>, Double> entry : v.getAdjacentVertices().entrySet()) {
                Vertex<V> neighbor = entry.getKey();
                double weight = entry.getValue();
                
                if (!marked.contains(neighbor)) {
                    relax(v, neighbor, weight, pq);
                }
            }
        }
    }

    private void relax(Vertex<V> v, Vertex<V> neighbor, double weight, PriorityQueue<Vertex<V>> pq) {
        double newDist = distTo.get(v) + weight;
        
        if (newDist < distTo.get(neighbor)) {
            distTo.put(neighbor, newDist);
            edgeTo.put(neighbor, v);
            
            pq.remove(neighbor);
            pq.add(neighbor);
        }
    }

    public double distanceTo(Vertex<V> v) {
        return distTo.getOrDefault(v, Double.POSITIVE_INFINITY);
    }
}
