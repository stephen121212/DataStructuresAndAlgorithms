package DoublyLinkedList;

public class DoublyLinkedListTest {
	public static void main(String[]args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.insertAtStart(3);
		dll.insert(4);
		dll.insertAt(1, 33);
		dll.deleteAt(1);
		dll.insert(5);
		dll.insert(7);
		dll.showFromNext();
	}
}
