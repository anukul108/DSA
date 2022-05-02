package GFG_QUEST;

public class Add1 {
    Node head;
    int size;

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

    public Node add1(Node head){
        Node temp = head;
        int carry = 1, sum = 0;

        while(head != null){
            sum = head.data + carry;
            if(sum >= 10){
                sum = sum % 10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            head.data = sum;
            temp = head;
            head = head.next;
        }
        if(carry > 0){
            //temp.next = insert(carry);
        }
        return temp;
    }
    static Node reverse(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public Node addOne(Node head)
    {
        // Reverse linked list
        head = reverse(head);

        // Add one from left to right of reversed
        // list
        head = add1(head);

        // Reverse the modified list
        return reverse(head);
    }
}
