import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
    // BFS
    public void bfs(int startId) {
        if (!vertices.containsKey(startId)) return;

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(startId);
        queue.add(startId);

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            int currentId = queue.poll();
            System.out.print(currentId + " ");

            for (Edge edge : adjList.get(currentId)) {
                int neighbor = edge.getDestination().getId();
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    //  DFS
    public void dfs(int startId) {
        if (!vertices.containsKey(startId)) return;

        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(startId);

        System.out.print("DFS Traversal: ");
        while (!stack.isEmpty()) {
            int currentId = stack.pop();

            if (!visited.contains(currentId)) {
                System.out.print(currentId + " ");
                visited.add(currentId);
                x
                List<Edge> neighbors = adjList.get(currentId);
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    int neighbor = neighbors.get(i).getDestination().getId();
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        System.out.println();
    }
}