package GenericLL;

public class GenericLinkedList<T> {
    Node<T> head;

    int size ;
    GenericLinkedList() {
        this.size = 0;
    }
    // Insert method
    public void insert(T value){
        size++;
        Node<T> newnode = new Node<>();
        newnode.data = value;

        if(head == null){
            head = newnode;
        }
        else{
            Node<T> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    // Check Value
    public void checkvalue(T value){
        Node<T> temp = head;
        int flag = 0;
        while(temp != null){
            if(temp.data == value) {
                flag++;
            }
        }
        if(flag == 1){
            System.out.println("LinkedList contains the value ");
        }
        else{
            System.out.println("LinkedList does not contains the value ");
        }
    }

    public void add(T value){
        Node<T> newnode = new Node<>();
        newnode.data = value;
        Node<T> temp = head;
        while(temp != null){
            if(temp.data == value){
                break;
            }
            else if(temp.data == value){
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newnode;
            }
            temp = temp.next;
        }
    }

    //Remove Method
    public void remove(T value){

    }


    // Display Method
    public void display(){
        Node<T> temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
