package linkedList;

public class MainAppending {
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
		AppendingData linkedList = new AppendingData();
		linkedList.addNode(56);
		linkedList.append(30);
		linkedList.append(70);
		
		/**
		 * To print the list.
		 */

		AppendingData.printLinkedList();
	}
}
