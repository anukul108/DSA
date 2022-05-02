package Tree;

import java.util.Scanner;

public class BinarytreeByArray {
    int arr[];
    int lastusedindex;
    public BinarytreeByArray(int size){
        arr = new int[size + 1];
        lastusedindex = 0;
    }
    public void insert(int value){
        if(arr.length - 1 == lastusedindex){
            System.out.println("Array is full");
        }
        else{
            arr[lastusedindex + 1]  = value;
            lastusedindex++;
        }
    }

    // PREORDER TRAVERSAL
    public void traverse(int index){
        if(index > lastusedindex){
            return;
        }
        traverse(index * 2);
        traverse(index * 2 + 1);
    }

    // SEARCH
    public void search(int val,int startingindex){
        if(arr[startingindex] == val){
            System.out.println("element present in array");
            return;
        }
        if(startingindex >= lastusedindex){
            System.out.println("Not Present");
            return;
        }
        search(val, startingindex+1);
    }


}
