package linkedList;

public class MainOrderListInAscendingOrder {

	/**
	 * This method is used to sort the list in ascending order.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Creating a new linkedList object .
		 */
		OrderListAscendingOrder linkedList = new OrderListAscendingOrder();
		linkedList.addNode(56);
		linkedList.addNode(30);
		linkedList.addNode(40);
		linkedList.addNode(70);
		/**
		 * To print the list.
		 */
		System.out.println("UnSorted LinkedList:");
		OrderListAscendingOrder.printLinkedList();
		System.out.println();
		/**
		 * sort in ascending order
		 */
		linkedList.sortList();

		/**
		 * Print the sorted LinkedList
		 */
		System.out.println("Sorted LinkedList");
		OrderListAscendingOrder.printLinkedList();
	}

}
