# Assignment 2

## 📌 Project Overview

This project implements custom data structures in Java without using `java.util.*` (except Iterator).

The goal is to build:
- MyArrayList (dynamic array)
- MyLinkedList (doubly linked list)
- MyStack (LIFO structure)
- MyQueue (FIFO structure)
- MyMinHeap (priority queue based on heap)

All structures are implemented manually to understand how fundamental data structures work internally.


## 🧱 Implemented Data Structures

### 1. MyList<T> (Interface)
Defines the basic operations for list-like structures:
- add
- add(index, element)
- remove
- get
- size
- contains
- indexOf
- clear


### 2. MyArrayList<T>
Dynamic array implementation using `Object[]`.

Features:
- Automatic resizing
- Fast random access (O(1))
- Efficient insertion at the end

Used as the base for:
- MyStack
- MyMinHeap


### 3. MyLinkedList<T> (Doubly Linked List)
Node-based structure with:
- head and tail references
- previous and next pointers

Features:
- Efficient insertion/removal at both ends
- No memory shifting like arrays

Used as the base for:
- MyQueue


### 4. MyStack<T>
LIFO (Last In First Out) structure.

Operations:
- push()
- pop()
- peek()

Implemented using: **MyArrayList**


### 5. MyQueue<T>
FIFO (First In First Out) structure.

Operations:
- enqueue()
- dequeue()

Implemented using: **MyLinkedList**


### 6. MyMinHeap<T>
Binary heap implementation using MyArrayList.

Features:
- Always keeps minimum element at root
- Supports:
  - add()
  - removeMin()

Uses heapifyUp and heapifyDown operations.


## 🚫 Restrictions
- No usage of `java.util.*` (except Iterator)
- All data structures implemented manually


## 🧪 Testing
All structures are tested in `Main.java` with basic scenarios:
- Stack push/pop
- Queue enqueue/dequeue
- Heap insertion/removal


## 📂 Project Structure

## 📌 GitHub Requirements
- More than 5 commits
- Each commit reflects logical progress:
  - Interface
  - ArrayList
  - LinkedList
  - Stack/Queue
  - Heap
- Proper version control usage

