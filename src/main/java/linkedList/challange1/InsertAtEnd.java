package linkedList.challange1;

import linkedList.SinglyLinkedList;

public class InsertAtEnd<T> {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        list.printList();
    }

}
