package GFG_QUEST;

public class RemoveDuplicates {
    Node head;
    int size ;
    RemoveDuplicates(){
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

    public void removeduplicates(){
        Node temp = head;
        while(temp.next != null){
            if(temp.data == temp.next.data ){
                temp.next =  temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        RemoveDuplicates obj = new RemoveDuplicates();
        //obj.insert(1);
        obj.insert(2);
        obj.insert(2);
        obj.insert(2);
//        obj.insert(3);
//        obj.insert(4);
//        obj.insert(5);
//        obj.insert(5);
//        obj.insert(5);
        obj.removeduplicates();
        obj.display();
    }
}
