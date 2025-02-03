package dsa;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues{
	
	private Queue<Integer> q1 = new LinkedList<Integer>();
	private Queue<Integer> q2 = new LinkedList<Integer>();

	public void push(int i) {
		// TODO Auto-generated method stub
		q2.add(i);
		
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
		
	}

	public int top() {
		// TODO Auto-generated method stub
		if (q1.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
		return q1.peek();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return q1.isEmpty();
	}

	public int pop() {
		// TODO Auto-generated method stub
		if (q1.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
		return q1.remove();
	}
	
	
	
}

public class StackUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub/
		
		 StackUsingQueues stack = new StackUsingQueues();
	        
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        
	        System.out.println("Top element: " + stack.top()); // Output: 30
	        System.out.println("Popped element: " + stack.pop()); // Output: 30
	        System.out.println("Top element: " + stack.top()); // Output: 20
	        System.out.println("Popped element: " + stack.pop()); // Output: 20
	        System.out.println("Is stack empty: " + stack.isEmpty()); // Output: false
	        System.out.println("Popped element: " + stack.pop()); // Output: 10
	        System.out.println("Is stack empty: " + stack.isEmpty()); // Output: true

	}

}
