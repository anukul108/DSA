package AVL_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {
    BinaryNode root;

    AVL() {
        root = null;
    }

    // PreOrder Traversal
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Inorder Traversal
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);


    }

    // PostOrder Traversal
    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // Level Order

    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    // Search Method
    BinaryNode search(BinaryNode node, int value) {
        if (node == null ) {
            System.out.println("Value: "+ value+ " not found in AVL");
            return null;
        } else if (node.value == value) {
            System.out.println("Value: "+ value+ " found in AVL");
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    // getHeight
    public int getHeight(BinaryNode node){
        if(node == null){
            return 0;
        }
        return node.height;
    }

    // RotateRight
    private BinaryNode rotateright(BinaryNode disbalanceNode){
        BinaryNode newroot = disbalanceNode.left;
        disbalanceNode.left = disbalanceNode.left.right;
        newroot.right = disbalanceNode;
        disbalanceNode.height = 1 + Math.max(getHeight(disbalanceNode.left), getHeight(disbalanceNode.right));
        newroot.height = 1 + Math.max(getHeight(newroot.left), getHeight(newroot.right));
        return newroot;
    }

    // RotateLeft
    private BinaryNode rotateleft(BinaryNode disbalanceNode){
        BinaryNode newroot = disbalanceNode.right;
        disbalanceNode.right = disbalanceNode.right.left;
        newroot.left = disbalanceNode;
        disbalanceNode.height = 1 + Math.max(getHeight(disbalanceNode.left), getHeight(disbalanceNode.right));
        newroot.height = 1 + Math.max(getHeight(newroot.left), getHeight(newroot.right));
        return newroot;
    }

    // getbalance
    public int getbalance(BinaryNode node){
        if(node == null){
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    // insertNode Method
    private BinaryNode insertNode(BinaryNode node, int nodevalue){
        if( node == null){
            BinaryNode newNode = new BinaryNode();
            newNode.value = nodevalue;
            newNode.height = 1;
            return newNode;
        }
        else if(nodevalue < node.value){
            node.left = insertNode(node.left, nodevalue);
        }
        else{
            node.right = insertNode(node.right, nodevalue);
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getbalance(node);

        if(balance > 1 && nodevalue < node.left.value){
            return rotateright(node);
        }
        if(balance > 1 && nodevalue > node.left.value){
            node.left = rotateleft(node.left);
            return rotateright(node);
        }
        if(balance < -1 && nodevalue > node.right.value){
            return rotateleft(node);
        }
        if(balance < -1 && nodevalue > node.right.value){
            node.right = rotateright(node.right);
            return rotateleft(node);
        }

        return node;
    }

    public void insert(int value){
        root = insertNode(root, value);
    }

    // minimum Node
    public static BinaryNode minimumNode(BinaryNode root){
        if(root.left == null){
            return root;
        }
        return minimumNode(root.left);
    }



    // Delete node
    public BinaryNode deleteNode(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value not found in AVL");
            return node;
        }
        if (value < node.value) {
            node.left = deleteNode(node.left, value);
        } else if (value > node.value) {
            node.right = deleteNode(node.right, value);
        } else {
            if (node.left != null && node.right != null) {
                BinaryNode temp = node;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                node.value = minNodeForRight.value;
                node.right = deleteNode(node.right, minNodeForRight.value);
            } else if (node.left != null) {
                node = node.left;
            } else if (node.right != null) {
                node = node.right;
            } else {
                node = null;
            }
        }
        // Case 2 - rotation required

        // System.out.println("1");
        // System.out.println(previous.value);

        // node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getbalance(node);

        if (balance > 1 && getbalance(node.left) >= 0) {
            return rotateright(node);
        }
        if (balance > 1 && getbalance(node.left) < 0) {
            node.left = rotateleft(node.left);
            return rotateright(node);
        }
        if (balance < -1 && getbalance(node.right) <= 0) {
            return rotateleft(node);
        }

        if (balance < -1 && getbalance(node.right) > 0) {
            node.right = rotateright(node.right);
            return rotateleft(node);
        }

        return node;

    }

    public void delete(int value) {
        root = deleteNode(root, value);
    }

    public void deleteAVL() {
        root = null;
    }
}
