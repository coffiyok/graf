# Graph Traversal and Representation System (Assignment 4)

## A. Project Overview
This project implements a directed graph using an Adjacency List
* **Vertex:** Represents a node with a unique ID 
* **Edge:** Represents a connection between two vertices 
* **BFS:** Explores neighbors level by level using a queue
* **DFS:** Explores as far as possible along each branch using a stack

## B. Class Descriptions
* **Vertex.java:** Stores the unique identifier of a node 
* **Edge.java:** Stores the source and destination vertices 
* **Graph.java:** Manages the adjacency list and implements traversal logic
* **Experiment.java:** Handles automated graph generation and performance measurement 

## C. Algorithm Descriptions
### Breadth-First Search (BFS)
* **Steps:** Uses a queue. Visit start node -> add neighbors to queue -> poll next node -> repeat
* **Complexity:** O(V + E)
* **Use Case:** Finding the shortest path in unweighted graphs

### Depth-First Search (DFS)
* **Steps:** Uses a stack. Push start node -> pop node -> push unvisited neighbors -> repeat
* **Complexity:** O(V + E)
* **Use Case:** Detecting cycles or solving puzzles like mazes

## D. Experimental Results

### Execution Time Comparison:
* https://github.com/coffiyok/graf/blob/6a514818f2ace3fde1a4d4b50c0f26f29555db19/screenshot.png

| Graph Size | BFS Execution Time (ns) | DFS Execution Time (ns) |
| :--- | :--- | :--- |
| **10 Vertices** | 1,204,200 | 1,721,200 |
| **30 Vertices** | 954,800 | 791,300 |
| **100 Vertices** | 1,811,900 | 2,040,500 |

### Observations and Patterns:
* **Performance:** As the graph size increases, the execution time generally grows, which is consistent with the $O(V + E)$ complexity
* **Efficiency:** In the small and large graph tests, BFS showed slightly different performance compared to DFS, likely due to the random structure of edges