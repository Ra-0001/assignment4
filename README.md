# Assignment 4 - Graph Traversal and Representation System

## Project Overview

This project implements graph traversal algorithms using Java.

The graph consists of:
- Vertices (nodes)
- Edges (connections)

The graph is represented using an adjacency list.

Algorithms implemented:
- Breadth-First Search (BFS)
- Depth-First Search (DFS)

---

# Classes

## Vertex Class
Represents a graph vertex with unique id.

## Edge Class
Represents connection between two vertices.

## Graph Class
Stores graph using adjacency list and contains BFS and DFS methods.

## Experiment Class
Runs performance tests on graphs of different sizes.

---

# BFS Algorithm

BFS visits nodes level by level using a queue.

Steps:
1. Start from source node
2. Add node to queue
3. Visit neighbors
4. Repeat until queue is empty

Time Complexity:
O(V + E)

Use Cases:
- Shortest path
- Social networks
- Web crawling

---

# DFS Algorithm

DFS visits nodes deeply before backtracking.

Steps:
1. Start from source node
2. Visit neighbor recursively
3. Continue until all nodes are visited

Time Complexity:
O(V + E)

Use Cases:
- Path finding
- Cycle detection
- Maze solving

---

# Experimental Results

| Graph Size | BFS Time (ns) | DFS Time (ns) |
|------------|---------------|---------------|
| 10         | 120000        | 100000        |
| 30         | 250000        | 230000        |
| 100        | 700000        | 650000        |


---

# Analysis Questions

## How does graph size affect performance?
Larger graphs require more processing time because more vertices and edges are visited.

## Which traversal was faster?
DFS was slightly faster in my experiments.

## Do results match O(V + E)?
Yes, execution time increased when vertices and edges increased.

## How does graph structure affect traversal order?
Different connections between vertices produce different visiting orders.

## When is BFS preferred?
BFS is preferred when finding the shortest path.

## Limitations of DFS
DFS can use more recursion depth and may not find shortest path.

---

# Reflection

In this assignment I learned how graphs work and how BFS and DFS traversal algorithms visit vertices differently.

One challenge was understanding recursion in DFS and using adjacency lists correctly. I also learned how to measure execution time using System.nanoTime().

# Bonus Task - Dijkstra's Algorithm

## Overview

As an additional task, Dijkstra’s Algorithm was implemented to find the shortest path from a starting vertex to all other vertices in the graph.

The graph was updated to support weighted edges.

---

## Changes Made

### Edge Class
The Edge class was modified by adding:
- weight field
- getter for weight

Example:
```java
private int weight;

- also overall was improved and added addtional codes in experiment and graph classes in order to stabiize the running 