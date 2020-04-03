package LinkedList;

public class LinkedListClass {
	private Node head;
	private Node tail;
	
	public void insert(int data)
	{
		Node node = new Node(data);
		node.next = null;
		
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next =  node;
		}
		
	}
	
	public void insertAtStart(int data)
	{
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	public void insertAt(int index,int data)
	{
		Node node = new Node(data);
		node.next = null;
		
		if(index==0)
		{
			insertAtStart(data);
		}
		else{
		Node n = head;
		for(int i=0;i<index-1;i++)
		{
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
		}
	}
	
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head = head.next;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
	}
	
	public void show()
	{
		Node node = head;
		
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public LinkedListClass reverse() {
		if(this.head.next == null) {
			return this;
		}
		
		Node first = this.head;
		this.tail = this.head;
		Node second = first.next;
		while(second != null) {
			Node temp = second.next;
			second.next = first;
			first = second;
			second = temp;
		}
		this.head.next = null;
		this.head = first;
		return this;
	}
}
