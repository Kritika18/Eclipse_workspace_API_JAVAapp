package algo;

import algo.SingleLinkedList.Node;

public class ReverseSinglyLinkedList {

		public static void main(String[] args) {
			SingleLinkedList myLinkedList = new SingleLinkedList();
			myLinkedList.head = new Node(1);
			myLinkedList.head.next = new Node(2);
			myLinkedList.head.next.next = new Node(3);

			printLinkedList(myLinkedList);
			reverseLinkedList(myLinkedList);
			printLinkedList(myLinkedList);

		}

		public static void printLinkedList(SingleLinkedList linkedList) {
			Node h = linkedList.head;
			while (linkedList.head != null) {
				System.out.print(linkedList.head.data + " ");
				linkedList.head = linkedList.head.next;
			}
			System.out.println();
			linkedList.head = h;
		}

		public static void reverseLinkedList(SingleLinkedList linkedList) {
			Node previous = null;
			Node current = linkedList.head;
			Node next;
			while (current != null) {
				next = current.next;
				current.next = previous;
				previous = current;
				current = next;
			}
			linkedList.head = previous;
		}

}

