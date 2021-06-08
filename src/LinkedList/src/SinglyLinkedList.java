public class SinglyLinkedList{
	private Node head;
	private Node tail;
	
	public SinglyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void insertAtStart(int data) {
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
	}
	
	public void insert(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;
		} else {
			Node n = head;
			
			while(n.getNext()!=null) {
				n = n.getNext();
			}
			n.setNext(newNode);
		}
	}
	
	public void insertAt(int index, int data) {
		Node newNode = new Node(data);
		
		if(index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for(int i = 0; i<index-1; i++) {
				n = n.getNext();
			}
			newNode.setNext(n.getNext());
			n.setNext(newNode);
		}
	}
	
	public void deleteAt(int index) {
		if(index==0) {
			head = head.getNext();
		} else {
			Node n = head;
			Node n1 = null;
			for(int i = 0; i<index-1; i++) {
				n=n.getNext();
			}
			n1 = n.getNext();
			n.setNext(n1.getNext());
			n1 = null;
		}
	}
	
	public void show() {
		Node n = head;
		while(n.getNext()!=null) {
			System.out.println(n.getData());
			n = n.getNext();
		}
		System.out.println(n.getData());
	}
}
