package GFG_QUEST;

import java.util.Scanner;

public class Middle {
    Node head;
    int size;
    Middle(){
        this.size = 0;
    }

    public void insert(int val){
        Node newnode = new Node();
        newnode.data = val;
        if(head == null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
        size++;
    }

    public int middleelement(){
        int middle = size / 2;

        Node temp = head;
        if(size % 2 == 0){
            for(int i = 0; i < middle; i++){
                temp = temp.next;
            }
        }
        else{
            for(int  i = 0; i < middle; i++){
                temp = temp.next;
            }
            //return temp.data;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Middle obj = new Middle();
//        obj.insert(1);
//        obj.insert(2);
//        obj.insert(3);
//        obj.insert(4);
//        obj.insert(5);
//        obj.insert(6);
        for(int i = 0; i < 5; i++){
            obj.insert(sc.nextInt());
        }
        System.out.println(obj.middleelement());
    }
}

//class Main{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        Middle obj = new Middle();
////        obj.insert(1);
////        obj.insert(2);
////        obj.insert(3);
////        obj.insert(4);
////        obj.insert(5);
////        obj.insert(6);
//        for(int i = 0; i < 5; i++){
//            obj.insert(sc.nextInt());
//        }
//        System.out.println(obj.middleelement());
//    }
//}
