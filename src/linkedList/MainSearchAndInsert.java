package linkedList;

public class MainSearchAndInsert {
	/**
	 * This method is used to search and insert a element in the linkedlist.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Creating a new linkedList object .
		 */
		SearchAndInsert linkedList = new SearchAndInsert();
		linkedList.addNode(56);
		linkedList.addNode(30);
		linkedList.addNode(70);
		linkedList.addNode(80);
		linkedList.addNode(20);
		/**
		 * To print the list.
		 */
		System.out.println("LinkedList:");
		SearchAndInsert.printLinkedList();
		System.out.println();
		/**
		 * To print the list after searching and inserting a node.
		 */
		System.out.println("Inserting a Node:");
		linkedList.insertAfter(30, 40);
		SearchAndInsert.printLinkedList();

	}

}
