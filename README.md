# Graphs

This repository contains the implementation of a weighted graph and pathfinding algorithms in Java. For this assignment, the architecture was modified: the classic `Edge` class was removed, and the logic for storing connections and weights was moved directly into the `Vertex` class using a `Map`.

## Class Structure

* **`Vertex<V>`** — Represents a graph node. Stores the data and adjacent vertices along with their connection weights.
* **`WeightedGraph<V>`** — A container to store all vertices of the graph and manage connections between them.
* **`Search<V>`** — An abstract base class that encapsulates the logic for tracking paths and visited nodes.
* **`BreadthFirstSearch<V>`** — Implements Breadth-First Search (BFS) to find the shortest path based on the number of hops.
* **`DijkstraSearch<V>`** — Implements Dijkstra's algorithm to find the optimal path considering edge weights.
* **`Main`** — The entry point to demonstrate the execution of the algorithms.

## Technologies

* Java

## Installation and Execution

Clone the repository to your local machine and navigate to the project root folder.

Compile the source code:
```bash
javac *.java
