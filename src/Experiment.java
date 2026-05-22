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

        long dijkstraStart = System.nanoTime();

        g.dijkstra(0);

        long dijkstraEnd = System.nanoTime();

        long dijkstraTime = dijkstraEnd - dijkstraStart;

        System.out.println("BFS Time: " + bfsTime + " ns");

        System.out.println("DFS Time: " + dfsTime + " ns");

        System.out.println("Dijkstra Time: " + dijkstraTime + " ns");
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

            int weight = (i % 9) + 1;

            g.addEdge(i, i + 1, weight);

            if (i + 2 < size) {

                g.addEdge(i, i + 2, weight + 2);
            }
        }

        return g;
    }

    public void printResults() {

        System.out.println("\nAll experiments finished.");
    }
}