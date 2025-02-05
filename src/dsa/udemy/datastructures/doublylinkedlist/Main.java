package dsa.udemy.datastructures.doublylinkedlist;
public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myLinkedList = new DoublyLinkedList(4);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

    }

}

