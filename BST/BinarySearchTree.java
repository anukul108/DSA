package BST;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BinaryNode root;
    BinarySearchTree(){
        root = null;
    }

    // Insert Method
    private BinaryNode insert(BinaryNode node, int value){
        if(node == null){
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("The value inserted successfully");
            return newNode;
        }
        else if(value <= node.value){
            node.left = insert(node.left, value);
        }
        else{
            node.right = insert(node.right, value);
        }
        return node;
    }

    void insert(int value){
       root = insert(root, value);
    }

    // Preorder Traversal
    public void preOrder(BinaryNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void Inorder(BinaryNode node){
        if(node == null){
            return;
        }
        Inorder(node.left);
        System.out.print(node.value + " ");
        Inorder(node.right);
    }
    // Postorder traversal
    public void Postorder(BinaryNode node){
        if(node == null){
            return;
        }
        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.value + " ");
    }

    // Levelorder
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
    BinaryNode search(BinaryNode node, int value){
        if(node == null){
            System.out.println("value: " + value + " not found in BST");
            return null;
        }
        else if(node.value == value){
            System.out.println("value: " + value + " found in BST");
            return node;
        }
        else if(value < node.value){
            return search(node.left, value);
        }
        else{
            return search(node.right, value);
        }
    }

    // Minimum Method
    public static BinaryNode minimumnnode(BinaryNode root){
        if(root.left == null){
            return root;
        }
        else{
            return minimumnnode(root.left);
        }
    }

    // Delete Method
    public BinaryNode deleteNode(BinaryNode root, int value){
        if(root == null){
            System.out.println("value not found in BST");
            return null;
        }
        if(value < root.value){
            root.left = deleteNode(root.left, value);
        }
        else if(value > root.value){
            root.right = deleteNode(root.right, value);
        }
        else{
            if(root.left != null && root.right != null){
                BinaryNode temp = root;
                BinaryNode minrightNode = minimumnnode(root.right);
                root.value = minrightNode.value;
                root.right = deleteNode(root.right, minrightNode.value);
            }
            else if(root.left != null){
                root = root.left;
            }
            else if(root.right != null){
                root = root.right;
            }
            else{
                root = null;
            }
        }
        return root;

    }
}
