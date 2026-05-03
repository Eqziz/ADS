# Custom Data Structures (Java)

A small project implementing custom data structures: a Hash Table and a Binary Search Tree. Written as a university assignment, built entirely from scratch without using the standard `HashMap` or `TreeMap` classes.

## What's Inside?

### 1. MyHashTable
- Hash table implementation using separate chaining.
- Custom `MyTestingClass` with its own `hashCode()` implementation. To ensure uniform distribution, prime numbers (17 and 31) are used; the default `Objects.hash()` is intentionally avoided.
- Includes a test with 10,000 random elements. When run, it prints the size of each bucket to the console so you can visually verify the absence of heavy collisions.

### 2. Binary Search Tree (BST)
- A classic Binary Search Tree with `put`, `get`, and `delete` operations.
- Implements the `Iterable` interface (using in-order traversal), allowing the tree to be iterated over with a standard `for-each` loop.
- The iterator returns `KVPair` objects, providing convenient access to both the key and the value simultaneously.
- Keeps track of the current tree `size`.

## How to Run

The project uses only the standard Java library. No external dependencies (Maven/Gradle) are required.

**Testing the Hash Table:**
Run the `main` method in `MyTestingClass.java`. It will output the distribution statistics of the 10,000 elements across the buckets.

**BST Usage Example:**
```java
BST<Integer, String> tree = new BST<>();
tree.put(2, "Banana");
tree.put(1, "Apple");
tree.put(3, "Cherry");

// In-order tree traversal
for (var elem : tree) {
    System.out.println("Key: " + elem.getKey() + ", Value: " + elem.getValue());
}
