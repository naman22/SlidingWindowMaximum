package linkedList.nonGeneric;

//Creating just linkedList of integer values with only reference of next node (not reference of previous node)

public class MyLinkedList {
    Node head;
    void add(int data){
        // Add this node to the last of our Linkedlist
        Node toAdd=new Node(data);
        //method of traversal in LinkedList remains the same only
        if(isEmpty()){
            head=toAdd;
            return;
        }
        Node temp = head;
        //Loop to reach the last node
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=toAdd;
    }
    boolean isEmpty(){
        return head==null;
    }
    static class Node{
        int data;
        Node next; //reference next node
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    //Printing our linkedList
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
