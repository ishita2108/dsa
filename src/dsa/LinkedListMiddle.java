package dsa;

//Question: Find the middle of a linked list.
//Solution: Use a slow and fast pointer. The slow pointer moves one step, and the fast pointer moves two steps.

class Node {

	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListMiddle {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(3);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(9);
		head.next.next.next.next.next = new Node(9);
		
		Node middle = findMiddle(head);
		if(!(middle == null)) {
			System.out.println("Middle Node is : "+ middle.data);
		}
		else {
			System.out.println("No middle node");
		}

	}

	private static Node findMiddle(Node head) {
		// TODO Auto-generated method stub
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}

}
