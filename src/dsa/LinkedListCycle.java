package dsa;

//Question: Detect a cycle in a linked list.
//Solution: Use Floyd’s cycle detection algorithm (Tortoise and Hare).

public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(3);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(9);
		head.next.next.next.next.next =head.next.next;
		
		boolean cyclic = findCyclic(head);
		if(cyclic) {
			System.out.println("LinkedList is cyclic.");
		}
		else {
			System.out.println("LinkedList is not cyclic.");
		}

	}
	

	private static boolean findCyclic(Node head) {
		// TODO Auto-generated method stub
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			
			slow = slow.next;
			fast = fast.next.next;
			
			if (slow == fast) {
                return true;
            }
		}

		return false;
	}
	
}

