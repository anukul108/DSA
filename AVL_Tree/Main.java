package AVL_Tree;

public class Main {
    public static  void main(String[] args){
        AVL avltree = new AVL();
        avltree.insert(5);
        avltree.insert(10);
        avltree.insert(15);
        avltree.insert(20);
        avltree.levelOrder();
    }
}
