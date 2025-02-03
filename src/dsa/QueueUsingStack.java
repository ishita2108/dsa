package dsa;

import java.util.Stack;

class QueueUsingStacks{
	private Stack<Integer> s1 = new Stack<Integer>();
	private Stack<Integer> s2 = new Stack<Integer>();
	
	public void enqueue(int num) {
		s1.push(num);
		
	}

	public int top() {
		if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
		if (s2.isEmpty()) {
            // Transfer elements from s1 to s2 to get the front of the queue
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
		return s2.peek();
		
	}

	public int dequeue() {
		if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
		
		if (s2.isEmpty()) {
		
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		}
		
		
		return s2.pop();
		
	}

	public boolean isEmpty() {
		return s1.isEmpty() && s2.isEmpty();
		
	}
	
}

public class QueueUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStacks queue = new QueueUsingStacks();
		queue.enqueue(40);
        queue.enqueue(80);
        queue.enqueue(90);
        queue.enqueue(10);

        System.out.println("Top element: " + queue.top());  // Output: 40
        System.out.println("Popped element: " + queue.dequeue());  // Output: 40
        System.out.println("Top element: " + queue.top());  // Output: 80
        System.out.println("Popped element: " + queue.dequeue());  // Output: 80
        System.out.println("Is stack empty: " + queue.isEmpty());  // Output: false
        System.out.println("Popped element: " + queue.dequeue());  // Output: 90
        System.out.println("Is stack empty: " + queue.isEmpty());  // Output: false
        System.out.println("Popped element: " + queue.dequeue());  // Output: 10
        System.out.println("Is stack empty: " + queue.isEmpty());  // Output: true


	}

}
