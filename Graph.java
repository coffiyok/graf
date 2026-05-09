import java.util.*;

public class Graph {

    private final Map<Integer, List<Edge>> adjList;
    private final Map<Integer, Vertex> vertices;

    public Graph() {
        this.adjList = new HashMap<>();
        this.vertices = new HashMap<>();
    }

    public void addVertex(Vertex v) {
        vertices.put(v.getId(), v);

        adjList.putIfAbsent(v.getId(), new ArrayList<>());
    }

    public void addEdge(int fromId, int toId) {
        Vertex from = vertices.get(fromId);
        Vertex to = vertices.get(toId);

        if (from != null && to != null) {
            Edge edge = new Edge(from, to);
            adjList.get(fromId).add(edge);

        }
    }

    public void printGraph() {
        for (int id : adjList.keySet()) {
            System.out.print("Vertex " + id + " is connected to: ");
            for (Edge edge : adjList.get(id)) {
                System.out.print(edge.getDestination().getId() + " ");
            }
            System.out.println();
        }
    }
}