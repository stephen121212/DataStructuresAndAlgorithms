package DoublyLinkedList;
public class Node{
	private int data;
	private Node prev;
	private Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	public Node(int data, Node next, Node prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	public Node getPrev() {
		return this.prev;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public int getData() {
		return this.data;
	}
}