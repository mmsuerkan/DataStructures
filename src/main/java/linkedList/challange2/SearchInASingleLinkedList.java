package linkedList.challange2;

import linkedList.common.SinglyLinkedList;

public class SearchInASingleLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        System.out.println(list.searchNode(4));
        System.out.println(list.searchNode(6));
    }
}
