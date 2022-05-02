package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
     BinaryNode root;

    public BinaryTree(){
        this.root = null;
    }

    // Preorder Traversal
    public void preorder(BinaryNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
    // Inorder traversal
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
    // Search
    public void search(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value == value){
                System.out.println("The value-" + value + " is found in Tree");
                return;
            }
            else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.left);
                }
            }
        }
        System.out.println("The value-" + value + " is not found in Tree");
    }

    // Insert method
    public void insert(String value){
        BinaryNode newnode = new BinaryNode();
        newnode.value = value;
        if(root == null){
            root = newnode;
            System.out.println("inserted successfully");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.left == null){
                presentNode.left = newnode;
                System.out.println("inserted successfully");
                break;
            }else if(presentNode.right == null){
                presentNode.right = newnode;
                System.out.println("inserted successfully");
                break;
            }
            else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    // Get Deepest Node
    public BinaryNode getdeepestnode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    // Delete Deepest Node
    public void deletedeepestnode(){
        
    }

}
