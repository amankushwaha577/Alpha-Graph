public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/**
 *   Graph Data Structure Overview:
 *   ---------------------------------
 *   A graph G consists of:
 *      A. Vertices (or Nodes): Represent entities or points. (e.g., V = {A, B, C, D})
 *      B. Edges: Represent relationships or connections between vertices. (e.g., E = {(A, B), (B, C)})
 *
 *   Types of Graphs:
 *   ----------------------------------
 *      1. Directed Graph (Digraph):
 *         Edges have a direction. (e.g., A -> B)
 *      2. Undirected Graph:
 *         Edges don't have a direction. (e.g., A - B)
 *
 *      3. Weighted Graph:
 *         Edges have weights or costs associated. (e.g., A -5-> B)
 *      4. Unweighted Graph:
 *         All edges have equal or no weights.
 *
 *      5. Cyclic and Acyclic Graphs:
 *         Cyclic: Contains at least one cycle.
 *         Acyclic: No cycles (e.g., Trees).
 *
 *      6. Connected and Disconnected Graphs:
 *         Connected: All nodes are reachable.
 *         Disconnected: Contains isolated nodes.
 *
 * Graph Representations:
 * -------------------------------------
 *     1. Adjacency Matrix:
 *        A 2D array where matrix[i][j] = 1 if there’s an edge from i to j.
 *        Space Complexity: O(V^2).
 *     2. Adjacency List:
 *        An array of lists where list[i] contains neighbors of vertex i.
 *        Space Complexity: O(V + E).
 *     3. Edge List:
 *        A list of all edges. (e.g., [(A, B), (B, C)]).
 *
 * Basic Graph Algorithms:
 * -------------------------------------
 *     1. Traversal Algorithms:
 *        Breadth-First Search (BFS): Explores neighbors level by level (uses a queue).
 *        Depth-First Search (DFS): Explores as far as possible along each branch (uses a stack or recursion).
 *
 *     2. Shortest Path Algorithms:
 *        Dijkstra's Algorithm: Weighted graphs with non-negative weights.
 *        Bellman-Ford Algorithm: Handles negative weights.
 *        Floyd-Warshall Algorithm: All-pairs shortest path.
 *
 *     3. Minimum Spanning Tree (MST):
 *        Kruskal's Algorithm.
 *        Prim's Algorithm.
 *
 *     4. Topological Sorting:
 *        For Directed Acyclic Graphs (DAGs).
 *        Order tasks based on dependencies.
 *
 *     5. Strongly Connected Components (SCC):
 *        Kosaraju’s Algorithm.
 *        Tarjan’s Algorithm.
 *
 *     6. Cycle Detection:
 *        Detect cycles in directed and undirected graphs.
 *
 *
 * Applications of Graphs:
 * -------------------------------------------------
 * - Social Networks: Modeling connections and relationships.
 * - Web Crawling: Representing the internet as a graph.
 * - Maps and Navigation: Routing and pathfinding.
 * - Recommendation Systems: Finding similar users or products.
 * - Dependency Resolution: Task scheduling (e.g., Topological sort).
 *
 *
 * Recommended Learning Path:
 * 1. Understand Basics:
 *    - Learn graph terminology and representations.
 *    - Implement BFS and DFS.
 * 2. Practice Basic Problems:
 *    - Graph traversal.
 *    - Connected components.
 * 3. Study Advanced Topics:
 *    - Shortest paths.
 *    - Minimum spanning trees.
 *    - Graph coloring.
 * 4. Solve Real-World Problems:
 *    - Implement navigation systems, friend suggestions, etc.
 */
