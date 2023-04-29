package linkedList;

public class MainInsertBetweenNodes {
	/**
	 * This method is used to append node to linkedlist.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Creating a new MyLinkedList object .
		 */
		InsertBetweenNodes linkedList = new InsertBetweenNodes();
		linkedList.addNode(56);
		linkedList.addNode(70);

		/**
		 * To print the list.
		 */
		System.out.println("LinkedList:");
		InsertBetweenNodes.printLinkedList();
		System.out.println();
		/**
		 * To print the list after inserting a node.
		 */
		System.out.println("Inserting a Node:");
		linkedList.insertAtPosition(30, 1);
		InsertBetweenNodes.printLinkedList();
	}
}
