//
// *********************************Creation of Singly Linked List**************************************
//
//
//
//
//
public class SLL{
    public static void main(String[] args){
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
        System.out.println(sll.head.value);
        System.out.println(sll.head.next);
    }
}

class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    
    public Node createSinglyLinkedList(int nodeValue){
        head=new Node();
        Node node=new Node();
        node.value=nodeValue;
        node.next=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }
}
class Node{
    public int value;
    public Node next;
}