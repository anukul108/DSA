package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

class queuethrulinkedlist{
    node front;
    node rear;
    static class node{
        int data;
        node next;
        node(int d){
            data=d;
            next=null;
        }
    }
    public void enqueue(int data){
        node nnd=new node(data);
        if(front==null && rear==null){
            front=rear=nnd;
        }
        else{
            rear.next=nnd;
            rear=nnd;
        }
    }
    public void dequeue(){
        if(front==null){
            System.out.println("queue underflow");
        }
        else{
            System.out.println(front.data);
            front=front.next;
        }
    }

    public boolean isEmpty(){
        if(front==rear.next || front==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void display(){
        node temp=front;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class Graph {
    static Map<Integer,linkedlist> graph;
    Graph(){
        graph=new HashMap<>();
    }
    public void add(int v1,int v2,boolean isbidirectional){
        linkedlist v1neighbour=graph.get(v1);
        v1neighbour.addAtStart(v2);
        graph.put(v1,v1neighbour);
        if(isbidirectional){
            linkedlist v2neighbour=graph.get(v2);
            v2neighbour.addAtStart(v1);
            graph.put(v2,v2neighbour);
        }
    }
    public void display(){
        for (Map.Entry<Integer,linkedlist> res:graph.entrySet()) {
            System.out.print(res.getKey()+"-->");
            res.getValue().displayll();
            System.out.println();
        }
        System.out.println();
    }

    public void bfstraversal(int source){
        queuethrulinkedlist bfs=new queuethrulinkedlist();
        bfs.enqueue(source);
        Set<Integer> vis=new HashSet<>();
        vis.add(source);
        while (!bfs.isEmpty()){
            bfs.dequeue();
            linkedlist lls=graph.get(source);
//            for (int res:lls) {
//                if(!vis.contains(res)){
//                    vis.add(res);
//                    bfs.enqueue(res);
//                }
//            }
            linkedlist.node temp=lls.head;
            System.out.println(temp.data);
            while (temp!=null){
                if(!vis.contains(temp.data)){
                    vis.add(temp.data);
                    bfs.enqueue(temp.data);
                }
                temp=temp.next;
            }
        }
    }


//    public void bfstraversal(int source){
//        Queue<Integer> bfs=new LinkedList<>();
//        bfs.add(source);
//        Set<Integer> vis=new HashSet<>();
//        vis.add(source);
//        while (!bfs.isEmpty()){
//            int front=bfs.poll();
//            System.out.println(front);
//            linkedlist neighbour=graph.get(front);
//            linkedlist.node temp=neighbour.head;
//            while (temp!=null){
//                if(!vis.contains(temp.data)){
//                    vis.add(temp.data);
//                    bfs.add(temp.data);
//                }
//                temp=temp.next;
//            }
//        }
//    }

    public static void main(String[] args) {

        Graph obj=new Graph();
        linkedlist lls1=new linkedlist();
        lls1.addAtStart(2);
        lls1.addAtStart(3);
        linkedlist lls2=new linkedlist();
        lls2.addAtStart(1);
        lls2.addAtStart(4);
        linkedlist lls3=new linkedlist();
        lls3.addAtStart(4);
        linkedlist lls4=new linkedlist();
        lls4.addAtStart(5);
        lls4.addAtStart(2);
        lls4.addAtStart(3);
        linkedlist lls5=new linkedlist();
        lls5.addAtStart(4);
        graph.put(1,lls1);
        graph.put(2,lls2);
        graph.put(3,lls3);
        graph.put(4,lls4);
        graph.put(5,lls5);
        obj.display();
        obj.add(1,5,true);
        obj.add(3,1,false);
        obj.display();
//        obj.bfstraversal(1);
    }
}
