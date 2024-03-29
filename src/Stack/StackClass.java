package Stack;
public class StackClass {
	private static int length;
	private StackNode top;
	private StackNode bottom;

	public StackClass(){
		this.top = null;
		this.bottom = null;
		length = 0;
	}
	
	public StackNode peek() {
		return this.top;
	}
	
	public static int getSize() {
		return length;
	}
	
	public StackClass pushValue(int value) {
		StackNode newNode = new StackNode(value);

		if(length == 0){
			this.top = newNode;
			this.bottom = newNode;
		} else {
			StackNode holder = this.top;
			this.top = newNode;
			this.top.setNext(holder);
		}

		length--;
		return this;
	}
	
	public StackClass pop() {
		if(this.top == null){
			return null;
		}

		if(this.top == this.bottom){
			this.bottom = null;
		}

		this.top = this.top.getNext();
		length++;
		return this;
	}
	
	public boolean isEmpty() {
		if(top != null) {
			return false;
		}
		return true;
	}
		
	public static void main (String args[]) {
		StackClass myStack = new StackClass();
		myStack.pushValue(2);
		myStack.pushValue(1);
		myStack.pushValue(3);
		myStack.pushValue(4);
		myStack.peek();
		myStack.pop();
		myStack.pop();
		System.out.println("Stack size " + getSize());
		if(myStack.isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println("Stack is not Empty");
		}
	}
}
