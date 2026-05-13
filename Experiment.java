import java.util.Random;

public class Experiment {

    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};

        for (int size : sizes) {
            System.out.println("\n--- Testing Graph with " + size + " vertices ---");
            Graph g = createRandomGraph(size);

            if (size == 10) {
                g.printGraph();
            }

            runTraversals(g, 0);
        }
    }

    private Graph createRandomGraph(int numVertices) {
        Graph g = new Graph();
        Random rand = new Random();

        for (int i = 0; i < numVertices; i++) {
            g.addVertex(new Vertex(i));
        }

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < 2; j++) {
                int target = rand.nextInt(numVertices);
                if (i != target) {
                    g.addEdge(i, target);
                }
            }
        }
        return g;
    }
    public void runTraversals(Graph g, int startId) {
        // Тест BFS
        long startBFS = System.nanoTime();
        g.bfs(startId);
        long endBFS = System.nanoTime();

        // Тест DFS
        long startDFS = System.nanoTime();
        g.dfs(startId);
        long endDFS = System.nanoTime();

        System.out.println("BFS Execution Time: " + (endBFS - startBFS) + " ns");
        System.out.println("DFS Execution Time: " + (endDFS - startDFS) + " ns");
    }

}