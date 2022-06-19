package linkedList.challange6;

import linkedList.SinglyLinkedList;

public class DetectLoop {

    public static <T> boolean detectLoop(SinglyLinkedList<T> list){

        SinglyLinkedList<T>.Node slow = list.headNode;
        SinglyLinkedList<T>.Node fast = list.headNode.nextNode;

        while (slow != null && fast != null && fast.nextNode != null){
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;

            if(slow == fast ){
                return true;
            }


        }
        return false;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.insertAtEnd(7);
        list.insertAtEnd(14);
        list.insertAtEnd(21);
        list.insertAtEnd(7);

        System.out.println(detectLoop(list));


    }

}
