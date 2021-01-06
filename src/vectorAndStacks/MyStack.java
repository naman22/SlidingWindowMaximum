package vectorAndStacks;

import linkedList.generic.MyLinkList;

public class MyStack<E> {
    private MyLinkList<E> ll=new MyLinkList<>();
    void push(E e){
        ll.add(e);
    }
    E pop() throws Exception{
        if(ll.isEmpty()){
            throw new Exception("Popping From Empty Linked List");
        }
        return ll.removeLast();
    }
    E peek() throws Exception{
        if(ll.isEmpty()){
            throw new Exception("Peeking From Empty Linked List");
        }
        return ll.getLast();
    }
}
