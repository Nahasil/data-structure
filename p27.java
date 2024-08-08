import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }


    public void prepend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }


    public void deleteNode(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                if (current == head) {
                    head = current.next;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Node with data " + key + " not found.");
    }


    public void traverseForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void traverseBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

public class p27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        while (true) {
            System.out.println("\nDoubly Linked List Menu");
            System.out.println("1. Append");
            System.out.println("2. Prepend");
            System.out.println("3. Delete");
            System.out.println("4. Traverse Forward");
            System.out.println("5. Traverse Backward");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to append: ");
                    int appendData = scanner.nextInt();
                    dll.append(appendData);
                    break;
                case 2:
                    System.out.print("Enter data to prepend: ");
                    int prependData = scanner.nextInt();
                    dll.prepend(prependData);
                    break;
                case 3:
                    System.out.print("Enter data to delete: ");
                    int deleteData = scanner.nextInt();
                    dll.deleteNode(deleteData);
                    break;
                case 4:
                    System.out.println("Traversing forward:");
                    dll.traverseForward();
                    break;
                case 5:
                    System.out.println("Traversing backward:");
                    dll.traverseBackward();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
