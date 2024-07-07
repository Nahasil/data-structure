import java.util.Scanner;
public class p20{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head=null;
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
        p20 c=new p20();
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

        
        while(true){
            System.out.println("select options:/n1.add/n2.exit");
            int ch=s.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter the Values to add LL");
                val=s.nextInt();
                c.addNodeBeginning(val);
                c.display();
                break;
                case 2:System.exit(0);
                break;
                default:System.out.println("Wrong choice");
            }
        }
    }
}
