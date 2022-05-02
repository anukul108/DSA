package Graph;

class linkedlist{
    node head;
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public void InsertAfter(int pos,int data){
        node temp=head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        temp=head;
        if(pos==1){
            addAtStart(data);
        }
        else if(pos==c+1){
            addAtLast(data);
        }
        else if(pos>c+1){
            System.out.println("Position is invalid");
        }
        else{
            node nnd=new node(data);
            int i=2;
            while (i<pos){
                temp=temp.next;
                i++;
            }
            nnd.next=temp.next;
            temp.next=nnd;
        }
    }
    public void addAtStart(int data){
//        if(head==null){
//            System.out.println("List is empty");
//        }
        node nnd=new node(data);
        nnd.next=head;
        head=nnd;
    }
    public void addAtLast(int data){
        if(head==null){
            System.out.println("List is empty");
        }
        node nnd=new node(data);
        node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=nnd;
    }
    public void displayll(){
        if(head==null){
            System.out.println("List is empty");
        }
        node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void delete(int pos){
        node temp=head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        temp=head;
        if(pos>c){
            System.out.println("No node at here");
        }
        else{
            if(pos==1){
                head=head.next;
            }
            else{
                int i=2;
                while(i<pos) {
                    temp = temp.next;
                    i++;
                }
                temp.next=temp.next.next;
            }
        }
    }
}