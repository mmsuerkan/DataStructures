package tree;

public class BinaryTreeNode {

    public int data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    private BinaryTreeNode parent;
    private BinaryTreeNode next;

    public BinaryTreeNode(int data) {
        this.data = data;
    }

    public BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right, BinaryTreeNode parent, BinaryTreeNode next) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.parent = parent;
        this.next = next;
    }



}
