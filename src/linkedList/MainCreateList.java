package linkedList;

public class MainCreateList {
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
		CreateLinkedList linkedList = new CreateLinkedList();

		Node head = linkedList.addNode(56, null);
		linkedList.addNode(30, head);
		linkedList.addNode(70, head);
		/**
		 * To print the list.
		 */
		CreateLinkedList.printLinkedList(head);
	}

}
