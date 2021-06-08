package DoublyLinkedList;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	
	public void insertAtStart(int data) {
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
	}
	
	public void insert(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		} else {
			Node n = head;
			while(n.getNext()!=null) {
				n = n.getNext();
			}
			n.setNext(newNode);
			newNode.setPrev(n);
		}
	}
	
	public void insertAt(int index, int data) {
		Node newNode = new Node(data);
		if(index == 0) {
			insertAtStart(data);
		} else {
			Node a = head;
			for(int i = 0; i<index-1; i++) {
				a=a.getNext();
			}
			Node b = a.getNext();
			newNode.setNext(b);
			a.setNext(newNode);
			b.setPrev(newNode);
			newNode.setPrev(a);
		}
	}
	
	public void deleteAt(int index) {
		if(index == 0) {
			head = head.getNext();
		} else {
			Node a = head;
			for(int i = 0; i<index-1; i++){
				a=a.getNext();
			}
			Node b = a.getNext().getNext();
			a.setNext(b);
			b.setPrev(a);
		}
	}
	
	
	public void showFromNext() {
		Node n = head;
		while(n.getNext()!=null) {
			System.out.println(n.getData());
			n=n.getNext();
		}
		System.out.println(n.getData());
	}
}
