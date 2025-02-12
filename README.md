# Assignment3-Implementing-Lists

## Deadline
**Thursday, February 15, 2024, 9:59 PM**

## Objectives
- Familiarize yourself with the basics of **List** data structures.
- Learn how to perform common operations such as **creation, addition, removal, and traversal**.

## Overview
In this assignment, you will implement and manipulate **List** data structures in Java. You will explore different operations on lists and demonstrate your understanding by writing code that performs:

- Implementing a **Song** class.
- Implementing an **Array-based List** (`AList`) for storing `Book` instances.
- Implementing a **Singly Linked List** (`SLList`) for storing `Song` instances.
- Implementing a **Doubly Linked List** (`DLList`) for storing `Song` instances.
- Extending all implementations using **Generics** to work with any type of object.

## Requirements
- Use **Java** as the programming language.
- Implement **AList, SLList, and DLList** from scratch.
- Demonstrate all the required operations on the Lists.
- Print output to show the effect of each operation.

## Instructions
### **Problem 1 - Create a Song class**
Implement a **Song** class with the following attributes:
- `title` (String)
- `artist` (String)
- `length` (double)

### **Problem 2 - Implement an Array-based List (AList) for Books**
Create an **AList** class from scratch with:
- **Constructor**: Initializes an empty list.
- `void addy(Book p)`: Adds a `Book` to the list, resizing when needed.
- `void removy(int pos)`: Removes the element at `pos`, shifting elements accordingly.
- `String toString()`: Returns a formatted string of all elements.

### **Problem 3 - Implement a Singly Linked List (SLList) for Songs**
Create **SLNode** and **SLList** classes:
- **Constructor**: Initializes an empty list.
- `void addy(Song s)`: Adds a `Song` to the end of the list.
- `void removy(int pos)`: Removes the `Song` at `pos`, updating pointers.
- `String toString()`: Returns a formatted string of all elements.

### **Problem 4 - Implement a Doubly Linked List (DLList) for Songs**
Create **DLNode** and **DLList** classes:
- **Constructor**: Initializes an empty list.
- `void addy(Song s)`: Adds a `Song` to the list.
- `void removy(int pos)`: Removes the `Song` at `pos`, updating pointers.
- `String toString()`: Returns a formatted string of all elements.

### **Problem 5 - Implement a Generic Version**
Extend **AList, SLList, and DLList** to work with **any type of object** using **Generics**.

## Submission
- Submit your **Java source code** (`.java` files).
- Ensure your code is **well-commented** to explain each operation.
- Push your code to **GitHub** and provide the repository link.

## Notes
- Use `ArrayList` for dynamic resizing and **fast element access**.
- Use `LinkedList` for **frequent insertions and deletions**.
- Experiment with different List methods to strengthen your understanding.

## Author

**Peter Hoang**\
Course: [Data Structures and Algorithms CSC-3130-02]\

Feel free to contribute or suggest improvements!


