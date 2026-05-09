import java.util.Random;

public class Experiment {

    public void runMultipleTests() {
        int[] sizes = {10, 30, 100}; // Размеры из задания [cite: 75]

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


}