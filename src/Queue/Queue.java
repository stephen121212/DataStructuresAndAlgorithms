package Queue;

public class Queue {
	private Node first;
	private Node last; 
	private int length;
	
	public Queue(){
		this.first = null;
		this.last = null;
		this.length = 0;
	}
	
	public Queue enqueue(int value) {
		Node newNode = new Node(value);
		if(length == 0){
			this.first = newNode;
			this.last = newNode;
		} else {
			this.last.setNext(newNode);
			this.last = newNode;
		}

		length++;
		return this;
	}
	
	public Queue dequeue() {
		if(this.first == null){
			return null;
		} else if(this.first == this.last){
			this.last = null;
		}

		this.first = this.first.getNext();
		length++;
		return this;
	}
	
	public Node peek() {
		return this.first;
	}
	
	public int getSize() {
		return this.length;
	}
	
	public boolean isEmpty() {
		if(first != null) {
			return false;
		} 
		return true;
	}
	
	public static void main(String args[]) {
		Queue myQueue = new Queue();
		myQueue.enqueue(1);
		myQueue.enqueue(2);
		myQueue.enqueue(5);
		myQueue.enqueue(3);
		myQueue.peek();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		
		System.out.println("Queue size " + myQueue.getSize());
		if(myQueue.isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println("Queue is Not Empty");
		}
	}
}
