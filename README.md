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