package linkedList;

public class MainSearchLinkedlist {

	/**
	 * This method is used to delete a first element in the linkedlist.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Creating a new linkedList object .
		 */
		SearchLinkedlist linkedList = new SearchLinkedlist();
		linkedList.addNode(56);
		linkedList.addNode(30);
		linkedList.addNode(70);

		/**
		 * To print the list.
		 */
		System.out.println("LinkedList:");
		SearchLinkedlist.printLinkedList();
		System.out.println();
		/**
		 * To search a element in the linkedlist.
		 */
		System.out.println();
		int search = 30;
		if (linkedList.contains(search)) {
			System.out.println(search + " found in LinkedList.");
		} else {
			System.out.println(search + " not found in LinkedList.");
		}

	}

}
