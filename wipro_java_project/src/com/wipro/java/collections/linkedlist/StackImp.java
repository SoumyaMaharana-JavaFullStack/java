package com.wipro.java.collections.linkedlist;

import java.util.Scanner;

// Generic Stack Implementation Using Linked List
class Stack<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> top;

    // Constructor
    public Stack() {
        this.top = null;
    }

    // Push method to add elements
    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
    }

    // Pop method to remove and return the top element
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    // Peek method to return the top element without removing it
    public T peek() {
        return isEmpty() ? null : top.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}

public class StackImp {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (non-integer to stop):");
        while (scanner.hasNextInt()) {
            integerStack.push(scanner.nextInt());
        }
        scanner.nextLine(); // Consume the non-integer input

        System.out.println("Peek: " + integerStack.peek());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Is Empty: " + integerStack.isEmpty());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Is Empty: " + integerStack.isEmpty());

        Stack<String> stringStack = new Stack<>();
        System.out.println("Enter strings (empty line to stop):");

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
            stringStack.push(userInput);
        }

        System.out.println("Peek: " + stringStack.peek());
        scanner.close();
    }
}
