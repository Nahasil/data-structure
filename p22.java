import java.util.Scanner;
public class p22{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head=null;
    Node tail=null;
    void addNode(int data){
        Node newNode=new Node(data);
        if(head==null) {
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    //void addNodeBeginning(int data){
    //    Node newNode=new Node(data);
    //    if(head==null){
    //        head=newNode;
    //    }else{
    //        Node temp=head;
    //        head=newNode;
    //        head.next=temp;
    //    }
    //}

    void deleteNode(int data){
        if(head==null) {
            System.out.println("list is empty....");
            return;
        }
        if(head.data==data){
            head=head.next;
            return;
        }else{
            Node current=head;
            while(current!=null){
                if(current.next.data==data){
                    current.next=current.next.next;
                    return;
                }
                current=current.next;
            }
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
        p22 c=new p22();
        int a,val;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.of values of linked list:");
        a=s.nextInt();
        
        System.out.println("Enter the Values to add LL");
        for(int i=0;i<a;i++){
            val=s.nextInt();
            c.addNode(val);
        }

        c.display();

        
        while(true){
            System.out.println("select options:/n1.add/n2.delete/n3.traverse/n4.exit");
            int ch=s.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter the Values to add LL");
                val=s.nextInt();
                c.addNode(val);
                c.display();
                break;
                case 2:
                System.out.println("Enter the data to delete from list");
                val=s.nextInt();
                c.deleteNode(val);
                c.display();
                break;
                case 3:
                c.display();
                break;
                case 4:System.exit(0);
                break;
                default:System.out.println("Wrong choice");
            }
        }
    }
}
