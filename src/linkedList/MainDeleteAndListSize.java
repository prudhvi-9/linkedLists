package linkedList;

public class MainDeleteAndListSize {
	/**
	 * This method is used to search and insert a element in the linkedlist.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Creating a new linkedList object .
		 */
		DeleteAndShowSizeOFList linkedList = new DeleteAndShowSizeOFList();
		linkedList.addNode(56);
		linkedList.addNode(30);
		linkedList.addNode(40);
		linkedList.addNode(70);
		
		/**
		 * To print the list.
		 */
		System.out.println("LinkedList:");
		DeleteAndShowSizeOFList.printLinkedList();
		System.out.println();
		/**
		 * 
		 * To print the list after deleting a node.
		 */
		linkedList.deleteNode(40);
		System.out.println("After Deleting a node :");
		DeleteAndShowSizeOFList.printLinkedList();
		System.out.println();
		System.out.println("Size of LinkedList:" + linkedList.size());

	}

}