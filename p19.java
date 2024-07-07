import java.util.Scanner;
public class p19{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head=null;
    Node tail=null;
    //void addNode(int data){
    //    Node newNode=new Node(data);
    //    if(head==null) {
    //        head=newNode;
    //        tail=newNode;
    //    }else{
    //        tail.next=newNode;
    //        tail=newNode;
    //    }
    //}
    void addNodeBeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            head=newNode;
            head.next=temp;
        }
    }
    void display(){
        Node current=head;
        if(head==null){
            System.out.println("list is empty....");
            return;
        }
        System.out.println("Node of Singly Linked list:");
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        p19 c=new p19();
        int a,val;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.of values of linked list:");
        a=s.nextInt();
        
        System.out.println("Enter the Values to add LL");
        for(int i=0;i<a;i++){
            val=s.nextInt();
            c.addNodeBeginning(val);
        }

        
        c.display();
    }
}
