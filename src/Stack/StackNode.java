package Stack;

public class StackNode {
	private int value;
	private StackNode next;

	public StackNode(int value){
		this.value = value;
		this.next = null;
	}

	public int getValue() {
		return this.value;
	}

	public StackNode getNext() {
		return this.next;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setNext(StackNode next) {
		this.next = next;
	}
}
