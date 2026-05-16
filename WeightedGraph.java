import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WeightedGraph<V> {
    private final boolean directed;
    private final Map<V, Vertex<V>> map;

    public WeightedGraph() {
        this(false);
    }

    public WeightedGraph(boolean directed) {
        this.directed = directed;
        this.map = new HashMap<>();
    }

    public void addVertex(V data) {
        map.putIfAbsent(data, new Vertex<>(data));
    }

    public void addEdge(V source, V dest, double weight) {
        addVertex(source);
        addVertex(dest);

        Vertex<V> sourceVertex = map.get(source);
        Vertex<V> destVertex = map.get(dest);

        sourceVertex.addAdjacentVertex(destVertex, weight);
        
        if (!directed) {
            destVertex.addAdjacentVertex(sourceVertex, weight);
        }
    }

    public Vertex<V> getVertex(V data) {
        return map.get(data);
    }

    public Collection<Vertex<V>> getVertices() {
        return map.values();
    }
}
