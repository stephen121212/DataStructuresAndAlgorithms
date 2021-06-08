
public class LinkedListTestClass {
	public static void main(String[]args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		
		sll.insert(1);
		sll.insert(2);
		sll.insert(5);
		sll.insert(4);
		sll.insertAtStart(3);
		sll.insertAt(3, 55);
		sll.deleteAt(3);
		sll.show();
	}
}
