public class LinkedList {
    Node head;
    
    public  static class Node{
        String data;
        Node next;
        Node(String d)
        {
            this.data=d;
            this.next=null;
        }
    }
    public void delteFirstNode(){
        if(head==null){
            System.out.print("List is empty");
            return;

        }
        head=head.next;

    }
    public void deleteLastNode(){
        if(head==null){

            System.out.println("List is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondlastnode=head;
        Node lastnode=head.next;//head.next=null -> lastnode=null

        while(lastnode.next!=null){//null.next=null
            secondlastnode=secondlastnode.next;
            lastnode=lastnode.next;


        }
        secondlastnode.next=null;
        


    }

    public void addFirstNode(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }
    public void addLastNode(String data){
        Node newnode=new Node(data);
        Node currentnode=head;
        if(head==null){
            head=newnode;
            return;
        }
        while(currentnode.next!=null){
            currentnode=currentnode.next;
        }
        currentnode.next=newnode;

    }
    public void printList()
    {
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        Node currentnode=head;
        while(currentnode!=null){
            System.out.print(currentnode.data+"-->");
            currentnode=currentnode.next;
        }
        System.out.println("NULL");
    }




    public static void main(String[] args) throws Exception {
        System.out.println("LinkedList, Baby!");
        LinkedList l1=new LinkedList();
        l1.addFirstNode("is");
        l1.addFirstNode("This");
        l1.printList();
        l1.addLastNode("LinkedList");
        l1.printList();
        l1.deleteLastNode();
        l1.printList();
    }

}
