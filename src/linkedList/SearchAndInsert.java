package linkedList;

public class SearchAndInsert {
	public static Node head = null;

	/**
	 * To add newnode to the linkedlist
	 */

	public Node addNode(int data) {
		/**
		 * Created New node. Check head is empty or not. 
		 * If yes then assign head =newNode.
		 * Iterate the linkedList and reach at last node. 
	     * Assign new node to the next part of last node of linked list.
		 * Return head.
		 */

		/**
		 * new newNode is created.
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
 * To search and insert a node in between two nodes.
 * @param search-to search for the data.
 * @param newData-to insert the new data.
 */
	public void insertAfter(int search, int newData) {
	
		Node newNode = new Node(newData);
		if (head == null) {
			return;
		}

		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.data == search) {
				return;
			}
			currentNode = currentNode.next;
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
	

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
