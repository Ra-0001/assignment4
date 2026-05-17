public class Experiment {

    public void runTraversals(Graph g) {

        long bfsStart = System.nanoTime();

        g.bfs(0);

        long bfsEnd = System.nanoTime();

        long bfsTime = bfsEnd - bfsStart;

        long dfsStart = System.nanoTime();

        g.dfs(0);

        long dfsEnd = System.nanoTime();

        long dfsTime = dfsEnd - dfsStart;

        System.out.println("BFS Time: " + bfsTime + " ns");
        System.out.println("DFS Time: " + dfsTime + " ns");
    }

    public void runMultipleTests() {

        System.out.println("\n===== SMALL GRAPH =====");
        Graph small = createGraph(10);
        runTraversals(small);

        System.out.println("\n===== MEDIUM GRAPH =====");
        Graph medium = createGraph(30);
        runTraversals(medium);

        System.out.println("\n===== LARGE GRAPH =====");
        Graph large = createGraph(100);
        runTraversals(large);
    }

    private Graph createGraph(int size) {

        Graph g = new Graph();

        for (int i = 0; i < size; i++) {
            g.addVertex(new Vertex(i));
        }

        for (int i = 0; i < size - 1; i++) {
            g.addEdge(i, i + 1);

            if (i + 2 < size) {
                g.addEdge(i, i + 2);
            }
        }

        return g;
    }

    public void printResults() {
        System.out.println("Experiments finished.");
    }
}