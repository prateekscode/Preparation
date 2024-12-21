package com.LinkedList;

public class LinkedListPrograms {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	Node head;

	public static LinkedListPrograms LinkedListInsert(LinkedListPrograms list, int data) {

		Node new_node = new Node(data);

		if (list.head == null) {
			list.head = new_node;
		} else {
			Node temp = list.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
		return list;
	}

	public static boolean detectLoop(Node head) {

		Node slow = head;
		Node fast = head;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}

	public static void PrintLinkedList(LinkedListPrograms list) {

		Node curr_node = list.head;

		System.out.println("LinkedList: ");

		while (curr_node != null) {
			System.out.print(curr_node.data + " ");
			curr_node = curr_node.next;
		}
	}

	public static Node getIntersectionNode(Node head1, Node head2) {
		while (head2 != null) {
			Node temp = head1;
			while (temp != null) {
				if (temp == head2)
					return head2;
				temp=temp.next;
			}
			head2=head2.next;
		}
		return null;
	}

	public static void main(String[] args) {

		LinkedListPrograms list = new LinkedListPrograms();
		list = LinkedListInsert(list, 1);
		list = LinkedListInsert(list, 2);
		list = LinkedListInsert(list, 3);
		list = LinkedListInsert(list, 4);

		PrintLinkedList(list);
	}
}
