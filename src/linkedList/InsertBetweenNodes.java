package linkedList;

public class InsertBetweenNodes {
	public static Node head = null;

	/**
	 * To add newnode to the linkedlist
	 */

	public Node addNode(int data) {
		/**
		 *  Created New node.
		 *  Check head is empty or not. 
		 *  If yes then assign head = newNode.
		 *  Iterate the linkedList and reach at last node. 
		 *  Assign new node to the next part of last node of linked list.
         *  Return head.
		 */
		
		
		/**
		 * new  newNode is created.
		 */
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;

		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return head;
	}


	/**
	 * To add node to the list.
	 * 
	 * @param data
	 */
	public void append(int data) {
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
	/**
	 * To insert a node in between two or nodes.
	 * 
	 * @param data-data which you want to insert.
	 * @param position-at which position you want to insert the data.
	 */
	public void insertAtPosition(int data, int position) {

		Node newNode = new Node(data);
		if (position == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}

		Node currentNode = head;
		for (int i = 0; i < position - 1; i++) {
			currentNode = currentNode.next;

		}

		newNode.next = currentNode.next;
		currentNode.next = newNode;

	}


	/**
	 * This used to print the element in the list.
	 * 
	 * @param head
	 */
	public static void printLinkedList() {
		if (head == null) {
			System.out.print("LinkedList is empty");
		}

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
}
