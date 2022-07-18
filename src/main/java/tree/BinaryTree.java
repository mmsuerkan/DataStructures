package tree;

public class BinaryTree {

    public BinaryTreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(Integer data) {
        this.root = new BinaryTreeNode(data);
    }


    public void insert(int nodeData) {
        BinaryTreeNode newNode = new BinaryTreeNode(nodeData);
        if(root == null){
            this.root = newNode;
        }else {
            BinaryTreeNode parent = null;
            BinaryTreeNode temp = root;

            while (temp != null){
                parent = temp;
                if(nodeData <= temp.data){
                    temp = temp.left;
                }else {
                    temp = temp.right;
                }
                if (nodeData <= parent.data) {
                    parent.left = newNode;
                } else {
                    parent.right = newNode;
                }

            }
        }


    }
}
