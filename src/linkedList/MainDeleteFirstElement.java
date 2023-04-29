package linkedList;

public class MainDeleteFirstElement {
	/**
	 * This method is used to delete a first element in the linkedlist.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Creating a new linkedList object .
		 */
		DeleteFirstElement linkedList = new DeleteFirstElement();
		linkedList.addNode(56);
		linkedList.addNode(30);
		linkedList.addNode(70);

		/**
		 * To print the list.
		 */
		System.out.println("LinkedList:");
		DeleteFirstElement.printLinkedList();
		System.out.println();
		/**
		 * To print the list after deleting a element.
		 */
		System.out.println("After Deleting First Element :");
		linkedList.pop(30);
		DeleteFirstElement.printLinkedList();
	}
}