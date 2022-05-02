package BST;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree newBST = new BinarySearchTree();
//        BinaryNode n1 = new BinaryNode();
//        n1.value = 70;
        newBST.insert(70);
//        newBST.root = n1;
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);
//        newBST.deleteNode(newBST.root, 40);
        newBST.levelOrder();
        System.out.println();
        newBST.preOrder(newBST.root);
        System.out.println();
        newBST.Inorder(newBST.root);
        System.out.println();
        newBST.Postorder(newBST.root);

    }
}
