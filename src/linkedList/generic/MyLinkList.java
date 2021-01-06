package linkedList.generic;

//Creating just linkedList of integer values with only reference of next node (not reference of previous node)

public class MyLinkList<E> {
    Node<E> head;
    public void add(E data){
        // Add this node to the last of our Linkedlist
        Node<E> toAdd=new Node<>(data);
        //method of traversal in LinkedList remains the same only
        if(isEmpty()){
            head=toAdd;
            return;
        }
        Node<E> temp = head;
        //Loop to reach the last node
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=toAdd;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public static class Node<E>{
        public E data;
        public Node<E> next; //reference next node
        public Node(E data){
            this.data=data;
            next=null;
        }
    }
    public E removeLast() throws Exception{
        Node<E> temp = head;
        if(temp==null){
            throw new Exception("Linked List is empty");
        }
        if(temp.next==null){
            Node <E> toRemove = head;
            head = null;
            return toRemove.data;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        Node <E>toRemove = temp.next;
        temp.next=null;
        return toRemove.data;
    }
    //Printing our linkedList
    void print(){
        Node<E> temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public E getLast() throws Exception{
        Node<E> temp = head;
        if(temp==null){
            throw new Exception("Linked List is empty cannot peek ");
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp.data;
    }
}
