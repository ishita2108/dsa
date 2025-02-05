package dsa.udemy.datastructures.linkedlist;
public class LinkedList {

	// CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
	//                                                          //
	//                                                          //
	//                                                          //
	//                                                          //
	//////////////////////////////////////////////////////////////

private Node head;

private Node tail;

private int length;
	

class Node{
int value;
Node next;

Node(int value){
this.value = value;

}

}

public LinkedList(int value){

Node newNode = new Node(value);

head = newNode;
tail = newNode;
length = 1;

}

	
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
    
    public void append(int value) {
    	Node newNode = new Node(value);
    	
    	if(length ==0) {
    		head = newNode;
    		tail = newNode;   		
    	}
    	else {
    		tail.next = newNode;
    		tail = newNode;
    	}
    	length++;
    }
    
public Node removeLast(){
	    
	    if(length == 0) return null;
	    
	    Node temp = head;
	    Node pre = head;
	    
	    while(temp.next != null){
	        pre = temp;
	        temp = temp.next;
	    }
	    
	    tail = pre;
	    tail.next = null;
	    length--;
	    
	    if(length == 0){
	        head = null;
	        tail = null;
	    }
	    
	    return temp;
	}
public void prepend(int value){
    Node newNode = new Node(value);
    if(length == 0){
        head = newNode;
        tail = newNode;
    }
    
    newNode.next = head;
    head = newNode;
    length++;
}

public Node removeFirst(){
    
    if(length == 0) return null;
    
    Node temp = head;
    head = head.next;
    temp.next = null;
    length--;
    if(length==0){
        tail = null;
    }
	return temp;
}

public Node get(int index){
    
    if(index >= length || index < 0) return null;
    
    Node temp = head;
    
    for(int i=0; i < index; i++){
        temp = temp.next;
    }
    return temp;
}

public boolean set(int index, int value){
    
    Node temp = get(index);
    if(temp != null){
    temp.value = value;
    return true;
    }
    return false;
}

public boolean insert(int index, int value){
    if (index < 0 || index > length) return false;
    if(index == 0){
      prepend(value);
      return true;
    } 
    if(index == length){
        append(value);
        return true;
    }
    else{
        Node temp = get(index-1);
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
}

public Node remove(int index){
    if (index < 0 || index > length) return null;
    if(index ==0) return removeFirst();
    if(index == length) return removeLast();
    else{
        Node prev = get(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }
    
    
}

public void reverse(){
    Node temp = head;
    head = tail;
    tail = temp;
    Node before = null;
    Node after = temp.next;
    
    for(int i =0; i< length; i++){
        after = temp.next;
        temp.next = before;
        before = temp;
        temp = after;
    }
}

}

