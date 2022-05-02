package GFG_QUEST;

public class Removemiddle {
    Node head;
    int size ;
    Removemiddle(){
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

    public void removemiddle(){
        int middle = size / 2;

        Node temp = head;
        if(size % 2 == 0){
            for(int i = 0; i < middle - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        else{
            for(int  i = 0; i < middle - 1; i++){
                temp = temp.next;
            }
            //return temp.data;
            temp.next = temp.next.next;
        }
        size--;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
