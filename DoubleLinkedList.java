public class DoubleLinkedList{

   Node head;

   public class Node{
       String data;
       Node next;
       Node previous;

       Node(String d){
           this.next=null;
           this.previous=null;
           this.data=d;
       }

   }
   public void addFirstNode(String data){
       Node newnode=new Node(data);
       newnode.next=head;
       
       if(head!=null)
       {
        head.previous=newnode;
       }
       
       
       head=newnode;


   }
   public void printDoubleLinkedList()
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


   public void printReverDoubleLinkedList()
   {
        Node tail=null;
      
       Node currentnode=head;
       
       while(currentnode!=null){
           System.out.print(currentnode.data+"-->");
           tail=currentnode;
           currentnode=currentnode.next;
       }
       System.out.println("eND");
       System.out.println("Print Node in reverse Direction");
       while(tail!=null){
        System.out.print(tail.data+"-->");
        tail=tail.previous;
       }
       System.out.println("END");
   }




    public static void main(String[] args) throws Exception {

        System.out.println(" Double LinkedList, Baby!");
        DoubleLinkedList doublelinkedlist=new DoubleLinkedList();
        doublelinkedlist.addFirstNode("FirstName");
        doublelinkedlist.addFirstNode("is");
        doublelinkedlist.addFirstNode("Ashish");
        //doublelinkedlist.printDoubleLinkedList();
        doublelinkedlist.printReverDoubleLinkedList();


    }

}