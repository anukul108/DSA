package Tree;

import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 if you want to use BinaryTree by using array");
        System.out.println("Enter the 2 if you want to use BinaryTree by using LinkedList");
        int val;
        val = sc.nextInt();
        if(val == 1){
            int size;
            System.out.println("Enter the size of array");
            size = sc.nextInt();
            BinarytreeByArray obj1 = new BinarytreeByArray(size);
            System.out.println("enter 1 for insert");
            System.out.println("enter 2 for search");
            System.out.println("enter 3 for delete");
            System.out.println("enter 4 for traversal");

        }
        if(val == 2){

        }
    }
}
