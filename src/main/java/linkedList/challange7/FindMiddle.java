package linkedList.challange7;

import linkedList.SinglyLinkedList;

public class FindMiddle {


    private static Object findMiddle(SinglyLinkedList<Integer> list) {

        //if list is empty, then return null
        if (list.isEmpty())
            return null;

        //both nodes start from the head
        SinglyLinkedList.Node mid = list.headNode;
        SinglyLinkedList.Node current = list.headNode;

        while(mid != null && current != null && current.nextNode != null)
        {
            //current jumps 2 nodes on each iteration
            current = current.nextNode.nextNode;
            //if current is not null (end of list is not reached)
            if(current != null){
                //then mid jumps 1 node
                //mid is always halfway behind current
                mid = mid.nextNode;
            }
        }
        return mid.getData();

    }


    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.insertAtEnd(7);
        list.insertAtEnd(14);
        list.insertAtEnd(21);
        list.insertAtEnd(7);
        list.insertAtEnd(15);

        System.out.println(findMiddle(list));


    }


}
