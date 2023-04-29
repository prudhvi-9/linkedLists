package linkedList;

public class AddNodeToList {
	public static Node head = null;

	/**
	 * To add node to the linkedlist
	 * 
	 * @param data-data which will be inserted into the linkedlist.
	 * @param head-     head of given linkedlist.
	 * @return-it will return head.
	 */
	public Node addNode(int data, Node head) {
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
	 * This used to print the element in the list.
	 * 
	 * @param head-head of the linkedlist 
	 */
	public static void printLinkedList(Node head) {
		Node temp = head;
		if (head == null) {
			System.out.print("LinkedList is empty");
		} else {

			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
		}
	}
}
