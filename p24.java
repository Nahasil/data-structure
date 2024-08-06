import java.util.Scanner;
public class p24{
    class CNode{
        int data;
        CNode next;
        CNode(int data){
            this.data=data;
        }
    }
    CNode head=null;
    CNode tail=null
     void addNode(int data){
        CNode newNode=new CNode(data);
        if(head==null) {
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
            tail.next=newNode
        }
    }
    
    void display(){
        CNode current=head;
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
        p24 c=new p24();
        int a,val;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.of values insert into linked list:");
        a=s.nextInt();
        
        System.out.println("Enter the Values to add LL");
        for(int i=0;i<a;i++){
            val=s.nextInt();
            c.addNode(val);
        }
        
        System.out.println("The Elements of  Linked list:");
        c.display();

        System.out.println("Enter the data to add Linked list ");
        int data=s.nextInt();
        c.addNode(data);
        System.out.println("After the insertion of Linked list:");
        c.display();
    }
}
