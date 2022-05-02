//package Tree;
//
//import java.util.Scanner;
//
//public class GenericBinaryTree<T> {
//    T arr[];
//    T lastusedindex;
//    public GenericBinaryTree(T size){
//        arr = new int[size + 1];
//        lastusedindex = 0;
//    }
//    public void insert(int value){
//        if(arr.length - 1 == lastusedindex){
//            System.out.println("Array is full");
//        }
//        else{
//            arr[lastusedindex + 1]  = value;
//            lastusedindex++;
//        }
//    }
//
//    // PREORDER TRAVERSAL
//    public void traverse(int index){
//        if(index > lastusedindex){
//            return;
//        }
//        traverse(index * 2);
//        traverse(index * 2 + 1);
//    }
//
//    // SEARCH
//    public void search(int val,int startingindex){
//        if(arr[startingindex] == val){
//            System.out.println("element present in array");
//            return;
//        }
//        if(startingindex >= lastusedindex){
//            System.out.println("Not Present");
//            return;
//        }
//        search(val, startingindex+1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        BinarytreeByArray obj = new BinarytreeByArray(6);
////        int arr1[] = {1,2,3,4,5,6};
//        obj.insert(1);
//        obj.insert(2);
//        obj.insert(3);
//        obj.insert(4);
//        obj.insert(5);
//        obj.insert(6);
//        obj.search(2, 1);
//        obj.search(10,1);
//    }
//}
//
//
