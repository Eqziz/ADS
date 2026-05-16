//exaples of usage
public class Main {
    public static void main(String[] args) {
        // Create a Directed Graph
        WeightedGraph<String> graph = new WeightedGraph<>(true);

        // Add edges (Weights matter for Dijkstra, but not BFS)
        graph.addEdge("Almaty", "Astana", 2.1);
        graph.addEdge("Almaty", "Shymkent", 2.5);
        graph.addEdge("Shymkent", "Astana", 3.9);
        graph.addEdge("Astana", "Kostanay", 3.5);
        graph.addEdge("Shymkent", "Kyzylorda", 5.4);

        Vertex<String> start = graph.getVertex("Almaty");
        Vertex<String> dest1 = graph.getVertex("Astana");
        Vertex<String> dest2 = graph.getVertex("Kyzylorda");

        System.out.println("--- Breadth-First Search (Hops) ---");
        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>(graph, start);
        System.out.println("Path to Astana: " + bfs.pathTo(dest1));
        System.out.println("Path to Kyzylorda: " + bfs.pathTo(dest2));

        System.out.println("\n--- Dijkstra's Algorithm (Weighted) ---");
        DijkstraSearch<String> dijkstra = new DijkstraSearch<>(graph, start);
        System.out.println("Path to Astana: " + dijkstra.pathTo(dest1) + 
                           " (Distance: " + dijkstra.distanceTo(dest1) + ")");
        System.out.println("Path to Kyzylorda: " + dijkstra.pathTo(dest2) + 
                           " (Distance: " + dijkstra.distanceTo(dest2) + ")");
    }
}
