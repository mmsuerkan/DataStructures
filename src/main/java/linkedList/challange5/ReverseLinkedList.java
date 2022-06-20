package linkedList.challange5;

import linkedList.common.SinglyLinkedList;

public class ReverseLinkedList {


    public static <T> void reverse(SinglyLinkedList<T> list){

        SinglyLinkedList.Node prev = null;
        SinglyLinkedList.Node current = list.headNode;
        SinglyLinkedList.Node next = null;

        while (current != null){
            next = current.nextNode;
            current.nextNode = prev;

            prev = current;
            current = next;
        }
        list.headNode = prev;

    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        list.printList();

        reverse(list);

        list.printList();
    }

}
