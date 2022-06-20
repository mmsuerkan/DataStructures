package linkedList.challange8;

import linkedList.common.SinglyLinkedList;
import linkedList.common.SinglyLinkedList.Node;

public class RemoveDuplicatesChallenge {


    public static void removeDuplicates(SinglyLinkedList list) {
        // Write -- Your -- Code

        Node first = list.headNode;
        Node second = list.headNode;

        while (first != null){
            while (second != null){

                if(first.getData().equals(second.getData())){
                 list.deleteByValue(first.getData());
                }
                second = second.nextNode;
            }
            first = first.nextNode;
        }


    }


    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.insertAtEnd(7);
        list.insertAtEnd(14);
        list.insertAtEnd(21);
        list.insertAtEnd(7);
        list.insertAtEnd(15);

        list.printList();

        removeDuplicates(list);

        list.printList();

    }


}
