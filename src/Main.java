public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();

        for (int i = 0; i < 6; i++) {

            graph.addVertex(new Vertex(i));
        }

        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 2);
        graph.addEdge(1, 3, 5);
        graph.addEdge(2, 3, 8);
        graph.addEdge(2, 4, 10);
        graph.addEdge(3, 5, 6);
        graph.addEdge(4, 5, 3);

        graph.printGraph();

        System.out.println();

        graph.bfs(0);

        graph.dfs(0);

        System.out.println();

        graph.dijkstra(0);

        Experiment experiment = new Experiment();

        experiment.runMultipleTests();

        experiment.printResults();
    }
}