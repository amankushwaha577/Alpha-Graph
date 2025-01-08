import java.util.*;
// Adjacency List - ArrayList Of ArrayLists
public class _1_UndirectedGraph {
    // Class to represent an edge in the graph
    static class Edge {
        int src;  // Source vertex
        int dest; // Destination vertex

        // Constructor to initialize source and destination
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    /**
     * Function to create the undirected graph
     * Initializes the adjacency list for each vertex and adds edges.
     *
     * @param graph Array of ArrayLists to represent the adjacency list
     */
    public static void createGraph(ArrayList<Edge>[] graph) {
        // Initialize adjacency lists for each vertex
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>(); // Create a new list for each vertex
        }

        // If you have 5 vertices (vertices = 5), the graph array will look like this initially:
        // graph[0] = null;  // we can't apply add() on null => Throw Error
        // graph[1] = null;
        // graph[2] = null;
        // graph[3] = null;
        // graph[4] = null;

        // After the loop runs, each element of the array will point to an empty ArrayList:
        // graph[0] = new ArrayList<>();  // An empty list for vertex 0   // now we can apply add() on graph[0]
        // graph[1] = new ArrayList<>();  // An empty list for vertex 1
        // graph[2] = new ArrayList<>();  // An empty list for vertex 2
        // graph[3] = new ArrayList<>();  // An empty list for vertex 3
        // graph[4] = new ArrayList<>();  // An empty list for vertex 4

        // Add edges to the graph (for undirected edges, we add reverse edges)
        graph[0].add(new Edge(0, 1)); // Edge from vertex 0 to vertex 1
        graph[1].add(new Edge(1, 0)); // Reverse edge from vertex 1 to vertex 0

        graph[0].add(new Edge(0, 2)); // Edge from vertex 0 to vertex 2
        graph[2].add(new Edge(2, 0)); // Reverse edge from vertex 2 to vertex 0

        graph[1].add(new Edge(1, 2)); // Edge from vertex 1 to vertex 2
        graph[2].add(new Edge(2, 1)); // Reverse edge from vertex 2 to vertex 1

        graph[1].add(new Edge(1, 3)); // Edge from vertex 1 to vertex 3
        graph[3].add(new Edge(3, 1)); // Reverse edge from vertex 3 to vertex 1

        graph[2].add(new Edge(2, 4)); // Edge from vertex 2 to vertex 4
        graph[4].add(new Edge(4, 2)); // Reverse edge from vertex 4 to vertex 2

        /*
            Output Graph:

            Vertex 0 -> [1] [2]
            Vertex 1 -> [0] [2] [3]
            Vertex 2 -> [0] [1] [4]
            Vertex 3 -> [1]
            Vertex 4 -> [2]

            Graph Visualization:

                 0
                / \
               1 - 2
                \  |
                 3 4
        */
    }

    /**
     * Function to print the graph
     * Displays the adjacency list of each vertex
     *
     * @param graph Array of ArrayLists representing the graph
     */
    public static void printGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (Edge edge : graph[i]) {
                System.out.print("[" + edge.dest + "] "); // Print destination vertices
            }
            System.out.println(); // New line after each vertex
        }

        // Vertex 0 -> [1] [2]
        // Vertex 1 -> [0] [2] [3]
        // Vertex 2 -> [0] [1] [4]
        // Vertex 3 -> [1]
        // Vertex 4 -> [2]
    }

    public static void main(String[] args) {
        int vertices = 5; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[vertices]; // Array of adjacency lists

        // Create the graph
        createGraph(graph);

        // Print the graph
        printGraph(graph);

        System.out.print("Neighbors of vertex 2: ");
        for (int i=0; i<graph[2].size();i++) { // for (Edge edge : graph[2]) {
            Edge e = graph[2].get(i);
            System.out.print(e.dest + " "); // Print the destination of each edge from vertex 2
        }
        System.out.println(); // New line after printing neighbors
    }
}


