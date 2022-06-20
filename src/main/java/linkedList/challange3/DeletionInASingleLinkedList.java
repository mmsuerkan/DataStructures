package linkedList.challange3;

import linkedList.common.SinglyLinkedList;

public class DeletionInASingleLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        list.deleteByValue(4);

        list.printList();
    }
}
