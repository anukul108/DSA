package GFG_QUEST;

public class Palindrome {
    Node head;
    int size;
    Palindrome(){
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

    
}
