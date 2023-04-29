package linkedList;

public class MainDeleteLast {
	/**
	 * This method is used to delete a first element in the linkedlist.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Creating a new linkedList object .
		 */
		DeleteLastElement linkedList = new DeleteLastElement();
		linkedList.addNode(56);
		linkedList.addNode(30);
		linkedList.addNode(70);

		/**
		 * To print the list.
		 */
		System.out.println("LinkedList:");
		DeleteLastElement.printLinkedList();
		System.out.println();
		/**
		 * To print the list after deleting a element.
		 */
		System.out.println("After Deleting Last Element :");
		linkedList.popLast(30);
		DeleteLastElement.printLinkedList();
	}
}
