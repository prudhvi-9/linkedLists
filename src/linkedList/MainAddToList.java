package linkedList;

public class MainAddToList {
	/**
	 * This method is used to create a linkedlist.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Creating a new SimpleLinkedList object .
		 */
		AddNodeToList linkedList = new AddNodeToList();

		Node head = linkedList.addNode(56, null);
		linkedList.addNode(30, head);
		linkedList.addNode(70, head);
		/**
		 * To print the list.
		 */
		AddNodeToList.printLinkedList(head);
	}
}
