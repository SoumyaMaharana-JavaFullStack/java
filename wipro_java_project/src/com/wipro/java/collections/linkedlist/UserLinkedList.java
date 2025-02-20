package com.wipro.java.collections.linkedlist;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	Node head;

	// Insert at end
	void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// Delete a node by value
	void delete(int key) {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		if (head.data == key) {
			head = head.next;
			return;
		}

		Node temp = head;
		Node prev = null;
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Element not found.");
			return;
		}

		prev.next = temp.next;
	}

	// Search for a node
	boolean search(int key) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == key)
				return true;
			temp = temp.next;
		}
		return false;
	}

	// Display linked list
	void display() {
		Node temp = head;
		if (temp == null) {
			System.out.println("List is empty.");
			return;
		}
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
}

public class UserLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		int choice, value;

		do {
			System.out.println("\nMenu:");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Search");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter value to insert: ");
				value = sc.nextInt();
				list.insert(value);
				break;
			case 2:
				System.out.print("Enter value to delete: ");
				value = sc.nextInt();
				list.delete(value);
				break;
			case 3:
				System.out.print("Enter value to search: ");
				value = sc.nextInt();
				if (list.search(value))
					System.out.println(value + " is present in the list.");
				else
					System.out.println(value + " is not found.");
				break;
			case 4:
				System.out.println("Linked List:");
				list.display();
				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice! Try again.");
			}
		} while (choice != 5);

		sc.close();
	}
}
