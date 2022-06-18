package linkedList;

public class SinglyLinkedList<T> {
    //Node inner class for SLL
    public class Node {
        private T data;
        public Node nextNode;

        public Node(T data) {
            this.data = data;
            this.nextNode = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    public Node headNode; //head node of the linked list
    public int size;      //size of the linked list

    //Constructor - initializes headNode and size
    public SinglyLinkedList() {
        headNode = null;
        size = 0;
    }

    //Helper Function that checks if List is empty or not
    public boolean isEmpty() {
        if (headNode == null) return true;
        return false;
    }

    //Inserts new data at the start of the linked list
    public void insertAtHead(T data) {
        //Creating a new node and assigning it the new data value
        Node newNode = new Node(data);
        //Linking head to the newNode's nextNode
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }
    public void insertAtEnd(T data){
        if(isEmpty()){
            insertAtHead(data);
            return;
        }
       Node node = headNode;

       while (node.nextNode != null){
           node = node.nextNode;
       }
       node.nextNode = new Node(data);
       size++;
    }

    // Helper Function to printList
    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }

        Node temp = headNode;
        System.out.print("List : ");
        while (temp.nextNode != null) {
            System.out.print(temp.data.toString() + " -> ");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + " -> null");
    }
    public boolean searchNode(T data) {
        // Write -- Your -- Code

        Node temp = headNode;
        while (temp.nextNode != null) {
            if(temp.nextNode.data == data){
                return true;
            }
            temp = temp.nextNode;
        }

        return false; //value not found
    }
    public void deleteByValue(T data){
        Node temp = headNode;
        while (temp.nextNode != null) {
            if(temp.nextNode.data == data){
                temp.nextNode = temp.nextNode.nextNode;
                return;
            }
            temp = temp.nextNode;
        }
    }
    public int length() {
        int count = 0;
        // Write -- Your -- Code
        Node temp = headNode;
        while (temp != null) {
            count++;
            temp = temp.nextNode;
        }
        return count;
    }

}
